import java.io.Console;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test123 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://login.salesforce.com/index.jsp?un=john.doe@auto.hire&pw=johnnyboy123&startURL=https://auto-test1--simpplr.visualforce.com/apex/simpplr__app?u=/site/a1A5Y00000MbH1fUAF/page/a185Y00001agRXZQA2");
		
		String text =driver.findElement(By.xpath("//p[contains(text(),'Contrary to popular belief, Lorem Ipsum is not sim')]")).getText();
		
		
		
       try {
       Assert.assertTrue(text.contains("classical Latin literature"));
       }
       
       catch(Exception e)
       {
    	   System.out.println("classical Latin literature is not present"+ e);
    	   
    	 
       }
	
			
		
	}

}
