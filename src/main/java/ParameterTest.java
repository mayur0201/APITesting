import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParameterTest {

	WebDriver driver;
	@Test
	@Parameters({"url","email"})
	
	public void login(String url, String email)
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get(url);
		driver.findElement(By.xpath("//input[@id='login-username']")).clear();
		driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys(email);
		driver.findElement(By.xpath(" //input[@id='login-signin']")).click();	
	}
}
