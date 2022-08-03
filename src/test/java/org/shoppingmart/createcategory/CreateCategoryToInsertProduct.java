package org.shoppingmart.createcategory;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.tyss.genericUtilty.BaseClass;

public class CreateCategoryToInsertProduct extends BaseClass{
	@Test
	public void createCategoryToInsertProduct()
	{
		categoryPage.createCategory(expectedCategoryName, expectedDescription);
		adminCommonPage.clickOnInsertProduct();
		WebElement insertProductDropDown=insertProductPage.categoryDropdown();
		String actualCategoryName=webDriverUtility.getDataFromDropdown(insertProductDropDown, expectedCategoryName);
		javaUtility.printStatement("ExpectedCategoryName :"+expectedCategoryName);
		javaUtility.printStatement("ActualCategoryName :"+actualCategoryName);
		soft.assertEquals(actualCategoryName, expectedCategoryName);	
		javaUtility.printStatement("TC is passed");

	}

}
