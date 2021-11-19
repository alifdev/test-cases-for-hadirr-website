package webtesting1pck;
import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class webtesting1dla {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//setting the driver executable
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\asus\\Downloads\\chromedriver_win32\\chromedriver.exe");

		//Initiating your chromedriver
		WebDriver driver=new ChromeDriver();

		//Applied wait time
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//maximize window
		driver.manage().window().maximize();

		//open browser with desried URL
		driver.get("http://hadirr.com");
		
		//choose sign in
		WebElement masok = driver.findElement(By.className("btn-light"));
		masok.click();
		
		//input email
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("babarahmat@gmail.com");
				
		//input password
		WebElement passkey = driver.findElement(By.id("password"));
		passkey.sendKeys("babatestingweb123");
				
		//click sign in
		WebDriverWait wait2 = new WebDriverWait(driver, 10);
		wait2.until(ExpectedConditions.elementToBeClickable(By.className("btn-warning")));
		
		String actualUrl="https://www.hadirr.com/";
		String expectedUrl= driver.getCurrentUrl();
		assertEquals(expectedUrl,actualUrl);
		
		//closing the browser
		driver.close();
	}
}