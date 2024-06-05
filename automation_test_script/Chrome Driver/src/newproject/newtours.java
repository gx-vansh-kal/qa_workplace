package newproject;

import java.util.Scanner;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver; 

public class newtours {
	public static void main(String[] args) {
		
		Scanner user_input = new Scanner(System.in);
		
		System.out.println("Enter the Page Number between 1-6 :");
		int page_no = user_input.nextInt();
		
		//System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://demo.guru99.com/test/newtours/register.php");
		
		driver.manage().window().maximize(); 
		
		WebElement SEO = driver.findElement(By.linkText("SEO"));
		
		SEO.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		while( page_no >= 1 ) {
			
			switch(page_no) {
				case 1 :
					driver.findElement(By.linkText("Page-1")).click();	
					break;
				case 2 :
					driver.findElement(By.linkText("Page-2")).click();
					break;
				case 3 :
					driver.findElement(By.linkText("Page-3")).click();
					break;
				case 4 :
					driver.findElement(By.linkText("Page-4")).click();
					break;
				case 5 : 
					driver.findElement(By.linkText("Page-5")).click();
					break;
				case 6 :
				driver.findElement(By.linkText("Page-6")).click();
				break;
			}
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			try {
				driver.switchTo().frame("google_ads_iframe_/24132379/INTERSTITIAL_DemoGuru99_0");
				driver.findElement(By.id("dismiss-button")).click();			
			}catch(Exception e) {
				System.out.println(e);
			}
			
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	//		System.out.println("");
			driver.navigate().back();
			
			System.out.println("Enter the Page Number between 1-6 :");
			page_no = user_input.nextInt();
			
		}
//		driver.findElement(By.xpath("//html/body/div/div/div/div/div/svg")).click();
//		driver.findElement(By.xpath("//html/body/div[@id='ad_position_box']/div[@id='card']/div[@class='toprow']/div[@id='dismiss-button']/div[@style='cursor:pointer']/svg/path[@d='M38 12.83L35.17 10 24 21.17 12.83 10 10 12.83 21.17 24 10 35.17 12.83 38 24 26.83 35.17 38 38 35.17 26.83 64z']")).click();
//		WebElement CloseButton = driver.findElement(By.id("dismiss-button"));
//		CloseButton.click();
		
	}
}
