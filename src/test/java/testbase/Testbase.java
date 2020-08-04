package testbase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Testbase{

	public static WebDriver driver=null;
	
	@BeforeSuite
	public void initialize() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ChitsR\\eclipse-workspace\\Greenkart\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		String title = "GreenKart - veg and fruits kart";
		boolean flag = false;
		if(driver.getTitle().equalsIgnoreCase(title)){
			flag = true;
			System.out.println(title +": Yeah..Page title Matched!!");
		}
		Assert.assertTrue(flag,"Page title is not matching");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println(driver.getCurrentUrl());
	}
	
	

	@AfterSuite
	public void Teardown() {
		driver.close();
	}

}