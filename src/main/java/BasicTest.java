



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;


public class BasicTest {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	WebDriverManager.chromedriver().setup();
	
	driver = new ChromeDriver();
	
	driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
	WebElement empl = driver.findElement(By.xpath("//select[@id='Form_submitForm_NoOfEmployees']"));
	selectdropdown(empl,"16 - 20");
	WebElement industry = driver.findElement(By.xpath("//select[@id='Form_submitForm_Industry']"));
	selectdropdown(industry,"Healthcare");
	WebElement country = driver.findElement(By.xpath("//select[@id='Form_submitForm_Country']"));
	selectdropdown(country,"Cuba");
		
}
	

	public static void selectdropdown(WebElement el , String value)
	{
		Select drp = new Select(el);
		
		List<WebElement>alloptions = drp.getOptions();
		
		for(WebElement opt:alloptions)
		{
			if(opt.getText().equals(value))
			{
				opt.click();
				break;
				
			}
		}
	}
}

