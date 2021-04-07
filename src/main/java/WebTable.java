import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable {

	    public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		String bxpath = "//*[@id='customers']/tbody/tr[ ";
	    String axpath = "]/td[1]"	;
	    String cxpath = "]/td[2]"	;
	    String dxpath = "]/td[3]"	;
	    
	    String colxpath1 = "//*[@id='customers']/tbody/tr[1]/th[";
	    String colxpath2 ="]" ;
	    
	    int totalrow =driver.findElements(By.xpath("//*[@id='customers']/tbody/tr")).size();
	    
	    int totalcol =driver.findElements(By.xpath("//*[@id='customers']/tbody/tr[1]/th")).size();
	    
	    for(int i=2;i<=totalrow;i++)
	    {
	    	String Companyxpath = bxpath + i + axpath;
	    	
	    	WebElement el =driver.findElement(By.xpath(Companyxpath));
	    	
	    	System.out.println(el.getText());
	    }
				
	    System.out.println("*****************");
	    
	    for(int i=2;i<=totalrow;i++)
	    {
	    	String Contactxpath = bxpath + i + cxpath;
	    	
	    	WebElement el =driver.findElement(By.xpath(Contactxpath));
	    	
	    	System.out.println(el.getText());
	    }
        
	    System.out.println("*****************");

	    for(int i=2;i<=totalrow;i++)
	    {
	    	String Countryxpath = bxpath + i + dxpath;
	    	
	    	WebElement el =driver.findElement(By.xpath(Countryxpath));
	    	
	    	System.out.println(el.getText());
	    }
				
	    System.out.println("*****************");

	    for(int i=1;i<=totalcol;i++)
	    {
	    	String Columnxpath = colxpath1 + i + colxpath2;
	    	
	    	WebElement el =driver.findElement(By.xpath(Columnxpath));
	    	
	    	System.out.println(el.getText());
	    }
	}

}
