package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Loginpage 
{
	@Test
	public void verifypageTitle() 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		driver.close();
	}
}
