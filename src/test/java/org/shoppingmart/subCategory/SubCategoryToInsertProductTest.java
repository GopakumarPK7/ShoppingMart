package org.shoppingmart.subCategory;

import org.openqa.selenium.WebElement;
import org.tyss.genericUtilty.BaseClass;

public class SubCategoryToInsertProductTest extends BaseClass{

	public void subCategoryToInsertProductTest()
	{	
		adminCommonPage.clickOnSubCategory();
		WebElement subCategoryPageDropDown=subCategoryPage.categoryDropdown();
		webDriverUtility.handleSelectDropdown(subCategoryPageDropDown, expectedCategoryName);
		subCategoryPage.setValueInSubcategoryTxtField(expectedSubCategoryName);
		adminCommonPage.clickOnInsertProduct();
		WebElement insertProductCategoryDropDown=insertProductPage.categoryDropdown();
		webDriverUtility.handleSelectDropdown(insertProductCategoryDropDown, expectedCategoryName);
		WebElement insertProductSubCategoryDropDown=insertProductPage.subCategoryDropdown();
		String actualSubCategoryName=webDriverUtility.getDataFromDropdown(insertProductSubCategoryDropDown, expectedSubCategoryName);
		javaUtility.printStatement(expectedSubCategoryName);
		javaUtility.printStatement(actualSubCategoryName);
		soft.assertEquals(actualSubCategoryName, expectedSubCategoryName);	
		javaUtility.printStatement("TC is passed");

	}

}
