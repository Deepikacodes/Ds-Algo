package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

	private static Properties prop;
	private final static String filePath = "./src/test/resources/config/config.properties";

	/**
	 * This method is used to load the properties from config.properties file
	 * 
	 * @return Properties prop object
	 */
	public static Properties init_properties() {
		prop = new Properties();
		try {
			FileInputStream ip = new FileInputStream(filePath);
			try {
				prop.load(ip);
				ip.close();
			} catch (IOException e) {

				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}

		return prop;
	}

	public static String getBrowser() {
		String browserName = prop.getProperty("Browser");
		if (browserName != null)
			return browserName;
		else
			throw new RuntimeException("Browser is  not specified in the Configuration.properties file.");
	}

	public static String getApplicationUrl() {
		String url = prop.getProperty("App_Url");
		if (url != null)
			return url;
		else
			throw new RuntimeException("App_Url not specified in the Configuration.properties file.");
	}
	
	public static String getHomePageUrl() {
		String url = prop.getProperty("Homepage_url");
		if (url != null)
			return url;
		else
			throw new RuntimeException("Homepage_url not specified in the Configuration.properties file.");
	}
	
	public static String getRegisterUrl() {
		String url = prop.getProperty("Register_url");
		if (url != null)
			return url;
		else
			throw new RuntimeException("Register_url not specified in the Configuration.properties file.");
	}
	
	public static String getSignInUrl() {
		String url = prop.getProperty("SignIn_url");
		if (url != null)
			return url;
		else
			throw new RuntimeException("SignIn_url not specified in the Configuration.properties file.");
	}
	
	public static String getExcelFilePath() {
		String excelFilePath = prop.getProperty("excelFilePath");
		if (excelFilePath != null)
			return excelFilePath;
		else
			throw new RuntimeException("ExcelPath is not specified in the Configuration.properties file.");
	}	
	
	public static String arrayUrl() {
		String url = prop.getProperty("Array");
		if (url != null)
			return url;
		else
			throw new RuntimeException("URL is not specified in the Configuration.properties file.");
	}
	
	public static String arraysInPythonUrl() {
		String url = prop.getProperty("ArraysInPython");
		if (url != null)
			return url;
		else
			throw new RuntimeException("URL is not specified in the Configuration.properties file.");
	}	
	
	public static String arraysUsingListUrl() {
		String url = prop.getProperty("ArraysUsingList");
		if (url != null)
			return url;
		else
			throw new RuntimeException("URL is not specified in the Configuration.properties file.");
	}	
	
	public static String basicOperationsUrl() {
		String url = prop.getProperty("BasicOperationsList");
		if (url != null)
			return url;
		else
			throw new RuntimeException("URL is not specified in the Configuration.properties file.");
	}
	
	public static String appOfArrayUrl() {
		String url = prop.getProperty("ApplicationsOfArray");
		if (url != null)
			return url;
		else
			throw new RuntimeException("URL is not specified in the Configuration.properties file.");
	}	
	public static String tryEditorUrl() {
		String url = prop.getProperty("TryEditor");
		if (url != null)
			return url;
		else
			throw new RuntimeException("URL is not specified in the Configuration.properties file.");
	}	
	public static String stackUrl() {
		String url = prop.getProperty("Stack");
		if (url != null)
			return url;
		else
			throw new RuntimeException("URL is not specified in the Configuration.properties file.");
	}
	public static String graphUrl() {
		String url = prop.getProperty("Graph");
		if (url != null)
			return url;
		else
			throw new RuntimeException("URL is not specified in the Configuration.properties file.");
	}
	public static String arrayPracQuestions() {
		String url = prop.getProperty("PracQuestions");
		if (url != null)
			return url;
		else
			throw new RuntimeException("URL is not specified in the Configuration.properties file.");
	}
}
