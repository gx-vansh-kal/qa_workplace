package stopbedroom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class order_report {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//		System.setProperty("webdriver.chrome.driver","D:\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.navigate().to("http://www.google.com/");
		
		driver.manage().window().maximize();
		
		// Login page 
		driver.get("https://admin:Adminccc321@sb2.cc-1.in/index.php/bullhorn");
		
		Thread.sleep(1000);
		
		WebElement email = driver.findElement(By.name("login[username]"));
		WebElement password = driver.findElement(By.name("login[password]"));
		
		email.sendKeys("testadmin");
		password.sendKeys("nBGF9uw70lK6VpcxGgRS");
		
		driver.findElement(By.className("form-button")).click();
		
		//Staff
		driver.findElement(By.linkText("Staff")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.linkText("Tsheet Time Log")).click();
		
		Thread.sleep(1000);
		
		WebElement menu = driver.findElement(By.id("navigation-main-menu-icon"));
		menu.click();		
		Thread.sleep(1000);		
		
		WebElement customer_portal = driver.findElement(By.id("iconNav_2"));
		customer_portal.click();
		
//		Thread.sleep(500);
//		driver.findElement(By.linkText("Order Report")).click();
//		driver.findElement(By.xpath("*[@id=\"mCSB_6_container\"]/ul/li[3]/div[1]/div/a/span"))click();
//		driver.findElement(By.cssSelector("a.\"last-level  customerportal-menu\"[tab-id=\"reports\"]")).click();
//		driver.findElement(By.cssSelector("li[tab-id=\"reports\"]")).click();
//		
//		menu.click();
		
	}

}
