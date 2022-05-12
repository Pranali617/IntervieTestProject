package loginDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginScriptDemo {
	public static WebDriver driver;
	public void browserInitialization()
	{
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	 driver =new ChromeDriver();

	 driver.get("https://www.saucedemo.com/");
	 
	 driver.manage().window().maximize();
	 
	 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS); 
	 
	 System.out.println("Browser initializtion URL loading");

	}

	public void loginswag(String password, String username)
	{
		driver.findElement(By.id("user-name")).sendKeys(username);
		
		driver.findElement(By.id("password")).sendKeys(password);
		
		driver.findElement(By.id("login-button")).click();
		
		System.out.println("Username and password entered succesfully");
	}

	public void closeBrowser()
	{
		driver.close();
		System.out.println("Browser Closed");
	}

}
