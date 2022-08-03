package org.shoppingmart.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
public LoginPage(WebDriver driver)
{
	PageFactory.initElements(driver,this);
}
@FindBy(xpath="//a[text()='Login']")
private WebElement loginOption;
@FindBy(xpath="//input[@name='email']")
private WebElement signinMailId;
@FindBy(xpath="//input[@id='exampleInputPassword1']")
private WebElement signinPassword;
@FindBy (xpath="//button[@name='login']")
private WebElement loginBtn;

//Business library
/**
 * This method is used to login to the application
 * @param userName
 * @param password
 */
public void loginApplication(String userName,String password)
{
loginOption.click();
signinMailId.sendKeys(userName);
signinPassword.sendKeys(password);
loginBtn.click();
}
}