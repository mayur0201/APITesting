import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BootstrapDropdown {

	public static void main(String[] args) {
		
        WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.hdfcbank.com/");

		driver.findElement(By.xpath("//div[@class='drp1']//div[@class='dropdown']")).click();
		
		List<WebElement> options=driver.findElements(By.xpath("//ul[@class='dropdown1 dropdown-menu']/li"));
        System.out.println("The size of options" + options.size());	
        dropdownselect(options,"Accounts");
        	
	
        driver.findElement(By.xpath("//div[@class='drp2']//div[@class='dropdown']")).click();
        List<WebElement> product=driver.findElements(By.xpath("//ul[@class='dropdown2 dropdown-menu']/li"));
        
        System.out.println("The size of product" +product.size());	
        dropdownselect(product,"Savings Accounts");
        
	}
	

	public static void dropdownselect(List<WebElement> el , String value)
	{
		for(WebElement drp : el)
        {
        	if(drp.getText().equals(value))
        	{
        		drp.click();
        		break;
        		
        	}
	    }
   }
}
