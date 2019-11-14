package jenkins.maven.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Character_Sequence {
	
		WebDriver dr;
		@Test
		public void char_sequence_I() throws InterruptedException {
			
			dr=new ChromeDriver();
			dr.get("https://accounts.google.com/");
			dr.manage().window().maximize();
			dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			WebElement un=dr.findElement(By.xpath("//input[@id='identifierId']"));
			un.sendKeys("common r general way");
			Thread.sleep(3000);
			dr.close();
		}
		@Test
		public void char_sequence_II() throws InterruptedException {
			
			dr=new ChromeDriver();
			dr.get("https://accounts.google.com/");
			dr.manage().window().maximize();
			dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			WebElement un=dr.findElement(By.xpath("//input[@id='identifierId']"));
			
			StringBuilder uname=new StringBuilder()
				.append("sravanth")
				.append(" ")
				.append("raj")
				.append(" ")
				.append("reddy");
			un.sendKeys(uname);
			Thread.sleep(3000);
				dr.close();
		}
		@Test
		public void char_sequence_III() throws InterruptedException {
			
			dr=new ChromeDriver();
			dr.get("https://accounts.google.com/");
			dr.manage().window().maximize();
			dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			WebElement un=dr.findElement(By.xpath("//input[@id='identifierId']"));
			
			StringBuffer uname=new StringBuffer()
				.append("sravanth")
				.append(" ")
				.append("raj")
				.append(" ")
				.append("reddy");
			un.sendKeys(uname);
			Thread.sleep(3000);
				dr.close();
		}
		@Test
		public void char_sequence_IV() throws InterruptedException {
			
			dr=new ChromeDriver();
			dr.get("https://accounts.google.com/");
			dr.manage().window().maximize();
			dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			WebElement un=dr.findElement(By.xpath("//input[@id='identifierId']"));
			
			StringBuilder uname=new StringBuilder()
				.append("sravanth")
				.append(" ")
				.append("raj")
				.append(" ")
				.append("reddy");
			
			String space=" ";
			
			StringBuffer name=new StringBuffer()
					.append("sravanth")
					.append(" ")
					.append("kumar");
			
			String author="sravanth";
			
			un.sendKeys(uname,space,name,author,Keys.TAB);
			Thread.sleep(3000);
				dr.close();
		}
}
