import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class carousel_Test {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.noon.com/uae-en/");
		
		driver.findElement(By.xpath("//div[@class='swiper-button-next custom-navigation swiper-nav-1618310965056']")).click();;
        
		
		
	}

}
