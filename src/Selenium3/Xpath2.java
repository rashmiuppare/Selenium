package Selenium3;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Xpath2 {

		public static void main(String[] args) throws InterruptedException, AWTException {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\eclipse-workspace\\Project3\\Driver\\chromedriver.exe");
			
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://www.Amazon.in");
			driver.manage().window().maximize();
			
		/*	WebElement first = driver.findElement(By.xpath("//input[@name='firstname']"));
			first.sendKeys("Rashmi");
			
			WebElement Surnm = driver.findElement(By.xpath("//input[@name='lastname']"));
			Surnm.sendKeys("dhdhdj");*/
			Actions a=new Actions(driver);
			WebElement Mobiles = driver.findElement(By.xpath("//a[@data-csa-c-content-id='nav_cs_mobiles']"));
			a.contextClick(Mobiles).build().perform();
			Thread.sleep(5000);
			Robot r=new Robot();
			r.keyPress(KeyEvent.VK_T);
	}

}