package config

import java.util.Properties

class ConfigurationManager {
	private static Properties props = new Properties()
	static {
		File propertiesFile = new File('config.properties')
		props.load(new FileInputStream(propertiesFile))
	}
	static String getProperty(String key) {
		return props.getProperty(key)
	}
	static String getBaseUrl(String type) {
		return props.getProperty("${type}.baseUrl")
	}
	static String getUsername(String type) {
		return props.getProperty("${type}.username")
	}
	static String getPassword(String type) {
		return props.getProperty("${type}.password")
	}
}