package config

import com.kms.katalon.core.annotation.Keyword
import java.util.concurrent.ConcurrentHashMap
import org.apache.poi.ss.usermodel.*
import org.apache.poi.xssf.usermodel.XSSFWorkbook
import java.nio.file.Files
import java.nio.file.Paths

class TestDataManager {
	// Cache to store loaded test data for reusability
	private static ConcurrentHashMap<String, List<Map<String, String>>> testDataCache = new ConcurrentHashMap<>()

	@Keyword
	static void loadTestData(String fileName, String sheetName) {
		String cacheKey = "${fileName}_${sheetName}"

		// Skip loading if data is already cached
		if (!testDataCache.containsKey(cacheKey)) {
			// Retrieve the dataPath from config.properties
			String dataPath = ConfigurationManager.getProperty("testdata.${fileName}")
			if (!dataPath) {
				throw new RuntimeException("No configuration found for testdata.${fileName}")
			}

			// Load the workbook and the specified sheet
			InputStream fis = Files.newInputStream(Paths.get(dataPath))
			Workbook workbook = new XSSFWorkbook(fis)
			Sheet sheet = workbook.getSheet(sheetName)
			if (sheet == null) {
				workbook.close()
				throw new RuntimeException("Sheet '${sheetName}' not found in file: ${dataPath}")
			}

			// Extract data from the sheet
			DataFormatter dataFormatter = new DataFormatter()
			Row headerRow = sheet.getRow(0)
			if (headerRow == null) {
				workbook.close()
				throw new RuntimeException("No header row found in sheet '${sheetName}'")
			}

			// Read column headers
			List<String> columnNames = []
			for (Cell headerCell : headerRow) {
				columnNames.add(dataFormatter.formatCellValue(headerCell).trim())
			}

			// Read data rows
			List<Map<String, String>> allTestData = []
			for (int i = 1; i <= sheet.getLastRowNum(); i++) {
				Row dataRow = sheet.getRow(i)
				if (dataRow == null) {
					continue // Skip empty rows
				}

				Map<String, String> rowData = [:]
				for (int colIndex = 0; colIndex < columnNames.size(); colIndex++) {
					Cell cell = dataRow.getCell(colIndex, Row.MissingCellPolicy.RETURN_BLANK_AS_NULL)
					String cellValue = cell != null ? dataFormatter.formatCellValue(cell).trim() : ""
					rowData[columnNames[colIndex]] = cellValue
				}

				allTestData.add(rowData)
			}

			// Cache the data
			testDataCache.put(cacheKey, allTestData)

			workbook.close()
			fis.close()
		}
	}

	@Keyword
	static Map<String, String> getTestCaseData(String testCaseId, String fileName, String sheetName) {
		loadTestData(fileName, sheetName)
		String cacheKey = "${fileName}_${sheetName}"
		List<Map<String, String>> allTestData = testDataCache.get(cacheKey)

		Map<String, String> testCaseData = allTestData.find { it['TestCaseID'] == testCaseId }
		if (testCaseData == null) {
			throw new RuntimeException("Test case data not found for ID: ${testCaseId} in file: ${fileName}, sheet: ${sheetName}")
		}

		return testCaseData
	}

	@Keyword
	static Map<String, String> getAPITestData(String testCaseId, String sheetName) {
		return getTestCaseData(testCaseId, "APITestData", sheetName)
	}

	@Keyword
	static Map<String, String> getWebTestData(String testCaseId, String sheetName) {
		return getTestCaseData(testCaseId, "WebTestData", sheetName)
	}
}