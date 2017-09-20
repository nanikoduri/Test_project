package nani;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Myfirsrt_java {
		@SuppressWarnings("unused")
		@Test
	public void Logincheck(){
		 //System.setProperty("webdriver.gecko.driver", "C://Selenium/geckodriver.exe" ); 	
		//WebDriver driver = new FirefoxDriver();
			System.setProperty("webdriver.chrome.driver", "C://Selenium/chromedriver.exe" ); 	
			WebDriver driver = new ChromeDriver();
		driver.get("http://www.mail.yahoo.com");	
		driver.findElement(By.xpath(".//*[@id='login-username']")).sendKeys("nani_acrazy@yahoo.com");
		driver.findElement(By.xpath(".//*[@id='login-signin']")).click();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("login-passwd")));
		driver.findElement(By.xpath(".//input[@id='login-passwd']")).sendKeys("N765890i");
		driver.findElement(By.xpath(".//*[@id='login-signin']")).click();
		WebDriverWait wait1 = new WebDriverWait(driver, 10);
		String pagetitle= driver.getTitle();
		System.out.println(pagetitle);
		Assert.assertEquals(pagetitle, "Yahoo - login");
		System.out.println(driver.getCurrentUrl());
		driver.quit();
		}
}
