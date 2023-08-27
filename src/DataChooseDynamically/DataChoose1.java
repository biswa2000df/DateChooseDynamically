package DataChooseDynamically;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataChoose1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\browserdrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/demo-site/datepicker/#Simple%20Date%20Picker");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("window.scrollBy(0,2000)", "");
		js.executeScript("window.scrollBy(0,-200)", "");
		driver.findElement(By.id("DropDown DatePicker")).click();
		Thread.sleep(5000);
		
		driver.switchTo().frame(driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div/div/div[2]/div/div/div[2]/p/iframe")));
		
		driver.findElement(By.xpath("/html/body/p/input")).click();
//		String year="2026";
//		System.out.println(year);
//		driver.findElement(By.xpath("/html/body/div/div/div/select[2]/option[contains(text(),"+year+")]")).click();

	}

}
