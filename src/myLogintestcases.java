import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class myLogintestcases {
	WebDriver driver = new ChromeDriver();
	
	@BeforeTest
	public void mySetup() {
		
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
	}
	@Test (priority = 1)
	public void Setup() {
		
		driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		
	}
	@Test (priority = 2)
	public void SelectElement()  {
	
		List<WebElement> addtocard = driver.findElements(By.className("btn"));
		for(int i = 0 ; i<addtocard.size();i++) {
			addtocard.get(i).click();
			
		}
		}
		@Test (priority = 3)
		public void deleteElement()  {
		
			List<WebElement> addtocard = driver.findElements(By.className("btn"));
			for(int i = 0 ; i<addtocard.size();i++) {
				addtocard.get(i).click();
				
				
			}
		
	}

}
