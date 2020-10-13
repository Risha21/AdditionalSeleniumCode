package driverspackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/?locale=in");
		driver.getCurrentUrl();
		//driver.findElement(By.className("input r4 wide mb16 mt8 password"));
		driver.findElement(By.id("")).
		//System.out.println(driver.getCurrentUrl());
		driver.getCurrentUrl();
		
	//	driver.manage().window().maximize();
	//	driver.manage().deleteAllCookies();
		
		//driver.navigate().to("https://www.google.com/");
		//driver.navigate().forward();
		//driver.navigate().back();
	//	Actions action=new Actions(driver);
	//	action.clickAndHold(driver.findElement(By.xpath(""))).moveToElement(driver.findElement(By.xpath(""))).build().perform();
		//driver.navigate().back();
		driver.close();
		driver.quit();
		

	}

}
