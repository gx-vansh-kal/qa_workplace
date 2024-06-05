package newproject;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    WebDriver driver = new ChromeDriver();
	    
	    driver.navigate().to("http://jsbin.com/usidix/1");
	    
//	    driver.findElement(By.tagName("input[onclick=\"showAlert()\"]")).click();
	    driver.findElement(By.cssSelector("input[onclick=\"showAlert()\"]")).click();
	    
	    driver.switchTo().alert().getText();
	    
	    try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	    driver.switchTo().alert().accept();
	    
//	    String Message ;
//	    Message = driver.switchTo().alert().getText();
//	    System.out.println(Message);
	    
	}

}
