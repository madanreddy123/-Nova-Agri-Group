package project.agri;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;

	public class Testpage_1 
	{
		WebDriver driver;
		// WebDriver will helps us to perform activities on the Web page 
		
		// By class storing the static method called id locator
		By username = By.id("username");
		// By class storing the static method called id locator

		By password = By.id("userpass");
		
		By submit = By.id("btn_login");

	// now we have the 2 locators

	//Adding one constructor with the same class name and parameterize the constructor

	public  Testpage_1 (WebDriver driver)
	{
		this.driver = driver;
	// calling this constructor called driver
		//constructor main task is to initialize the webDriver

	}
	//Parameterizing the void functions
	// adding the string and some name in the brackets beside the username
	
	public void username(String usernme) throws InterruptedException

	{
		driver.findElement(username).sendKeys("admin");
		Thread.sleep(3000);
	
	}
	//Parameterizing the void functions
	//adding the string and some name in the brackets beside the password
	public void password(String pass) throws InterruptedException

	{
		driver.findElement(password).sendKeys("admin1234");
		
		Thread.sleep(3000);
		
	}

	public void submit(String sub) throws InterruptedException

	{
		driver.findElement(submit).click();
		
		Thread.sleep(3000);
		
	}


	}


