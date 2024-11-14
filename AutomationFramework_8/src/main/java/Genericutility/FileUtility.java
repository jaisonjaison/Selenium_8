package Genericutility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileUtility {
	/**
	 * this method is used to read data from property file
	 * user must pass key this method returns value
	 * @param key
	 * @return
	 * @throws IOException
	 */
	public String getDataFromProperty(String key) throws IOException {
    FileInputStream fil=new FileInputStream("./src/test/resources/TestData/commondata.properties/");
	Properties pro=new Properties();
	pro.load(fil);
	return pro.getProperty(key);
	}

}
