package Selenium3;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Nyakka {
	public static void main(String[] args) throws AWTException, InterruptedException {
		
			System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\eclipse-workspace\\Project3\\Driver\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.nykaa.com/");
			driver.manage().window().maximize();
			
		//	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
			Thread.sleep(10000);
	
			//	WebElement signin = driver.findElement(By.xpath("//button[text()='Sign in']"));
			//a.moveToElement(signin).build().perform();
		//	Thread.sleep(5000);
		/*	WebElement Login = driver.findElement(By.xpath("(//button[@kind='secondary'])[1]"));
			Actions a = new Actions(driver);
			a.click(Login).perform();
			Thread.sleep(6000);
			WebElement email=driver.findElement(By.xpath("//input[@name='emailMobile']"));
			email.sendKeys("shrashmi1@gmail.com");
			WebElement Proceed = driver.findElement(By.xpath("(//button[@type='submit'])"));
			a.click(Proceed).perform();
			WebElement Sotp = driver.findElement(By.id("submitVerification"));
			Thread.sleep(6000);
			a.click(Sotp).perform();*/
			//a.keysDown()
			
			Actions a = new Actions(driver);
			WebElement all = driver.findElement(By.xpath("(//a[text()='skin'])[2]"));
			a.moveToElement(all).build().perform();
			WebElement e = driver.findElement(By.xpath("(//a[text()='Moisturizers'])[1]"));
			a.contextClick(e).build().perform();
			Thread.sleep(5000);
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_T);
			Thread.sleep(8000);
			
			String windowHandle1=driver.getWindowHandle();
			System.out.println(windowHandle1);
			int window=driver.getWindowHandles().size();
			System.out.println(window);
			Set<String> windowHandle = driver.getWindowHandles();
			for(String str : windowHandle) {
				String title=driver.switchTo().window(str).getTitle();
				System.out.println(title);
			}
			System.out.println(windowHandle);
			
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scroll(0,500)");  
			Thread.sleep(5000);
			
			WebElement e1 = driver.findElement(By.xpath("//div[@class='css-ifdzs8'][1]"));
			a.contextClick(e1).build().perform();
			Thread.sleep(5000);
			Robot r1 = new Robot();
			r1.keyPress(KeyEvent.VK_T);
			Thread.sleep(8000);
			
			String windowHandle2=driver.getWindowHandle();
			System.out.println(windowHandle2);
			
			int window1=driver.getWindowHandles().size();
			System.out.println(window1);
			
			Set<String> windowHandle3 = driver.getWindowHandles();
			for(String str : windowHandle3) {
				String title=driver.switchTo().window(str).getTitle();
				System.out.println(title);
			}           
			System.out.println(windowHandle3);
			JavascriptExecutor js1=(JavascriptExecutor)driver;
			js1.executeScript("window.scroll(0,300)");  
			Thread.sleep(5000);
			
		/*	WebElement img = driver.findElement(By.xpath("//div[@class='css-ifdzs8'][1]"));
			img.click();
			Thread.sleep(20000);*/
			WebElement AdToB = driver.findElement(By.xpath("(//button[@type='button'])[7]"));
			a.click(AdToB).build().perform();
			WebElement Cart = driver.findElement(By.xpath("(//button[@type='button'])[2]"));
			a.click(Cart).build().perform();
			Thread.sleep(9000);
			
			WebElement iframe=driver.findElement(By.xpath("//iframe[@class='css-acpm4k']"));
			driver.switchTo().frame(iframe);
			Thread.sleep(5000);
			
		/*	WebElement Proceed = driver.findElement(By.xpath("(//button[@class='css-1j2bj5f e8tshxd0'])[2]"));
			Thread.sleep(5000);
			a.moveToElement(Proceed).click().perform();
			Thread.sleep(000);
			
			WebElement ConAsGuest=driver.findElement(By.xpath("(//button[@class='css-110s749 e8tshxd1'])[2]"));
			a.click(ConAsGuest).build().perform();
			Thread.sleep(5000);
			
			WebElement PinCode=driver.findElement(By.xpath("(//input[@type='number'])[1]"));
			//JavascriptExecutor js17=(JavascriptExecutor)driver;
			//js17.executeScript("arguments[0].value='560001'",PinCode);
			PinCode.sendKeys("560001");
			Thread.sleep(6000);
			
		//	WebElement City=driver.findElement(By.xpath("//input[@value='Bangalore']"));
			//a.moveToElement(City).build().perform();
			//Thread.sleep(5000);
			//WebElement State=driver.findElement(By.xpath("//input[@value='Karnataka']"));
			//a.moveToElement(State).build().perform();
			//Thread.sleep(5000);
			
			WebElement FlatNo=driver.findElement(By.xpath("(//input[@type='text'])[3]"));
			//JavascriptExecutor js11=(JavascriptExecutor)driver;
			//js11.executeScript("arguments[0].value=arguments[1]","HouseNo,124/6",FlatNo);
			//driver.switchTo().alert().sendKeys("house 5678hkhj");
			FlatNo.sendKeys("HouseNo,124/6");
			Thread.sleep(5000);
			//Thread.sleep(9000);
			WebElement Area=driver.findElement(By.xpath("//textarea[@class='input-element input-area ']"));
			//JavascriptExecutor js12=(JavascriptExecutor)driver;
			//js12.executeScript("arguments[0].value=arguments[1]","RT Nagar Bangalore'",Area);
			//Thread.sleep(5000);
			//js12.executeScript("window.scroll(0,1000)");  
			Area.sendKeys("RT Nagar Bangalore");
			Thread.sleep(5000);
			
			WebElement name=driver.findElement(By.xpath("(//input[@type='text'])[4]"));
			//JavascriptExecutor js13=(JavascriptExecutor)driver;
			//js13.executeScript("arguments[0].value='Ravi'",name);
			  name.sendKeys("Ravi");
			Thread.sleep(5000);
			
			WebElement phone=driver.findElement(By.xpath("(//input[@type='number'])[2]"));
			//JavascriptExecutor js14=(JavascriptExecutor)driver;
			//js14.executeScript("arguments[0].value='9887657222'",phone);
			phone.sendKeys("9887657222");
			Thread.sleep(5000);
			
			WebElement Eid=driver.findElement(By.xpath("(//input[@type='email'])"));
			//JavascriptExecutor js15=(JavascriptExecutor)driver;
			//js15.executeScript("arguments[0].value='ravi@gmail.com'",Eid);
			Eid.sendKeys("ravi@gmail.com");
			Thread.sleep(5000);
			
			WebElement Ship = driver.findElement(By.xpath("(//button[@class='css-mq2cy2 e8tshxd0'])"));
			a.click(Ship).build().perform();
			//JavascriptExecutor js16=(JavascriptExecutor)driver;
			//js16.executeScript("arguments[0].click()",Ship);
			//a.click(Ship).build().perform();    */
			
	}
}


