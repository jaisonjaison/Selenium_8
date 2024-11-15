package Genericutility;

import java.io.IOException;
//org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import ObjectRepository.Homepage;
import ObjectRepository.Loginpage;
import ObjectRepository.Welcomepage;

public class BaseClass {
public WebDriver driver;
public static WebDriver sdriver;
public static  ExtentTest test;
public static ExtentReports extreport;
public WebdriverUtility webut=new WebdriverUtility();
public FileUtility fut=new FileUtility();
public Welcomepage wp;
public Loginpage lp;
public Homepage hp;
public JavaUtility jutl=new JavaUtility();

@BeforeSuite
public void configReport() {
	JavaUtility javaut=new JavaUtility();
	ExtentSparkReporter spkar=new ExtentSparkReporter("./HTML_report/ExtentReport_"+javaut.getSystemTime());
    extreport=new ExtentReports();
    extreport.attachReporter(spkar);
}
	@BeforeClass
	public void lanchBrowser(@Optional("chrome")String browsername) throws IOException {
		if(browsername.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver();
		}else if(browsername.equalsIgnoreCase("edge")) {
			driver=new EdgeDriver();
		}else if (browsername.equalsIgnoreCase("firefox")) {
			driver=new FirefoxDriver(); 
		}
		webut.maximizeWindow(driver);
		webut.implicitWait(driver);
		driver.get(fut.getDataFromProperty("url"));
		
	}
	@BeforeMethod
	public void login() throws IOException {
		 wp=new Welcomepage(driver);
		 wp.getLoginlink().click();
		 lp=new Loginpage(driver);
		 lp.getEmailtextfield().sendKeys(fut.getDataFromProperty("email"));
		 lp.getPasswordtextfield().sendKeys(fut.getDataFromProperty("password"));
		 lp.getLoginbutton().click();
	}
	@AfterMethod
	public void logout() {
		hp=new Homepage(driver);
		hp.getLogoutlink().click();
	}
	
	@AfterClass
	public void closeBrowser() {
		driver.quit();
	}
	@AfterSuite
	public void reportBackup() {
		extreport.flush();
	}
}
