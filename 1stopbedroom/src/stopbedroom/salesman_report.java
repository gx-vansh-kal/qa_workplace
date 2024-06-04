package stopbedroom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class salesman_report {

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
		
		WebElement salesman = driver.findElement(By.linkText("Salesman"));
		salesman.click();
		
		WebElement days = driver.findElement(By.id("custom_report_trigger"));
		Thread.sleep(1000);
		
		days.click();
		days.sendKeys("Last 14 Days");
		Thread.sleep(500);
		days.click();
		
		Thread.sleep(500);
		WebElement search = driver.findElement(By.className("search-btn-div"));
		search.click();
	}

}
