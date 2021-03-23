package agri_crop.project;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

	public class Testpage_3 
	{
	
			WebDriver driver;
			// WebDriver will helps us to perform activities on the Web page 
			
			// By class storing the static method called id locator
			By crop_name = By.id("crop_name");
			// By class storing the static method called id locator

			By crop_description = By.id("crop_description");
			By add_crop_name = By.id("btn_add_crop_name");


		//Adding one constructor with the same class name and parameterize the constructor

		public  Testpage_3 (WebDriver driver)
		{
			this.driver = driver;
		// calling this constructor called driver
			//constructor main task is to initialize the webDriver

		}
		//Parameterizing the void functions


		public void crop_name(String cropname) throws InterruptedException

		{
			driver.findElement(crop_name).sendKeys("rice123");
			Thread.sleep(3000);

		}
		//Parameterizing the void functions

		public void crop_description(String cropdescription) throws InterruptedException

		{
			driver.findElement(crop_description).sendKeys("paddy crop");
			
			Thread.sleep(3000);
			
		}

		public void add_crop_name(String addcrop) throws InterruptedException

		{
			driver.findElement(add_crop_name).click();
			
			Thread.sleep(3000);
			
		}


		}
	


