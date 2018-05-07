package by.htp.library.utils;

import java.util.ResourceBundle;

public class PropertiesManager {
	private static final String PROPERTIES_EX = "credentials";
	private static ResourceBundle myResources = ResourceBundle.getBundle(PROPERTIES_EX);

	public static String getProperty(String key) {
		return myResources.getString(key);
	}

}
