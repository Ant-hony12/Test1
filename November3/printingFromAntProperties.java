package November3;

import Utilities.PropertiesFiles;

public class printingFromAntProperties {

	public static void main(String[] args) {

		
		System.out.println(PropertiesFiles.getProperty("userName"));
		System.out.println(PropertiesFiles.getProperty("password"));
		System.out.println(PropertiesFiles.getProperty("address"));
		System.out.println(PropertiesFiles.getProperty("phoneNumber"));
		System.out.println(PropertiesFiles.getProperty("fullName"));
		System.out.println(PropertiesFiles.getProperty("browser"));
		System.out.println(PropertiesFiles.getProperty("browser1"));
		System.out.println(PropertiesFiles.getProperty("url"));
		
		

	}

}
