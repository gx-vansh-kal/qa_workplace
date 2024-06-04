package stopbedroom;

import java.time.Duration;
import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class checking_Data {

	public static String Date(WebElement baseUrl,int i,int j,String prev_date) {
		
		try {
			 WebElement Date = baseUrl.findElement(By.className("slot-date"));
//			 System.out.println(Date.getText());
			 return Date.getText();
		 }catch(Exception e) {
			 return prev_date;
		 }
	}
	
	public static void main(String[] args) throws InterruptedException {
		
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
		
		//Filter Days
		WebElement days = driver.findElement(By.id("custom_report_trigger"));
		Thread.sleep(1000);
		
		days.click();
		days.sendKeys("Last 14 Days");
		System.out.println("For Last 14 Days");

		Thread.sleep(500);
		days.click();
		
		Thread.sleep(500);
		WebElement search = driver.findElement(By.className("search-btn-div"));
		search.click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[2]/div/div[4]/div/div[2]/div/table/tbody/tr[5]")));
		
		 List<WebElement> outer_rows = driver.findElements(By.xpath("/html/body/div[1]/div[2]/div/div[4]/div/div[2]/div/table/tbody/tr"));
		 System.out.println("Number of outer rows in the table: " + outer_rows.size());
		 String prev_date = "";
		 System.out.println("UserName \t Tsheetid \t Date \t\t StartTime \t EndTime");

		 
		 for(int i = 1 ; i<=outer_rows.size() ; i++) {	 
			 
			 List<WebElement> inner_rows = driver.findElements(By.xpath("/html/body/div[1]/div[2]/div/div[4]/div/div[2]/div/table/tbody/tr[" + i + "]/td[6]/table/tbody/tr"));
		 	 
					 
					 for(int j = 1 ; j<=inner_rows.size() ; j++) {
						 String expected_result = "-" ;
						 
						 WebElement baseUrl = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[4]/div/div[2]/div/table/tbody/tr[" + i + "]/td[6]/table/tbody/tr[" + j + "]"));
		
						 WebElement username = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[4]/div/div[2]/div/table/tbody/tr[" + i + "]/td[1]"));
		
						 WebElement tsheetid = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[4]/div/div[2]/div/table/tbody/tr[" + i + "]/td[2]"));
						 
						 WebElement startTime = baseUrl.findElement(By.className("slot-start-date"));
						 
						 WebElement actual_result = baseUrl.findElement(By.className("slot-end-date"));
						 
						 String EndTime = actual_result.getText();
						
						 String date = Date(baseUrl , i , j ,prev_date);
						 prev_date = date ;
						 
						 if(EndTime.contentEquals(expected_result)) {
		//					 System.out.println("Total Number of rows present in ("+i+")"+username.getText()+" are " + inner_rows.size());
		//					 System.out.println("UserName \t Tsheetid \t Date \t\t StartTime \t EndTime");
							 System.out.println(username.getText() + " \t " + tsheetid.getText() + " \t " + date + " \t " + startTime.getText() + " \t " + EndTime);
						 }
				 
			 }
		 }			 
		 
	}

}


//+ date.getText() + " \t "

//		 List<WebElement> columns = driver.findElements(By.xpath("/html/body/div[1]/div[2]/div/div[4]/div/div[2]/div/table/tbody/tr[1]/td[6]/table/tbody/tr[3]/td"));
//		 System.out.println("Number of inner_columns in the table: " + columns.size());

//		 	 System.out.println("Number of inner rows in the "+i+" rows : " + inner_rows.size());

//		 	 System.out.println("UserName \tStartTime \tEndTime");

//		 List<WebElement> inner_rows = driver.findElements(By.xpath("/html/body/div[1]/div[2]/div/div[4]/div/div[2]/div/table/tbody/tr[1]/td[6]/table/tbody/tr"));
//		 System.out.println("Number of inner rows in the table: " + inner_rows.size());

//		 int i = 15 ;
//		 int j = 3 ;
//		 
//		 WebElement actual_result = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[4]/div/div[2]/div/table/tbody/tr["+i+"]/td[6]/table/tbody/tr["+j+"]/td[3]"));
//				 actual_result.getText();
//				 System.out.println(actual_result.getText());

//			 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[2]/div/div[4]/div/div[2]/div/table/tbody/tr[1]/td[6]/table/tbody/tr[5]")));

//				 WebElement actual_result = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[4]/div/div[2]/div/table/tbody/tr[" + i + "]/td[6]/table/tbody/tr[" + j + "]/td[3]"));

//				 System.out.println(result);
//				 System.out.println(username.getText()+"\t"+actual_result.getText());

//			 	for(int j = 1 ; j<inner_rows.size() ; j++) {
//			 		String expected_result = "-" ;
//			 		
//			 		WebElement actual = driver.findElement(By.className("slot-end-date"));
//			 		actual.getText();
//			 		
//			 		System.out.println(actual.getText());
//			 	}

//			 /html/body/div[1]/div[2]/div/div[4]/div/div[2]/div/table/tbody/tr[i]/td[6]/table/tbody/tr[j]/td[3]

//		 for(WebElement rows : outer_rows) {
//			 
////			WebElement endTime=rows.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[4]/div/div[2]/div/table/tbody/tr[i]/td[6]/table/tbody/tr"));
//			WebElement endTime = rows.findElement(By.xpath("//*[@id=\"time-slots-table-378\"]/tbody/tr[2]/td[3]"));
//	    	   System.out.println("Value of row is : " +endTime.getText());
//			 
//		 }