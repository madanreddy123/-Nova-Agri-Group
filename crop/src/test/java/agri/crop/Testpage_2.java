package agri.crop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Testpage_2 
{
	WebDriver driver;
	// WebDriver will helps us to perform activities on the Web page 
	
	// By class storing the static method called className locator
	By masters = By.className("menu-text");
	// By class storing the static method called xpath locator

	By crop = By.xpath("//*[@id=\"sidebar\"]/ul/li[4]/ul/li[1]/a");
	By add_crop = By.xpath("//*[@id=\"sidebar\"]/ul/li[4]/ul/li[1]/ul/li[1]/a");



//Adding one constructor with the same class name and parameterize the constructor

public  Testpage_2 (WebDriver driver)
{
	this.driver = driver;
// calling this constructor called driver
	//constructor main task is to initialize the webDriver

}
//Parameterizing the void functions


public void masters(String master) throws InterruptedException

{
	driver.findElements(masters).get(3).click();
	Thread.sleep(3000);

}
//Parameterizing the void functions

public void crop(String crop1) throws InterruptedException

{
	driver.findElement(crop).click();
	
	Thread.sleep(3000);
	
}

public void add_crop(String addcrop) throws InterruptedException

{
	driver.findElement(add_crop).click();
	
	Thread.sleep(3000);
	
}


}