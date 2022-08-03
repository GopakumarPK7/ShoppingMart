package org.shoppingmart.createcategory;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.tyss.genericUtilty.BaseClass;

public class CreateCategoryToManageProduct extends BaseClass{
	@Test
	public void createCategoryToManageProduct()
	{
		categoryPage.createCategory(expectedCategoryName, expectedDescription);
		adminCommonPage.clickOnSubCategory();
		WebElement dropdownvalue=subCategoryPage.categoryDropdown();
		webDriverUtility.handleSelectDropdown(dropdownvalue,expectedCategoryName);
		subCategoryPage.setValueInSubcategoryTxtField(expectedSubCategoryName);
		adminCommonPage.clickOnInsertProduct();
		WebElement categoryDropdownvalue=insertProductPage.categoryDropdown();
		webDriverUtility.handleSelectDropdown(categoryDropdownvalue,expectedCategoryName);
		WebElement subegoryDropdownvalue=insertProductPage.subCategoryDropdown();
		webDriverUtility.handleSelectDropdown(subegoryDropdownvalue,expectedSubCategoryName);
		WebElement availabilityDropdownvalue=insertProductPage.availabilityDropdown();
		webDriverUtility.handleSelectDropdown(availabilityDropdownvalue,productAvailability);
		insertProductPage.insertProduct(productName, productCompany, productPriceBD, productPriceAD, shippingCharge);
		insertProductPage.uploadImages(image1, image2, image3);
		insertProductPage.clickOnInsertButton();
		adminCommonPage.clickOnManageProduct();
		String actualCategoryName=manageProduct.getActualCategoryNameFromManageProduct(expectedCategoryName);
		javaUtility.printStatement(expectedCategoryName);
		javaUtility.printStatement(actualCategoryName);
		soft.assertEquals(actualCategoryName, expectedCategoryName);	
		javaUtility.printStatement("TC is passed");
		
	}

}
