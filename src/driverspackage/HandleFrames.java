package driverspackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFrames {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	//river.get("https://freecrm.com/");
		driver.get("https://www.globalsqa.com/demo-site/frames-and-windows/#iFrame1");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//li[text()='iFrame']")).click();
	}

}
