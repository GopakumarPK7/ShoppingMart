package org.shoppingmart.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageProduct 
{
public ManageProduct(WebDriver driver)
{
PageFactory.initElements(driver,this);	
}
	
@FindBy(xpath="//input[@type='text']")
private WebElement manageProductSearchBox;
@FindBy(xpath="//td[3]")
private WebElement actualCategoryTxt;
@FindBy(xpath="//td[4]")
private WebElement actualSubcategoryTxt;
//Business library
/**
 * This method is used to get actual category name present in manage product page
 * @return
 */
public String getActualCategoryNameFromManageProduct(String CategoryName) {
	manageProductSearchBox.sendKeys(CategoryName);
	return actualCategoryTxt.getText();
}
/**
 * This method is used to get actual Subcategory name present in manage product page
 * @return
 */
public String getActualSubCategoryNameFromManageProduct(String subCategoryName) {
	manageProductSearchBox.sendKeys(subCategoryName);
	return actualSubcategoryTxt.getText();
}
}
