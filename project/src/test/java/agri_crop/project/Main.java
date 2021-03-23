package agri_crop.project;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.Assert;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;


public class Main {
	
		
		WebDriver driver;
		ExtentReports extent;
		 ExtentTest logger;
		 	
		 @BeforeTest
			
			public void setupExtent() throws IOException 
			{	
				ExtentHtmlReporter reporter=new ExtentHtmlReporter("./Report/extentxml.html");
				
			    extent = new ExtentReports();
			    
			    extent.attachReporter(reporter);
			    
			    logger=extent.createTest("Logintest"); 
			    
			 
			}

@BeforeMethod()


public void beforeMethod()

{
	System.setProperty("webdriver.chrome.driver", "/Users/madan mohan reddy/Desktop/selenium-java-3.141.59/chromedriver");
	
	driver = new ChromeDriver();

	driver.manage().window().maximize();

	driver.get("http://omnisoft.in/farmer/website");

}
	
	
	
	@Test()
	public void test() throws InterruptedException
	
	{
		Testpage_1 Datapage = new Testpage_1(driver);
		Datapage.username("admin");
		Datapage.password("admin1234");
		Datapage.submit("g");
		
		Testpage_2 Datapage1 = new Testpage_2(driver);
		Datapage1.masters("h");	
		Datapage1.crop("g");
		Datapage1.add_crop("f");
		Testpage_3 Datapage2 = new Testpage_3(driver);
		Datapage2.crop_name("rice123");
		Datapage2.crop_description("paddy crop");
		Datapage2.add_crop_name("g");
		
	}	
	
	

@AfterMethod()
	
	public void tearDown(ITestResult result) throws IOException {
		
	 if(result.getStatus()==ITestResult.FAILURE) {
			
			String temp= Utility.getScreenshot(driver);
			
			logger.fail(result.getThrowable().getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(temp).build());
		}
	 else if(result.getStatus()==ITestResult.SUCCESS){
			
			String temp= Utility.getScreenshot(driver);
			
			logger.pass(result.getName(), MediaEntityBuilder.createScreenCaptureFromPath(temp).build());
		}
		
		else if(result.getStatus()==ITestResult.SKIP){
			
			String temp= Utility.getScreenshot(driver);
			
			logger.skip(result.getName(), MediaEntityBuilder.createScreenCaptureFromPath(temp).build());
		}
		
		extent.flush(); 
		driver.quit();
	}
	

}
	


