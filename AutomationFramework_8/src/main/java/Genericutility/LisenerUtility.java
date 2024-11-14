package Genericutility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.Status;

public class LisenerUtility extends BaseClass implements ITestListener{

	@Override
	public void onTestFailure(ITestResult result) {
		test=extreport.createTest(result.getName());
	}

	@Override
	public void onTestStart(ITestResult result) {
		
	String methodname = result.getName();
	TakesScreenshot ts=(TakesScreenshot) sdriver;
	File temp = ts.getScreenshotAs(OutputType.FILE);
	File dest=new File("./Screenshot/"+methodname+jutl.getSystemTime()+".png");
	test.log(Status.FAIL,methodname+"is failed");
	try {
		FileHandler.copy(temp, dest);
	} catch (IOException e) {
		e.printStackTrace();
	}
	}
	
	
	

}
