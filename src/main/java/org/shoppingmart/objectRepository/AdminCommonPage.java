package org.shoppingmart.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminCommonPage 
{
public AdminCommonPage(WebDriver driver)
{
PageFactory.initElements(driver,this);
}
@FindBy(xpath="//a[text()=' Create Category ']")	
private WebElement createCategory;
@FindBy(xpath="//a[text()='Sub Category ']")
private WebElement subCategory;
@FindBy(xpath="//a[text()='Insert Product ']")
private WebElement insertProduct;
@FindBy(xpath="//a[text()='Manage Products ']")
private WebElement manageProduct;
@FindBy(xpath="//b[@class='caret']")
private WebElement adminIcon;
@FindBy(xpath="//a[text()='Logout']")
private WebElement logoutBtn;
//Business library
/**
 * This method is used to click on Category
 */
public void clickOnCategory() 
{
createCategory.click();
}
/**
 * This method is used to click on Sub category
 */
public void clickOnSubCategory()
{
subCategory.click();
}
/**
 * This method is used to click on Insert product
 */
public void clickOnInsertProduct()
{
insertProduct.click();
}
/**
 * his method is used to click on Manage product
 */
public void clickOnManageProduct()
{
manageProduct.click();
}
/**
 * This method is used to logout from application
 */
public void logoutFromApplication()
{
adminIcon.click();
logoutBtn.click();

}
}
