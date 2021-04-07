import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicWebTable {

	public static void main(String[] args) {
      WebDriverManager.chromedriver().setup();
	  WebDriver driver = new ChromeDriver();

	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  driver.get("https://demo.opencart.com/admin/");
	  
	  driver.manage().window().maximize();
	  
	  WebElement username =driver.findElement(By.xpath("//input[@id='input-username']"));
	  username.clear();
	  username.sendKeys("demo");
	  
	  WebElement password =driver.findElement(By.xpath("//input[@id='input-password']"));
	  password.clear();
	  password.sendKeys("demo");
	  
	  driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
	  
	  driver.findElement(By.xpath("//a[normalize-space()='Sales']")).click();
	  
	  driver.findElement(By.xpath("//a[normalize-space()='Orders']")).click();
	  
	  
	  String text =driver.findElement(By.xpath("//div[@class='col-sm-6 text-right']")).getText();
	  
	  int row =Integer.valueOf(text.substring(text.indexOf("(")+1, text.indexOf("Pages")-1));
	  
	  
	  System.out.println(row);
	  
	  
	  for(int p=1;p<=5;p++)
	  {
		  WebElement activepage =driver.findElement(By.xpath("//ul[@class='pagination']//li//span"));
		  
		  System.out.println("Active Page" + activepage.getText());
		  
		  //activepage.click();
		  
		  int rows =driver.findElements(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr")).size();
		  int colums =driver.findElements(By.xpath("//table[@class='table table-bordered table-hover']//tbody//td")).size();
		  System.out.println("Number of rows" +rows);
		  System.out.println("Number of columns" +colums);
		  
		  for(int r=1;r<=rows;r++)
		  {
			 String orderid= driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+rows+"]//td[2]")).getText();
			 String customers= driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+rows+"]//td[3]")).getText();
			 String status= driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+rows+"]//td[4]")).getText();
			 String total= driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+rows+"]//td[5]")).getText();
			 System.out.println(orderid + " " +customers+ " " +status+ " " +total);
			 
		  }
		  
		  String pageno =Integer.toString(p+1);
		  
		  driver.findElement(By.xpath("//ul[@class='pagination']//li//a[text()='"+pageno+"']")).click();
	  }
	  
	  
	}

}
