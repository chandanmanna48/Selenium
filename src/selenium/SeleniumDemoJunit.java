package selenium;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemoJunit {
	WebDriver driver=null;
	public static void main(String args[])
	{
		SeleniumDemoJunit ob=new SeleniumDemoJunit();
		ob.test();
	}
	
		@Before
		public void setup()
		{
			System.setProperty("webdriver.chrome.driver","D:\\softwere\\chromedriver.exe");
		    driver =new ChromeDriver();
		}
		
		@Test
		public void test()
		{
			driver.get("https://www.google.com");
			driver.manage().window().maximize();
			driver.findElement(By.className("gLFyf")).sendKeys("www.wapking.com");
			driver.findElement(By.name("btnK")).submit();
			driver.findElement(By.className("gLFyf")).clear();
			driver.findElement(By.className("gLFyf")).sendKeys("www.pagalworld.com");
			driver.findElement(By.className("z1asCe")).submit();
			driver.findElement(By.className("LC20lb")).click();
			driver.findElement(By.linkText("Bollywood Movies Hindi Mp3 Songs 2019")).click();
			driver.findElement(By.linkText("Luka Chuppi (2019) Mp3 Songs")).click();
			driver.findElement(By.linkText("Duniyaa - Luka Chuppi")).click();
			driver.findElement(By.className("dbutton")).click();
			
		}
		@After
		public void close()
		{
			driver.close();
		}
		
		
}

