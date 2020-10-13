package driverspackage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlert {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		// Delete customer form
		driver.findElement(By.name("cusid")).sendKeys("1234");
		driver.findElement(By.name("submit")).click();// when you have to submit run this else comment this out
		// driver.findElement(By.name("res")).click();//when you have to reset run this
		// else comment this out
		// Switching to Alert window
		Alert alert = driver.switchTo().alert();

		String Alert_text = alert.getText();
		System.out.println(Alert_text);
		if (Alert_text.equals("Do you really want to delete this Customer?")) {
			System.out.println("correct alert is displayed");
		} else {
			System.out.println("incorrect text is displayed");
		}
		alert.accept();
		// alert.accept();
		alert.dismiss();

	}
}
