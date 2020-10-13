package driverspackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PHPtravels {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://phptravels.org/clientarea.php");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Register']")).click();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		driver.findElement(By.id("inputFirstName")).sendKeys("risha");
		driver.findElement(By.id("inputLastName")).sendKeys("anand");
		driver.findElement(By.id("inputEmail")).sendKeys("risha.anand61@gmail.com");
		//handle a drop box
		Select select=new Select(driver.findElement(By.xpath("//div[@class='selected-dial-code']")));
		select.selectByVisibleText("India");	
		////div[@class='selected-dial-code']
	}

}
