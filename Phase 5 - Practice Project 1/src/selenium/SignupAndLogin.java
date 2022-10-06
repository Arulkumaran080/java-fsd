package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignupAndLogin {
	public static void main(String[] args) throws InterruptedException {
		String url="http://localhost:4200";
		String email="Vijay@gmail.com";
		String password="Vijay";
		String mobile="9638520147";
		String name="Vijay";
		System.setProperty("webdriver.chrome.driver", "D:\\Java FSD Training\\Phase 5\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
			
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@ng-reflect-router-link='/signup']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@formcontrolname='fullname']")).sendKeys(name);
		System.out.println("fullname Enter successfully");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@formcontrolname='mobile']")).sendKeys(mobile);
		System.out.println("Mobile Number enter successfully");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@formcontrolname='email']")).sendKeys(email);
		System.out.println("Email enter successfully");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@formcontrolname='password']")).sendKeys(password);
		System.out.println("Password enter successfully");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@value='Register']")).click();
		System.out.println("Signup successfully");
		Thread.sleep(2000);
		login(email,password);
	}
	static void login(String email,String password) throws InterruptedException{	
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("http://localhost:4200/login");
		
		driver.findElement(By.cssSelector("#exampleInputEmail1")).sendKeys(email);
		System.out.println("Email field is filled");
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("#exampleInputPassword1")).sendKeys(password);
		System.out.println("Password field is filled");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		System.out.println("Login successfully");
	}

}
