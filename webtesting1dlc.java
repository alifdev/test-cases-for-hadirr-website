package webtesting1pck;
import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class webtesting1dlc {
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
		
		//choose sign up free trial
		WebElement freetrial = driver.findElement(By.className("btn-warning"));
		freetrial.click();
		
		// PERSONAL DATA
		
		//input full name
		WebElement fullname = driver.findElement(By.name("d1"));
		fullname.sendKeys("Baba Rahmat");
		
		//select occupation
		Select jbtn = new Select(driver.findElement(By.name("jobTitle")));
		jbtn.selectByIndex(3);
				
		//input email
		WebElement email = driver.findElement(By.name("d2"));
		email.sendKeys("babarahmat@gmail.com");
				
		//input password
		WebElement passA = driver.findElement(By.id("password"));
		passA.sendKeys("babatestingweb123");
				
		//input password confirmation
		WebElement passB = driver.findElement(By.id("konfirmasiPassword"));
		passB.sendKeys("babatestingweb123");
		
		//input company name
		WebElement cname = driver.findElement(By.id("namaPerusahaan"));
		cname.sendKeys("Testing");
		
		//select company field
		Select comfield = new Select(driver.findElement(By.name("d6")));
		comfield.selectByIndex(10);
		
		//input phone number
		WebElement phone = driver.findElement(By.name("d11"));
		phone.sendKeys("5464646");
		
		//select time zone
		Select tzone = new Select(driver.findElement(By.id("timeZone")));
		tzone.selectByIndex(8);
		
		//click sign up
		WebDriverWait wait2 = new WebDriverWait(driver, 10);
		wait2.until(ExpectedConditions.elementToBeClickable(By.id("createAccount")));
		
		String actualUrl="https://www.hadirr.com/signuptrial";
		String expectedUrl= driver.getCurrentUrl();
		assertEquals(expectedUrl,actualUrl);
		
		//closing the browser
		driver.close();
	}
}
