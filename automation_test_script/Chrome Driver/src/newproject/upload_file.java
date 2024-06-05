package newproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class upload_file {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
				WebDriver driver = new ChromeDriver();
				
				driver.get("https://omayo.blogspot.com/");
				
				driver.findElement(By.id("uploadfile")).sendKeys("C:\\Users\\ASUS\\OneDrive\\Pictures\\Screenshots\\Screenshot (31).png");
	}									  

}
