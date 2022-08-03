package org.tyss.genericUtilty;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/**
 * This class contains java reusable methods
 * @author admin
 *
 */
public final class JavaUtility {
/**
 * This method is used to generate the Random Number with in limit	
 */
public int getRandomNumber(int limit)
{
	return new Random().nextInt(limit);
}

/**
 * This method is used to generate the Random Number with in 1000	
 */
public int getRandomNumber()
{
	return new Random().nextInt(1000);
}

/**
 * This method is used to convert the string type into long data type	
 */
public long convertStringToLong(String stringData)	
{
		return 	Long.parseLong(stringData);
}
/**
 * This method is used to 	print the value in console
 */
public void printStatement(String value)
{
	System.out.println(value);
}
/**
 * This method is used to split the string based on strategy
 */
public String[] splitString(String value,String strategy)
{
	return value.split(strategy);

}
/**
 * This method is used to get current date in specified strategy
 */
public String getCurrentDate(String strategy)
{
	return new SimpleDateFormat(strategy).format(new Date());
}
/**
 * This method is used to upload a file
 * @param filePath
 */
public void uploadFile(String filePath)
{
	StringSelection path=new StringSelection(filePath);
    Clipboard clipBoard=Toolkit.getDefaultToolkit().getSystemClipboard();
    clipBoard.setContents(path, null);
    Robot robot=null;
	try {
		robot = new Robot();
	} catch (AWTException e) {
		e.printStackTrace();
	}
	robot.keyPress(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_V);
	robot.keyRelease(KeyEvent.VK_CONTROL);
	robot.keyRelease(KeyEvent.VK_V);
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.keyRelease(KeyEvent.VK_ENTER);
}
}

