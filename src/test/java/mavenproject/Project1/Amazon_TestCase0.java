package mavenproject.Project1;

	import java.io.File;
	import java.io.IOException;
	import java.time.Duration;

	import org.apache.commons.io.FileUtils;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.edge.EdgeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Parameters;

	public class Amazon_TestCase0 {
		WebDriver driver;
		@BeforeMethod
		public void launch()
		{
			 driver=new EdgeDriver();
		driver.get("https://www.amazon.in/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}
			
		
		@AfterMethod
		public void LaunchQuit() throws IOException, InterruptedException {
			
			TakesScreenshot ts= (TakesScreenshot) driver;
			 File f=ts.getScreenshotAs(OutputType.FILE);
			 File ds=new File("C:\\Project1\\TakeScreenshot\\paddukishore.png");
			 FileUtils.copyFile(f, ds);
			 Thread.sleep(2000);
			// driver.quit();
			
		}

	}


