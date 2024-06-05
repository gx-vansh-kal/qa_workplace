package newproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class newtour_Title {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");  
		   WebDriver driver=new ChromeDriver();
		   
		   driver.get("http://demo.guru99.com/test/newtours/");
		   
		   String expected_title = "Welcome: Mercury Tours " ; // because s
		   String actual_title = driver.getTitle();
		   
		   System.out.println(actual_title);
		   
		   if(actual_title.contentEquals(expected_title)) {
			   System.out.println("Test Case Passed");
		   }else {
			   System.out.println("Test Case Failed");
		   }
		   
//		   driver.close();
	}

}
