package guru.nine.bank;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_Module {
	
	public void login() throws InterruptedException {
		
		WebDriver dr = new ChromeDriver();
		dr.get("http://www.demo.guru99.com/V4/");
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		dr.findElement(By.xpath("//input[@name='uid']")).sendKeys("mngr232818");
		Thread.sleep(3000);
		dr.findElement(By.xpath("//input[@name='password']")).sendKeys("rUqEbad");
		Thread.sleep(3000);
		dr.findElement(By.xpath("//input[@name='btnLogin']")).click();
		Thread.sleep(3000);
		dr.close();
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		Login_Module lm=new Login_Module();
		lm.login();
	}

}
