package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
@FindBy(id = "Email")
private WebElement emailtextfield;
@FindBy(id = "Password")
private WebElement passwordtextfield;
@FindBy(xpath = "//input[@value='Log in']")
private WebElement loginbutton;
public Loginpage(WebDriver driver) {
	PageFactory.initElements( driver,this);
}
public WebElement getEmailtextfield() {
	return emailtextfield;
}
public void setEmailtextfield(WebElement emailtextfield) {
	this.emailtextfield = emailtextfield;
}
public WebElement getPasswordtextfield() {
	return passwordtextfield;
}
public void setPasswordtextfield(WebElement passwordtextfield) {
	this.passwordtextfield = passwordtextfield;
}
public WebElement getLoginbutton() {
	return loginbutton;
}
public void setLoginbutton(WebElement loginbutton) {
	this.loginbutton = loginbutton;
}
}
