package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Welcomepage {
@FindBy(linkText = "Register")
private WebElement registerlink;
@FindBy(linkText = "Log in")
private WebElement loginlink;
public Welcomepage(WebDriver driver) {
	PageFactory.initElements( driver,this);
}
public WebElement getRegisterlink() {
	return registerlink;
}
public void setRegisterlink(WebElement registerlink) {
	this.registerlink = registerlink;
}
public WebElement getLoginlink() {
	return loginlink;
}
public void setLoginlink(WebElement loginlink) {
	this.loginlink = loginlink;
}
}
