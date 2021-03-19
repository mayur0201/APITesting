
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JqueryDropDown {
       
	
	public static void main(String[] args) {
	
		
        WebDriverManager.chromedriver().setup();
		
        WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		driver.findElement(By.xpath("//input[@id='justAnInputBox']")).click();
		selectoption(driver,"choice 6");
		//selectoption(driver,"all");	
	}

	public static void selectoption(WebDriver drv ,String...  value)
	{
		List<WebElement> opt=drv.findElements(By.xpath("//span[@class='comboTreeItemTitle']"));
		
		if(!value[0].equalsIgnoreCase("all"))
			{
			for(WebElement drp : opt)
	        {
				String text = drp.getText();
				for(String val : value)
				{
					if(text.equals(val))
		        	{
		        		drp.click();
		        		break;
		        		}
				}
	        	
		    }
		}
		
		else
		{
			try
			{
				for(WebElement itm:opt)
				{
					itm.click();
					
				}
			}
				
			catch(Exception e)
			{
				System.out.println(e);
			}
			
		}
		
   }
}
