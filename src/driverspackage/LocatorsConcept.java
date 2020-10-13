package driverspackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LocatorsConcept {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\software\\chromedriver.exe");
				//"C:\\Users\\User\\Desktop\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
				driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		// 1.Xpath when link needs to be clicked
				// 2.linkText when link needs to be clicked

		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[text()='register']")).click();

		//driver.findElement(By.linkText("register")).click();
	


		driver.findElement(By.id("firstname")).sendKeys("risha");
		
		
		// 3.id ----1
		driver.findElement(By.id("lastname")).sendKeys("anand");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("risha.anand61@gmail.com");
		driver.findElement(By.xpath("//input[@id='PASSWORD']")).sendKeys("Rambozza@3");
		// 4. xpath text-----2 don't use hierarchy based xpath
		// driver.findElement(By.xpath("//a[text()='User Privacy Notice']"));
		// 5.by partial link text
		driver.findElement(By.partialLinkText("User Privacy"));
		// chropath suggested xpath a[contains(text(),'User Privacy Notice')]
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='ppaFormSbtBtn']"))).click();

		// wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'COMPOSE')]")));

		// driver.findElement(By.xpath("button[@id='ppaFormSbtBtn']")).click();
		// + "//button[text()='Create account']")).click();

		// name would be second priority
		// button[@id='ppaFormSbtBtn']

	}

}
