package Genericutility;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebdriverUtility {
/**
 * this method is used to maximize window
 * @param driver
 */
	public void maximizeWindow(WebDriver driver) {
		driver.manage().window().maximize();
	}
	/**
	 * this method performs mouse hover action on web element
	 * @param driver
	 * @param element
	 */
	public void mouseHover(WebDriver driver,WebElement element) {
		Actions act=new Actions(driver);
		act.scrollToElement(element).perform();
	}
	/**
	 * this method is used to perform right click on web element
	 * @param driver
	 */
	public void rightClick(WebDriver driver) {
		Actions act=new Actions(driver);
		act.contextClick().perform();	
	}
	
	public void scrollToElement(WebDriver driver,WebElement element) {
		Actions act=new Actions(driver);
		act.scrollToElement(element).perform();
	}
	public void switchToWindow(WebDriver driver,String url) {
		//step 1:capture window ids
		Set<String> ids = driver.getWindowHandles();
		//step 2:travel through all the windows 
		for(String id :ids) {
			driver.switchTo().window(id);
			String acturl = driver.getCurrentUrl();
			if (acturl.contains(url)){
				break;
			}
		}
	}
	
	public void switchtoframe(WebDriver driver,int index) {
		driver.switchTo().frame(index);
	}
	public void switchtoframe(WebDriver driver,String nameorId) {
		driver.switchTo().frame(nameorId);
	}
	public void jsclick(WebDriver driver,WebElement element) {
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
	}
	public void jsScroll(WebDriver driver,int x,int y) {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollby("+x+","+y+")");
	}
	public Alert switchToAlert(WebDriver driver) {
		return driver.switchTo().alert();
		
	}
	public void  switchToAlertAndAccept(WebDriver driver) {
		driver.switchTo().alert().accept();
	}
	public void switchtoAlertAndDismiss(WebDriver driver) {
		driver.switchTo().alert().dismiss();
	}
	public void switchtoAlertAndSenmdkeys(WebDriver driver , String data) {
		driver.switchTo().alert().sendKeys(data);
}
	public void selectByValue(WebElement element,String value) {
		Select sel=new Select(element);
		sel.selectByValue(value);
		
	}
	public void selectByIndex(WebElement element,int index) {
		Select sel=new Select(element);
		sel.selectByIndex(index);
}
	public void selectByVisibleText(WebElement element,String text) {
		Select sel=new Select(element);
		sel.selectByValue(text);
		}
	public void implicitWait(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	public void explicitWait(WebDriver driver) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
	}
}

	
	
	
	
	
	
	
	
	
	
	








































