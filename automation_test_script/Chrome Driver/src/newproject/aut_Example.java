
package newproject;

import java.util.Scanner;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class aut_Example {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		String user,status  ;
		
		System.out.println("Choose the option : Yes or No ");
		user = in.nextLine();
		
		System.out.println("Want to Check or Reset : ");
		status = in.nextLine();
		
//		System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
	    WebDriver driver = new ChromeDriver();	    
	    
	    driver.navigate().to("http://demo.guru99.com/test/ajax.html");
	    
	    if(user.contentEquals("Yes")){
	    	
	    	WebElement Web = driver.findElement(By.id("yes"));
	    	Web.click();
	    	
	    	try {
	    		Thread.sleep(1000);
	    	} catch (InterruptedException e) {
	    		// TODO Auto-generated catch block
	    		e.printStackTrace();
	    	}
	    	
	    	// for Check button
	    	if(status.contentEquals("Check")) {
	    		
	    		WebElement check = driver.findElement(By.id("buttoncheck"));
		    	check.click();
		    	
		    	String msg = driver.findElement(By.className("radiobutton")).getText();
		    	
		    	System.out.println(msg);
	    	}else {
	    		driver.findElement(By.cssSelector("input[type=\"reset\"]")).click();
	    	}	    
	    }else{
	    	  
	    	WebElement Web = driver.findElement(By.id("no"));
	    	Web.click();
	    	
	    	try {
	    		Thread.sleep(1000);
	    	} catch (InterruptedException e) {
	    		// TODO Auto-generated catch block
	    		e.printStackTrace();
	    	}
	    	
	    	if(status.contentEquals("Check")) {
				    		
				 WebElement check = driver.findElement(By.id("buttoncheck"));
				 check.click();
					    	
			     String msg = driver.findElement(By.className("radiobutton")).getText();
					    	
			     System.out.println(msg);
			}else {
				 driver.findElement(By.cssSelector("input[type=\"reset\"]")).click();
			}
	    }	    		
	}
}
