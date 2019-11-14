package jenkins.maven.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Checking_Jenkins_Integration {

	
	WebDriver dr;
	@Test
	public void launch() throws InterruptedException, AWTException {
		
		System.out.println("launching a browser");
		dr=new ChromeDriver();
		dr.get("https://www.flipkart.com/");
		dr.manage().window().maximize();
		Robot row=new Robot(); 
		row.keyPress(KeyEvent.VK_ESCAPE);
		Thread.sleep(2000);
		row.keyRelease(KeyEvent.VK_ESCAPE); 
		dr.findElement(By.xpath("//*[contains(text(),'Offer Zone')]")).click();
		Thread.sleep(2000);
		dr.navigate().back();
		Thread.sleep(2000); 
		dr.navigate().refresh();   
		Thread.sleep(2000);
		dr.close();
		
	}
}
