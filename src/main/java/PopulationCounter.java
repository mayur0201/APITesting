import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PopulationCounter {
          static WebDriver driver;
	      public static void main(String[] args) {
	      String xpath_pop ="//div[@class='maincounter-number']/span[@class='rts-counter']";
	      String xpath_today_thisyear ="//div[text()='Today' or text()='This year']//parent::div//span[@class='rts-counter']";
	      
		  WebDriverManager.chromedriver().setup();
		  driver = new ChromeDriver();
		  driver.get("https://www.worldometers.info/world-population/");
		  
		  System.out.println("Population Counter");
		  System.out.println("******************");
		  population(xpath_pop);
		  System.out.println("******************");
		  System.out.println("Today and this year count");
		  System.out.println("*************************");
		  population(xpath_today_thisyear);
		  System.out.println("*************************");

}
	
	public static void population(String locator)
	{
		int count =1;
		while(count <=20)
        {
		  if(count ==21)
			  break;
		  List<WebElement> el = driver.findElements(By.xpath(locator));

		  for(WebElement e1 : el)
		  {
			  System.out.println(e1.getText());
		  }
		  count ++ ;
	}
	}
}