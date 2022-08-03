package org.shoppingmart.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CategoryPage 
{
public CategoryPage(WebDriver driver)
{
PageFactory.initElements(driver,this);
}
@FindBy(xpath="//input[@name='category']")
private WebElement categoryTxtField;
@FindBy(xpath="//textarea[@name='description']")
private WebElement descriptionTxtField;
@FindBy(xpath="//button[@name='submit']")
private WebElement createBtn;
@FindBy(xpath="//div[@class='dataTables_filter']/label")
private WebElement searchTxtField;
@FindBy(xpath="//td[2]")
private WebElement actualCategoryTxt;
//Business library
/**
 * This method is used to create category
 * @param categoryName
 * @param categoryDescription
 */
public void createCategory(String categoryName,String categoryDescription )
{
	categoryTxtField.sendKeys(categoryName);
	descriptionTxtField.sendKeys(categoryDescription);
	createBtn.click();
}
/**
 * This method is used to get actual category name present in manage category
 * @return
 */
public String getActualCategoryTxt(String categoryName)
{
	searchTxtField.sendKeys(categoryName);
	return actualCategoryTxt.getText();
}

}

