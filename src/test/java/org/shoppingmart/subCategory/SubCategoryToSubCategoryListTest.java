package org.shoppingmart.subCategory;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.tyss.genericUtilty.BaseClass;

public class SubCategoryToSubCategoryListTest extends BaseClass {
@Test
	public void  subCategoryToSubCategoryListTest()
	{
		adminCommonPage.clickOnSubCategory();
		WebElement subCategoryPageDropDown=subCategoryPage.categoryDropdown();
		webDriverUtility.handleSelectDropdown(subCategoryPageDropDown, expectedCategoryName);
		subCategoryPage.setValueInSubcategoryTxtField(expectedSubCategoryName);
		String actualSubCategoryName = subCategoryPage.getActualSubCategoryTxt(expectedSubCategoryName);
		javaUtility.printStatement(expectedSubCategoryName);
		javaUtility.printStatement(actualSubCategoryName);
		soft.assertEquals(actualSubCategoryName, expectedSubCategoryName);	
		javaUtility.printStatement("TC is passed");
	}

}
