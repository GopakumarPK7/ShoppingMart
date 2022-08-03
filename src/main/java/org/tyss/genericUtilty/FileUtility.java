package org.tyss.genericUtilty;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public final class FileUtility 
{
	private Properties properties;
/**
 * This method is used to initialize property file
 * @param PropertyFilePath
 */
public void initializePropertyFile(String PropertyFilePath)
{
FileInputStream fis=null;
try {
	fis = new FileInputStream(PropertyFilePath);
} catch (FileNotFoundException e) {
	e.printStackTrace();
} 
properties=new Properties();
try {
	properties.load(fis);
} catch (IOException e) {
	e.printStackTrace();
}
}
/**
 * This method is used to fetch the data from property file
 * @param key
 * @return
 */
public String getDataFromProperties(String key)
{
return properties.getProperty(key);
}
}