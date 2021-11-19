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

public class webtesting1dlb {
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
		
		//choose sign up
		WebElement daftar = driver.findElement(By.className("btn-secondary"));
		daftar.click();
		
		// PERSONAL DATA
		
		//input kuota personalia
		WebElement kuper = driver.findElement(By.id("kuota"));
		kuper.sendKeys("6");
		
		//select payment period
		Select pp = new Select(driver.findElement(By.id("periodePembayaran")));
		pp.selectByIndex(1);
		
		//input full name
		WebElement fname = driver.findElement(By.id("fullName"));
		fname.sendKeys("Baba Rahmat");
		
		//select occupation
		Select jabatan = new Select(driver.findElement(By.id("occupation")));
		jabatan.selectByIndex(3);
		
		//input email
		WebElement email = driver.findElement(By.name("d2"));
		email.sendKeys("babarahmat@gmail.com");
		
		//input password
		WebElement pass1 = driver.findElement(By.id("password"));
		pass1.sendKeys("babatestingweb123");
		
		//input password confirmation
		WebElement pass2 = driver.findElement(By.id("konfirmasiPassword"));
		pass2.sendKeys("babatestingweb123");
		
		// COMPANY DATA
		
		//input company name
		WebElement cname = driver.findElement(By.id("namaPerusahaan"));
		cname.sendKeys("Testing");
		
		//select company field
		Select cfield = new Select(driver.findElement(By.name("d6")));
		cfield.selectByIndex(10);
		
		//input company address
		WebElement caddress = driver.findElement(By.id("alamatPerusahaan"));
		caddress.sendKeys("Petkov Street no. 11");
		
		//select country
		Select ctry = new Select(driver.findElement(By.id("country")));
		ctry.selectByIndex(7);
		
		//input postal code
		WebElement kopos = driver.findElement(By.name("d10"));
		kopos.sendKeys("15151");
		
		//select time zone
		Select tzone = new Select(driver.findElement(By.id("timeZone")));
		tzone.selectByIndex(8);
		
		//input phone number
		WebElement phone = driver.findElement(By.name("d11"));
		phone.sendKeys("5464646");
		
		//agree terms & conditions
		WebElement tnc = driver.findElement(By.xpath("//input[@type='checkbox']"));
		tnc.click();
		
		//click sign up
		WebDriverWait wait2 = new WebDriverWait(driver, 10);
		wait2.until(ExpectedConditions.elementToBeClickable(By.id("createAccount")));
				
		String actualUrl="https://www.hadirr.com/signup";
		String expectedUrl= driver.getCurrentUrl();
		assertEquals(expectedUrl,actualUrl);
		
		//closing the browser
		driver.close();
	}
}
