package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo {
public static void main(String args[])
{
	System.setProperty("webdriver.chrome.driver","D:\\softwere\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.google.com");
	driver.findElement(By.className("gLFyf")).sendKeys("www.wapking.com");
	driver.findElement(By.name("btnK")).submit();
	driver.findElement(By.className("gLFyf")).clear();
	driver.findElement(By.className("gLFyf")).sendKeys("www.pagalworld.com");
	driver.findElement(By.className("z1asCe")).submit();
	driver.findElement(By.className("LC20lb")).click();
	driver.findElement(By.linkText("Bollywood Movies Hindi Mp3 Songs 2019")).click();
	
}
}
