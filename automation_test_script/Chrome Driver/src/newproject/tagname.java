package newproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class tagname {
		public static void main(String[] args){

//			    System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
			    WebDriver driver = new FirefoxDriver();
			        
			    String tagName = "";
			        
			    driver.get("http://www.facebook.com");
			    tagName = driver.findElement(By.id("email")).getTagName();
			    System.out.println(tagName);
			        
//			    driver.close();
		}
			
	}
