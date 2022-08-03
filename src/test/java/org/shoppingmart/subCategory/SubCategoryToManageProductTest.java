package org.shoppingmart.subCategory;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.tyss.genericUtilty.BaseClass;

public class SubCategoryToManageProductTest extends BaseClass {
	@Test
	public void  subCategoryToManageProductTest()
	{
		adminCommonPage.clickOnSubCategory();
		WebElement subCategoryPageDropDown=subCategoryPage.categoryDropdown();
		webDriverUtility.handleSelectDropdown(subCategoryPageDropDown, expectedCategoryName);
		subCategoryPage.setValueInSubcategoryTxtField(expectedSubCategoryName);
		adminCommonPage.clickOnInsertProduct();
		WebElement insertProductCategoryDropDown=insertProductPage.categoryDropdown();
		webDriverUtility.handleSelectDropdown(insertProductCategoryDropDown, expectedCategoryName);
		WebElement insertProductSubCategoryDropDown=insertProductPage.subCategoryDropdown();
		webDriverUtility.handleSelectDropdown(insertProductSubCategoryDropDown, expectedSubCategoryName);
		WebElement availabilityDropdownvalue=insertProductPage.availabilityDropdown();
		webDriverUtility.handleSelectDropdown(availabilityDropdownvalue,productAvailability);
		insertProductPage.insertProduct(productName, productCompany, productPriceBD, productPriceAD, shippingCharge);
		insertProductPage.uploadImages(image1, image2, image3);
		insertProductPage.clickOnInsertButton();
		adminCommonPage.clickOnManageProduct();
		String actualSubCategoryName=manageProduct.getActualSubCategoryNameFromManageProduct(expectedSubCategoryName);
		javaUtility.printStatement(expectedSubCategoryName);
		javaUtility.printStatement(actualSubCategoryName);
		soft.assertEquals(actualSubCategoryName, expectedSubCategoryName);	
		javaUtility.printStatement("TC is passed");


	}

}
