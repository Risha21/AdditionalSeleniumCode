package driverspackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebdriverBasics {
public static void main(String[] args) {
	 
	System.setProperty("webdriver.gecko.driver","F:\\software\\geckodriver.exe");
	WebDriver driver= new FirefoxDriver();
	driver.navigate().to("https://www.amazon.com/");
	driver.manage().window().maximize();
	String title=driver.getTitle();
	System.out.println(title);
	
	if(title.equals("Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more"));
	{
		System.out.println("title matches");
	}
	
	/*else {
		System.out.println("title doesnt match");
		}
		*/
	}
}

