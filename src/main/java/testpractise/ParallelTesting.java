package testpractise;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelTesting {
	WebDriver driver;
	@Test
	@Parameters("paddu")
	public void paralleltesting(String browser_name) {
		if(browser_name.equals("Edge"))
		{
			driver=new EdgeDriver();
		}
		if(browser_name.equals("Chrome"))
		{
			driver=new ChromeDriver();
		}
		if(browser_name.equals("Firefox"))
		{
			driver=new FirefoxDriver();
		}
		driver.get("https://www.google.com");
		WebElement text=driver.findElement(By.name("q"));
		text.sendKeys("india");
		text.sendKeys(Keys.ENTER);
		
		
	}

}


