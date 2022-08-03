package org.shoppingmart.systemTesting;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.tyss.genericUtilty.BaseClass;

public class CreateCategoryToUserModuleTest extends BaseClass{
@Test
	public void createCategoryToUserModuleTest()
	{
		//admin

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
		manageProduct.getActualCategoryNameFromManageProduct(expectedCategoryName);
		adminCommonPage.logoutFromApplication();

		//user

		webDriverUtility.openApplication(userUrl);
		loginPage.loginApplication(realUserName, realUserPassword);
		commonPage.clickOnhomeTab();
		String actualCategoryName=	commonPage.getCategory(expectedCategoryName);
		soft.assertEquals(actualCategoryName, expectedCategoryName);	
		javaUtility.printStatement("TC is passed");
		javaUtility.printStatement("Actual category : "+expectedCategoryName);
		javaUtility.printStatement("Expected category : "+actualCategoryName);
		commonPage.logoutFromUserPage();

	}
}
