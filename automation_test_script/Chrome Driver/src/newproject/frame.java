package newproject;

import org.openqa.selenium.*;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class frame {
	public static void main(String[] args) {
		 
//			System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
		    WebDriver driver = new FirefoxDriver();
		    
		    driver.get("http://demo.guru99.com/selenium/deprecated.html");
		    driver.switchTo().frame("classFrame");
		    
		    try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    
		    WebElement Web = driver.findElement(By.linkText("Deprecated"));
		    Web.click();
		    
		    try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
//		    driver.close();
		    
	}
}
