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
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.asserts.SoftAssert;

public class BaseClass extends InstanceClass {
	public static WebDriver listenerdriver;
	@BeforeSuite
	public void suiteSetup()
	{
		fileUtility=new FileUtility();
		excelUtility=new ExcelUtility();
		javaUtility=new JavaUtility();
		webDriverUtility=new WebDriverUtility();
		fileUtility.initializePropertyFile(IConstants.ONLINESHOPPINGPROPERTYFILEPATH);
		excelUtility.initializeExcel(IConstants.ONLINESHOPPINGEXCELFILEPATH);
		browser=fileUtility.getDataFromProperties("browser");
		url=fileUtility.getDataFromProperties("adminloginurl");
		userName=fileUtility.getDataFromProperties("adminusername");
		password=fileUtility.getDataFromProperties("adminpassword");
		String timeouts=fileUtility.getDataFromProperties("timeouts");
		timeout=Long.parseLong(timeouts);
		expectedCategoryName=excelUtility.getTheDataFromExcel("Category", 2, 1)+num;
		expectedDescription=excelUtility.getTheDataFromExcel("Category", 2, 2)+num;
		userUrl=fileUtility.getDataFromProperties("url");
		realUserName=fileUtility.getDataFromProperties("username");
		realUserPassword=fileUtility.getDataFromProperties("password");
		expectedSubCategoryName=excelUtility.getTheDataFromExcel("Category", 4, 1);
		productName=excelUtility.getTheDataFromExcel("Category", 6, 1);
		productCompany=excelUtility.getTheDataFromExcel("Category", 8, 1);
		productPriceBD=excelUtility.getTheDataFromExcel("Category", 10, 1);
		productPriceAD=excelUtility.getTheDataFromExcel("Category", 12, 1);
		shippingCharge=excelUtility.getTheDataFromExcel("Category", 16, 1);
		productAvailability=excelUtility.getTheDataFromExcel("Category", 24, 1);
		image1=excelUtility.getTheDataFromExcel("Category", 18, 1);
		image2=excelUtility.getTheDataFromExcel("Category", 20, 1);
		image3=excelUtility.getTheDataFromExcel("Category", 22, 1);
	}
	@BeforeClass
	public void classSetup()
	{
		
		driver=webDriverUtility.setupDriver(browser);
		listenerdriver=driver;
		webDriverUtility.maximizeBrowser();
		webDriverUtility.openApplication(url);
		webDriverUtility.implicitWait(timeout);
		adminLoginPage=new AdminLoginPage(driver);
		adminCommonPage=new AdminCommonPage(driver);
		categoryPage=new CategoryPage(driver);
		subCategoryPage=new SubCategoryPage(driver);
		insertProductPage=new InsertProductPage(driver);
		manageProduct=new ManageProduct(driver);
		loginPage=new LoginPage(driver);
		commonPage=new CommonPage(driver);
		soft =new SoftAssert();

	}
	@BeforeMethod
	public void methodSetup()
	{
		num=javaUtility.getRandomNumber();	
		adminLoginPage.logInAsAdmin(userName, password);
		adminCommonPage.clickOnCategory();
		categoryPage.createCategory(expectedCategoryName, expectedDescription);

	}
	@AfterMethod
	public void methodTearDown()
	{
		
		//adminCommonPage.logoutFromApplication();
		//commonPage.logoutFromUserPage();
	}
	@AfterClass
	public void classTearDown()
	{
		soft.assertAll();
		webDriverUtility.closeBrowser();
	}
}