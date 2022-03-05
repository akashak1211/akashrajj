package org.Insta;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class bankid {

	public static void main(String[] args) throws InterruptedException {
		
				
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AKASH\\eclipse-workspace\\insta\\driver\\chromedriver.exe");
		
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.t-mobile.com/?src=spr&rdpage=%2F");
	driver.manage().window().maximize();
	
	WebElement lnkphones = driver.findElement(By.id("digital-header-nav-link-head-1"));
	Actions action = new Actions(driver);
	action.moveToElement(lnkphones).perform();
	WebElement btn5G = driver.findElement(By.xpath("//span[text()='5G phones']"));
	btn5G.click();
	Thread.sleep(10000);
	WebElement txtword = driver.findElement(By.xpath("//a[text()=' Do Not Sell My Personal Information']"));
	String text = txtword.getText();
	System.out.println(text);
	
		
	
		

	}
	
	
	
	
}
