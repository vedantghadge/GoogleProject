package com.edusol.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import com.edusol.base.BrowserFactory;


public class PropertyFileReader {

	public static String readProperties(String key) {
		File file = new File(BrowserFactory.homepath + "/src/test/resources/Config.properties");
		FileInputStream fis;
		String value="";
		try {
			fis = new FileInputStream(file);
			Properties prop = new Properties();
			prop.load(fis);
			value=prop.getProperty(key);   //chrome

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return value;

	}
	public static String readPropertiesOR(String key) {
		File file = new File(BrowserFactory.homepath + "/src/test/resources/or.properties");
		FileInputStream fis;
		String value="";
		try {
			fis = new FileInputStream(file);
			Properties prop = new Properties();
			prop.load(fis);
			value=prop.getProperty(key);   //chrome

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return value;

	}
		

}
