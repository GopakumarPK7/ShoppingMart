package org.shoppingmart.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.tyss.genericUtilty.WebDriverUtility;

public class SubCategoryPage
{
WebDriverUtility webDriverUtility;
public SubCategoryPage(WebDriver driver)
{
PageFactory.initElements(driver,this);
}
@FindBy(xpath="//select[@name='category']")
private WebElement categoryDropdown;
@FindBy(xpath="//input[@name='subcategory']")
private WebElement subCategoryTxtField;
@FindBy(xpath="//button[@name='submit']")
private WebElement createBtn;
@FindBy(xpath="//label/input[@type='text']")
private WebElement subCategorysearchfield;
@FindBy(xpath="//tr[@class='odd']/td[3]")
private WebElement actualSubCategoryName;

//Business library
/**
 * This method is used to return the dropdown Webelement
 * @param element
 * @param categoryName
 * @return 
 * @return 
 * @return 
 */
public WebElement categoryDropdown() 
{
return categoryDropdown;
}
/**
 * This method is used to create subcategory
 * @param subCategoryName
 */
public void setValueInSubcategoryTxtField(String subCategoryName)
{
	subCategoryTxtField.sendKeys(subCategoryName);
	createBtn.click();
}
/**
 * This method is used to get actual subcategory name present in subcategory list
 * @return
 */
public String getActualSubCategoryTxt(String subCategoryName)
{
	subCategorysearchfield.sendKeys(subCategoryName);
	return actualSubCategoryName.getText();
}
}