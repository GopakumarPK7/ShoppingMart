package org.tyss.genericUtilty;

import org.openqa.selenium.WebDriver;
import org.shoppingmart.objectRepository.AdminCommonPage;
import org.shoppingmart.objectRepository.AdminLoginPage;
import org.shoppingmart.objectRepository.CategoryPage;
import org.shoppingmart.objectRepository.CommonPage;
import org.shoppingmart.objectRepository.InsertProductPage;
import org.shoppingmart.objectRepository.LoginPage;
import org.shoppingmart.objectRepository.ManageProduct;
import org.shoppingmart.objectRepository.SubCategoryPage;
import org.testng.asserts.SoftAssert;

public class InstanceClass
{
public FileUtility fileUtility;
public ExcelUtility excelUtility;
public WebDriverUtility webDriverUtility;
public JavaUtility javaUtility;
public WebDriver driver;
protected String url;
protected String browser;
protected long timeout;
protected String userName;
protected String password;
public int num;
public SoftAssert soft;
protected String expectedCategoryName;
protected String expectedDescription;
public AdminLoginPage adminLoginPage;
public AdminCommonPage adminCommonPage;
public ManageProduct manageProduct;
public CategoryPage categoryPage;
public SubCategoryPage subCategoryPage;
public CommonPage commonPage;
public LoginPage loginPage;
public InsertProductPage insertProductPage;
protected String expectedSubCategoryName;
protected String productName;
protected String productCompany;
protected String productPriceBD;
protected String productPriceAD;
protected String shippingCharge;
protected String productAvailability;
protected String image1;
protected String image2;
protected String image3;
protected String userUrl;
protected String realUserName;
protected String realUserPassword;
}

