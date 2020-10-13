package driverspackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Total_links {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		List<WebElement> links=driver.findElements(By.xpath("//a"));//identify 
		int linkcount=links.size();
		
		System.out.println("total number of links present on webpage" +linkcount);
		//identify total number of element in page
		
		List<WebElement> elements=driver.findElements(By.xpath("//*"));//identify all the elements on web page
		int allelements=elements.size();
		System.out.println("total number of elements in webpage" +allelements);

	}

}
