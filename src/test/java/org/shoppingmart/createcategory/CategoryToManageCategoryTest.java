package org.shoppingmart.createcategory;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.tyss.genericUtilty.BaseClass;
@Listeners(org.tyss.genericUtilty.ListenerImplementation.class)
public class CategoryToManageCategoryTest extends BaseClass
{
	@Test
	public void categoryToManagecategory()
	{
		
	categoryPage.createCategory(expectedCategoryName, expectedDescription);
	String actualCategory=categoryPage.getActualCategoryTxt(expectedCategoryName).toUpperCase();
	javaUtility.printStatement(expectedCategoryName);
	javaUtility.printStatement(actualCategory);
	Assert.fail();
	soft.assertEquals(actualCategory, expectedCategoryName);
	javaUtility.printStatement("TC is passed");
	}
}
