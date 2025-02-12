package api

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import config.ConfigurationManager
import groovy.json.JsonOutput
import com.kms.katalon.core.testobject.impl.HttpTextBodyContent
import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty
import internal.GlobalVariable as GlobalVariable

class APIRequestHandler {

	static ResponseObject sendRequest(String endpoint, Map<String, Object> params, String method = 'POST') {
		RequestObject request = new RequestObject()
		String baseUrl = ConfigurationManager.getBaseUrl('api')
		String fullUrl = baseUrl + (endpoint.startsWith("/") ? "" : "/") + endpoint
		KeywordLogger log = new KeywordLogger()
		String fullUrl1 = baseUrl.concat(endpoint)
		if(params==null) {
			request.setRestUrl(fullUrl1)
		}else {
			request.setRestUrl(fullUrl)
		}
		request.setRestRequestMethod(method.toUpperCase())

		// Set HTTP headers
		List<TestObjectProperty> headers = new ArrayList<>()
		headers.add(new TestObjectProperty('Content-Type', ConditionType.EQUALS, 'application/json'))
		String accessToken = GlobalVariable.AuthToken
		headers.add(new TestObjectProperty('Authorization', ConditionType.EQUALS, accessToken))
		request.setHttpHeaderProperties(headers)

		// Handling request body or query parameters based on the HTTP method
		switch (method.toUpperCase()) {
			case 'GET':
				if (params==null) {
					request.setRestUrl(fullUrl1)
				}else if (params) {
					String queryString = params.collect { k, v -> "$k=${URLEncoder.encode(v.toString(), 'UTF-8')}" }.join('&')
					request.setRestUrl(fullUrl + '?' + queryString)
				}
				break
			case 'POST':
				String requestBody = JsonOutput.toJson(params)
				request.setBodyContent(new HttpTextBodyContent(requestBody, 'application/json', 'UTF-8'))
			case 'PUT':
				String requestBody = JsonOutput.toJson(params)
				request.setBodyContent(new HttpTextBodyContent(requestBody, 'application/json', 'UTF-8'))
				break
			case 'DELETE':
			// For DELETE, we currently don't have a body
				if (params==null) {
					request.setRestUrl(fullUrl1)
				}else if (params) {
					String queryString = params.collect { k, v -> "$k=${URLEncoder.encode(v.toString(), 'UTF-8')}" }.join('&')
					request.setRestUrl(fullUrl + '?' + queryString)
				}
				break
			default:
				throw new IllegalArgumentException("Unsupported HTTP method: $method")
		}

		ResponseObject response = WS.sendRequest(request)
		return response
	}
}