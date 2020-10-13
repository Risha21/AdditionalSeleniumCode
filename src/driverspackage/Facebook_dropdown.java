package driverspackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook_dropdown {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\software\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(1000,TimeUnit.SECONDS);
		driver.findElement(By.name("firstname")).sendKeys("soma");
		driver.findElement(By.name("lastname")).sendKeys("sharma");
		driver.findElement(By.name("reg_email__")).sendKeys("risha.anand61@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("risha.anand61@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("Rambozza@3");
		//handle drop down check how many values in dropdown and print all the values in dropdown
		
		Select dropdown =new Select(driver.findElement(By.id("day")));
		dropdown.selectByIndex(2);
		
		Select dropdown1=new Select(driver.findElement(By.id("month")));
		dropdown1.selectByVisibleText("Apr");
		
		List<WebElement> dropdown_month=dropdown1.getOptions();
		System.out.println(dropdown_month.size());
		
		int size= dropdown_month.size();
		
		for(int i=0;i<size;i++) {
			System.out.println(dropdown_month.get(i).getText());
		}
		
		Select dropdown2=new Select(driver.findElement(By.id("year")));
		dropdown2.selectByVisibleText("2019");
		
	driver.findElement(By.xpath("//input[@id='u_1_4']")).click();
		
		
		
		
	}
	
}
		