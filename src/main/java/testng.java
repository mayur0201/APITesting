import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testng  {
	  WebDriver driver;
	@Test
	public void Login() {
		WebDriverManager.chromedriver().setup();
		  ChromeOptions option = new ChromeOptions();
		  option.addArguments("--disable-notifications");
		  driver = new ChromeDriver(option);
		  
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	      driver.get("https://www.redbus.in/");
	      
	      
	      
	      String month = "July";
	      String year ="2021";
	      String date = "25";
	      
	      driver.findElement(By.xpath("//label[normalize-space()='Date']")).click();
	      
	      while(true)
	      {
	    	  String monthyear=driver.findElement(By.xpath("//td[@class='monthTitle']")).getText();
	    	  
	    	  String arr[] =monthyear.split(" ");
	    	  
	    	  String mnth = arr[0];
	    	  String yr = arr[1];
	    	  
	    	  if(mnth.equalsIgnoreCase(month) && yr.equalsIgnoreCase(year))
	    	      break;
	    	  else
	    		  driver.findElement(By.xpath(" //button[normalize-space()='>']")).click();
	      }
	      
	      
	     List<WebElement> alldates= driver.findElements(By.xpath("//table[@class='rb-monthTable first last']//td"));
		
	      for(WebElement e: alldates)
	      {
	    	  String rdate=e.getText();
	    	  
	    	  if(rdate.equals(date))
	    	  {
	    		  e.click();
	    		  break;
	    	  }	  
	      }     
	}
	
	@AfterMethod
	
	public void teardown()
	{
		driver.close();
	}
}
