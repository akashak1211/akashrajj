package org.Insta;

import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class drop {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\AKASH\\\\eclipse-workspace\\\\insta\\\\driver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		
		WebElement click = driver.findElement(By.id("Skills"));
		Select select = new Select(click);
		List<WebElement> options = select.getOptions();
		File file = new File("")
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
}
