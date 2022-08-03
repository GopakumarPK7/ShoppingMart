package org.shoppingmart.objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CommonPage
{
	WebDriver driver;
	public CommonPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//a[text()='Home']")
	private WebElement homeTab;
	@FindBy(xpath="//a[text()='Logout']")
	private WebElement logoutBtn;
	private String Categories="//a[@class='accordion-toggle collapsed']";
	private String categoryName="//a[@class='dropdown-toggle'and contains(.,'%S')]";
	
	/**
	 * This method used to convert from dynamic xpath to Webelement
	 * @param elementPartialxpath
	 * @param replaceData
	 * @return
	 */
	private WebElement convertFromDynamicXpathToWebElement(String elementPartialxpath,String replaceData)
	{
		String xpath=String.format(elementPartialxpath, replaceData);
		return driver.findElement(By.xpath(xpath));
	} 
	/**
	 * This method is used to return on specific category webelement to script
	 * @param replaceData
	 * @return 
	 * @return 
	 */
	public WebElement Category(String replaceData)
	{
		return convertFromDynamicXpathToWebElement(categoryName,replaceData);
	}
	/**
	 * This method is used to click on specific category from user home page
	 * @param replaceData
	 * @return 
	 * @return 
	 */
	public void clickOnCategory(String replaceData)
	{
		convertFromDynamicXpathToWebElement(categoryName,replaceData).click();
	}
	/**
	 * This method is used to get the category name
	 * @param replaceData
	 * @return
	 */
	public String getCategory(String replaceData)
	{
		return convertFromDynamicXpathToWebElement(categoryName,replaceData).getText();
	}
	/**
	 * This method used to click on Books tab
	 */
	public void clickOnhomeTab()
	{
		homeTab.click();
	}
	public String Categories()
	{
		return Categories;
	}
	public void logoutFromUserPage()
	{
		logoutBtn.click();
	}
}