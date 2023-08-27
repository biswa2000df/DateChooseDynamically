ackage DataChooseDynamically;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DateChoose {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\browserdrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/demo-site/datepicker/");
//		JavascriptExecutor js=(JavascriptExecutor)driver;
//		js.executeScript("window.scrollBy(0,400)", "");
//		driver.findElement(By.xpath("//*[@id=\"post-2715\"]/div[2]/div/div/div[2]/div[3]/ul/li[5]/a")).click();
//		Thread.sleep(5000);
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"post-2661\"]/div[2]/div/div/div[1]/p/iframe")));
		driver.findElement(By.xpath("//input[@class='hasDatepicker']")).click();
		
		String month="April 2022";
		String s23="";
		s23=month.substring(6,10);
		System.out.println(s23);
		int a=Integer.parseInt(s23);
		System.out.println(s23);
		
		String day="15";
		if(a>2022)
		{
			while(true)
			{
			driver.findElement(By.xpath("//span[text()='Next']")).click();
			WebElement s1=driver.findElement(By.className("ui-datepicker-title"));
			String s2=s1.getText();
			
			if(month.equals(s2))
			{
				System.out.println(s2);
				break;
			}
			
			}
			driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr/td/a[contains(text(),"+day+")]")).click();
		}
		else if(a<=2022)
		{
			while(true)
			{
			driver.findElement(By.xpath("//span[text()='Prev']")).click();
			WebElement s11=driver.findElement(By.className("ui-datepicker-title"));
			String s22=s11.getText();
			
			if(month.equals(s22))
			{
				System.out.println(s22);
				break;
			}
			}
			driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr/td/a[contains(text(),"+day+")]")).click();
			
			
		}
			
		
		
		
		
	}

}
