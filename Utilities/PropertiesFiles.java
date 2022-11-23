package Utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesFiles {
	
	private static Properties configFile; // null
	
	static {
	try {
		
		String filePath = "src/test/resources/propertiesFiles/Ant.properties";
		
		FileInputStream input = new FileInputStream(filePath);
		 
		configFile = new Properties();
		configFile.load(input);
		
		input.close();
		
	}catch(Exception e) {
		
	}
	
}

    public static String getProperty(String keyName) {
        return configFile.getProperty(keyName);
    }
    
}