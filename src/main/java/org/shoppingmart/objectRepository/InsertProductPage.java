package org.shoppingmart.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InsertProductPage
{
public InsertProductPage(WebDriver driver)
{
PageFactory.initElements(driver,this);
}
@FindBy(xpath="//select[@name='category']")
private WebElement insertProductDropdown;
@FindBy(xpath="//select[@name='subcategory']")
private WebElement subCategoryDropdown;
@FindBy(xpath="//input[@name='productName']")
private WebElement  nameOfProduct;
@FindBy(xpath="//input[@name='productCompany']")
private WebElement  productCompany;
@FindBy(xpath="//input[@name='productpricebd']")
private WebElement  productPricebd;
@FindBy(xpath="//input[@name='productprice']")
private WebElement  productPrice;
@FindBy(xpath="//input[@name='productShippingcharge']")
private WebElement  productShippingcharge;
@FindBy(xpath="//select[@name='productAvailability']")
private WebElement  productAvailability;
@FindBy(xpath="//input[@name='productimage1']")
private WebElement  productImage1;
@FindBy(xpath="//input[@name='productimage2']")
private WebElement  productImage2;
@FindBy(xpath="//input[@name='productimage3']")
private WebElement  productImage3;
@FindBy(xpath="//button[@name='submit']")
private WebElement  insertBtn;

//Business library
/**
 * 
 * This method is used to This method is used to return the ctegory dropdown Webelement from insert product
 */
public WebElement categoryDropdown() 
{
return insertProductDropdown;
}
/**
 * 
 * This method is used to This method is used to return the Subcategory dropdown Webelement from insert product
 */
public WebElement subCategoryDropdown() 
{
return subCategoryDropdown;
}
/**
 * 
 * This method is used to This method is used to return the Subcategory dropdown Webelement from insert product
 */
public WebElement availabilityDropdown() 
{
return productAvailability;
}

/**
 * This method is used to insert a product 
 */
public void insertProduct(String Productname,String company,String productPriceBD,String productPriceAD,String shippingCharge)
{
	nameOfProduct.sendKeys(Productname);
	productCompany.sendKeys(company);
	productPricebd.sendKeys(productPriceBD);
	productPrice.sendKeys(productPriceAD);
	productShippingcharge.sendKeys(shippingCharge);
	
	
}
/**
 * 
 * This method is used to This method is used to upload the Subcategory dropdown Webelement from insert product
 */
public void uploadImages(String Path1,String path2,String path3) 
{
	productImage1.sendKeys(Path1);
	productImage2.sendKeys(path2);
	productImage3.sendKeys(path3);
}
public void clickOnInsertButton()
{
	insertBtn.click();	
}
}