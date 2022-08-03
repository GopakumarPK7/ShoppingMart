package org.shoppingmart.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminLoginPage 
{
public AdminLoginPage(WebDriver driver)
{
PageFactory.initElements(driver,this);
}
@FindBy(xpath="//input[@name='username']")
private WebElement AdminUserName;
@FindBy(xpath="//input[@name='password']")
private WebElement password;
@FindBy(xpath="//button[@type='submit']")
private WebElement loginBtn;

//Business library
/**
 * This method is used to login as admin
 * @param userName
 * @param passWord
 */
public void logInAsAdmin(String userName,String passWord)
{
	AdminUserName.sendKeys(userName);
	password.sendKeys(passWord);
	loginBtn.click();
}
}