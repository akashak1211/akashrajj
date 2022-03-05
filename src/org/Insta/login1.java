package org.Insta;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class login1 {
 public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AKASH\\eclipse-workspace\\insta\\driver\\chromedriver.exe");
       WebDriver driver=new ChromeDriver();
       driver.get("https://adactinhotelapp.com/");
 driver.manage().window().maximize();
       WebElement ak = driver.findElement(By.xpath("//input[@id='username']"));
       ak.sendKeys("naveen53");
       
       WebElement ak2 = driver.findElement(By.xpath("//input[@id='password']"));
       ak2.sendKeys("C1IZAU");
       
       WebElement ak3 = driver.findElement(By.xpath("//input[@id='login']"));
       ak3.click();
       
       WebElement ak4 = driver.findElement(By.xpath("//select[@id='location']"));  
       Select select = new Select(ak4);
       select.selectByIndex(3);   
       
       WebElement ak5 = driver.findElement(By.xpath("//select[@id='hotels']"));
       Select select1 = new Select(ak5);
       select1.selectByIndex(4);
       
       WebElement ak6 = driver.findElement(By.xpath("//input[@id='Submit']"));
       ak6.click();
       
       WebElement ak7 = driver.findElement(By.xpath("//input[@id='radiobutton_1']"));
	   ak7.click();
	   
	
	   WebElement ak8 = driver.findElement(By.xpath("//input[@id='continue']"));
	   ak8.click();
	   
	   WebElement ak9 = driver.findElement(By.xpath("//input[@id='first_name']"));
	   ak9.sendKeys("Akash");
	   
	  
	   WebElement ak10 = driver.findElement(By.xpath("//input[@id='last_name']"));
	   ak10.sendKeys("Kumar");
	   
	   
	   WebElement ak11 = driver.findElement(By.xpath("//textarea[@id='address']"));
	   ak11.sendKeys("Thoraipakkam");
	   
	   WebElement ak12 = driver.findElement(By.xpath("//input[@id='cc_num']"));
	   ak12.sendKeys("1234567891234567");
	   
	   WebElement card = driver.findElement(By.xpath("//select[@id='cc_type']"));
	   Select select9 = new Select(card);
	   select9.selectByIndex(2);
			   
	  WebElement date = driver.findElement(By.xpath("//select[@id='cc_exp_month']"));
	  Select select12 = new Select(date);
	  select12.selectByIndex(2);
	  
	  WebElement year = driver.findElement(By.xpath("//select[@id='cc_exp_year']"));
	  Select select13 = new Select(year);
	  select13.selectByIndex(7);
	  
	  WebElement cvv = driver.findElement(By.xpath("//input[@id='cc_cvv']"));
	  cvv.sendKeys("334");
	  
	  WebElement book = driver.findElement(By.xpath("//input[@id='book_now']"));
	  book.click();
	  
	  
	  Thread.sleep(10000);
	  WebElement out = driver.findElement(By.id("order_no"));
	String outpu = out.getAttribute("value");
	System.out.println(outpu);
	  
	  
	  
	  
	  
	  
	  
	   
	   
	   
	   
	
	
		
	}
	
	

}
