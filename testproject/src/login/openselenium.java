package login;




import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class openselenium {
  
	public static WebDriver driver ;
	@BeforeSuite
	public void generatecsv() throws IOException
	{
		
		CreateCSV.create_csv_for_joinseller();
			
	}
	@BeforeMethod
	public void before_test()
	{
		
		System.setProperty("webdriver.gecko.driver", "/home/users/himanshu.chand/Documents/marketplace/geckodriver");
		driver =new FirefoxDriver();
		driver.manage().window().maximize();	
	}
	
	@AfterSuite
	public void after_test() throws InterruptedException, FileNotFoundException 
	{	
		Thread.sleep(2000);
		driver.quit();
		System.out.print("acasa");
//		System.setOut(new PrintStream(new FileOutputStream("/home/users/himanshu.chand/Documents/marketplace/console.out")));
		
	}
	
 
 }

