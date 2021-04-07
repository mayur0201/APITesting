import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandel {

	public static void main(String[] args) {
        
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
		
		Set<String> windowhandl =driver.getWindowHandles();
		
		Iterator<String> it=windowhandl.iterator();
		
		String parentid=it.next();
		String childid=it.next();
		
		System.out.println("Parent window handel id" + parentid);
		System.out.println("Child window handel id" + childid);
		
		driver.switchTo().window(parentid);
		
		System.out.println("Title of parent Tile" + driver.getTitle());
		
         driver.switchTo().window(childid);
		
		System.out.println("Title of child Tile" + driver.getTitle());
		
		

	}

}
