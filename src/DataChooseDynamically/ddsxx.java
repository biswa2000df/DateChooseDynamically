package DataChooseDynamically;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ddsxx {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\browserdrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/demo-site/datepicker/#DropDown%20DatePicker");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("window.scrollBy(0,-100)", "");
	
		driver.findElement(By.xpath("//li[text()='DropDown DatePicker']")).click();
		driver.switchTo().frame(driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div/div/div[2]/div/div/div[2]/p/iframe")));
		System.out.println("year");
	
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@class='hasDatepicker']"))).click();
		
		String total="12 Dec 2026";
		String month="";
		month=total.substring(3,6);
		String year="";
		year=total.substring(7,11);
		String date="";
		date=total.substring(0,2);
		System.out.println("The actual date is: "+date+"/"+month+"/"+year);
		
		driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div/div/select[2]")).click();
		driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div/div/select[2]/option[contains(text(),"+year+")]")).click();
		
		Select s=new Select(driver.findElement(By.xpath("/html/body/div/div/div/select[1]")));
	s.selectByVisibleText(month);
		driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td/a[contains(text(),"+date+")]")).click();
		
	
		//Thread.sleep(3000);
		
		//*[@id="ui-datepicker-div"]/div/div/select[1]/option[contains(text(),"May")]
	
		
//		WebElement live= driver.findElement(By.xpath("/html/body/div/div/div/select[1]/option[contains(text(),"+month+")]")); 

		
	
		
	}

}
