package Books;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import Genericutility.BaseClass;
import Genericutility.LisenerUtility;
import ObjectRepository.Homepage;
@Listeners(LisenerUtility.class)
public class TC_DWS_005_tTest  extends BaseClass{
@Test
public void clickOnBooks() throws IOException {
	extreport.createTest("clickOnBooks");
	hp=new Homepage(driver);
	hp.getBooksLink().click();
	Assert.assertEquals(driver.getTitle(),fut.getDataFromProperty("title"),"Books page is not displayed");
	test.log(Status.PASS, "Book page is displayed");
}

}
