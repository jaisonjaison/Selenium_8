package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	@FindBy(xpath = "(//a[contains(text(),'Books')])[1]")
	private WebElement booksLink;
	@FindBy(xpath = "(//a[contains(text(),'Computers')])[1]")
	private WebElement computerLink;
	@FindBy(xpath = "(//a[contains(text(),'Electronics')])[1]")
	private WebElement electronicsLink;
	@FindBy(xpath = "(//a[contains(text(),'Gift Cards')])[1]")
	private WebElement giftcardLink;
	@FindBy(linkText = "Log out")
	private WebElement logoutlink;
	public WebElement getBooksLink() {
		return booksLink;
	}
	public void setBooksLink(WebElement booksLink) {
		this.booksLink = booksLink;
	}
	public WebElement getComputerLink() {
		return computerLink;
	}
	public void setComputerLink(WebElement computerLink) {
		this.computerLink = computerLink;
	}
	public WebElement getElectronicsLink() {
		return electronicsLink;
	}
	public void setElectronicsLink(WebElement electronicsLink) {
		this.electronicsLink = electronicsLink;
	}
	public WebElement getGiftcardLink() {
		return giftcardLink;
	}
	public void setGiftcardLink(WebElement giftcardLink) {
		this.giftcardLink = giftcardLink;
	}

	public WebElement getLogoutlink() {
		return logoutlink;
	}
	public void setLogoutlink(WebElement logoutlink) {
		this.logoutlink = logoutlink;
	}
	public Homepage(WebDriver driver) {
		PageFactory.initElements( driver,this);
	}

}
