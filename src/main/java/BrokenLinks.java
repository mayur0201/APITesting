import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;



public class BrokenLinks {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub

		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		List<WebElement> links=driver.findElements(By.cssSelector("li[class='gf-li'] a"));
		
		
		for(WebElement link:links)
		{
			String url =link.getAttribute("href");
			HttpURLConnection connct= (HttpURLConnection)new URL(url).openConnection();
			
			connct.setRequestMethod("HEAD");
			connct.connect();
			
			int resp =connct.getResponseCode();
			
			if(resp >400)
			{
				System.out.println("The link with text" + link.getText() + "is broken link" + resp);
				
				Assert.assertTrue(false);
			}
			
		}
	}

}
