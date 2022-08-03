package org.shoppingmart.createcategory;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.tyss.genericUtilty.BaseClass;

public class CreateCategoryAndValidateInSubCategoryTest extends BaseClass {
	@Test
	public void createCategoryAndValidateInSubCategory()
	{
		adminCommonPage.clickOnSubCategory();
		WebElement subCategoryPageDropDown=subCategoryPage.categoryDropdown();
		String actualCategoryName=webDriverUtility.getDataFromDropdown(subCategoryPageDropDown, expectedCategoryName);
		javaUtility.printStatement("ExpectedCategoryName :"+expectedCategoryName);
		javaUtility.printStatement("ActualCategoryName :"+actualCategoryName);
		soft.assertEquals(actualCategoryName, expectedCategoryName);
		javaUtility.printStatement("TC is passed");
}

		
	}
	