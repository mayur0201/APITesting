import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBoxes {

	public static void main(String[] args) {
     
		WebDriverManager.chromedriver().setup();
		
        WebDriver driver = new ChromeDriver();
		
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		
		//driver.findElement(By.xpath("//input[@id='monday']")).click(); 
		
		List<WebElement> checkbox =driver.findElements(By.xpath("//input[@type='checkbox' and (contains(@id,'day'))]"));

		/*for(WebElement chck : checkbox)
		{
			chck.click();
		} */
		
		
		/*for(WebElement chck : checkbox)
		{
			String name =chck.getAttribute("id");
			
			if(name.contains("friday") || name.contains("thursday"))
			{
				chck.click();
			}
		} */
		
		
	int totalcheckbox=checkbox.size();
	
	/*for(int x= totalcheckbox-2;x<totalcheckbox;x++)
	{
		checkbox.get(x).click();
	}*/
		
	
	
	
	for(int i =0 ; i<totalcheckbox ; i++)
		
	{
		
		if(i<2)
		{
			checkbox.get(i).click();
		}
	}

}
}
