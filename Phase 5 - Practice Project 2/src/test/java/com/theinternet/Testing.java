package com.theinternet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;
@Test
public class Testing {
	
	private static String url;

	WebDriver driver = null;
	WebDriverWait wait = null;
	
	@BeforeTest
	public void start() {
		System.setProperty("webdriver.chrome.driver", "D:\\\\Java FSD Training\\\\Phase 5\\\\chromedriver_win32\\\\chromedriver.exe");
		driver = new ChromeDriver();
		System.out.print("BeforeTest");
	}
	
	
	@Test(priority=0)
	public void signupform() throws InterruptedException {
		driver.get("https://www.amazon.in/ap/register?showRememberMe=true&openid.pape.max_auth_age=0&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&pageId=inflex&mobileBrowserWeblabTreatment=C&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F%26ext_vrnc%3Dhi%26tag%3Dgooghydrabk1-21%26ref%3Dnav_custrec_signin%26adgrpid%3D60612964962%26hvpone%3D%26hvptwo%3D%26hvadid%3D486452179346%26hvpos%3D%26hvnetw%3Dg%26hvrand%3D9841073734059651307%26hvqmt%3De%26hvdev%3Dc%26hvdvcmdl%3D%26hvlocint%3D%26hvlocphy%3D9040217%26hvtargid%3Dkwd-49491430%26hydadcr%3D14454_2154375%26gclid%3DCj0KCQjwnP-ZBhDiARIsAH3FSRcBo1jVo-9fxiN07SCChdLA3_mrWvIXAq-6_QjeOC09Jndm3nOnhnsaApgzEALw_wcB&prevRID=YZ4QD3P51H333SXTQAQV&openid.assoc_handle=inflex&openid.mode=checkid_setup&desktopBrowserWeblabTreatment=C&prepopulatedLoginId=&failedSignInCount=0&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		System.out.println("page is opened");
		driver.manage().window().maximize();
		driver.findElement(By.name("customerName")).sendKeys("Arulkumaran T");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"ap_customer_name\"]"));
		Thread.sleep(1000);
		driver.findElement(By.name("email")).sendKeys("8397078956");
		Thread.sleep(1000);
		driver.findElement(By.name("password")).sendKeys("password");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
		Thread.sleep(30000);
		System.out.println("Registered Successfully");
	}
	
	
	@Test(priority=1)
	public void login() throws InterruptedException {
		driver.navigate().to("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F%26ext_vrnc%3Dhi%26tag%3Dgooghydrabk1-21%26ref%3Dnav_signin%26adgrpid%3D60456322738%26hvpone%3D%26hvptwo%3D%26hvadid%3D486393568006%26hvpos%3D%26hvnetw%3Dg%26hvrand%3D6997137485526089466%26hvqmt%3De%26hvdev%3Dc%26hvdvcmdl%3D%26hvlocint%3D%26hvlocphy%3D9040217%26hvtargid%3Dkwd-298441377801%26hydadcr%3D14451_2154369%26gclid%3DCj0KCQjwnP-ZBhDiARIsAH3FSRc5VrAX7PBVfkTQ4RdZsIz5EePzVzc6bWnwtNjdbXVdgZxlXt9gEZsaArytEALw_wcB&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("8397078956");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("password");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
		Thread.sleep(2000);
		System.out.println("Login Successfully");
		url=driver.getCurrentUrl();
		
	}
	
	@Test(priority = 2)
	public void search() throws InterruptedException {
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("samsung phone");
		Thread.sleep(2000);
		
		driver.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.partialLinkText("Samsung Galaxy S22 5G")).click();
		Thread.sleep(2000);
		wait = new WebDriverWait(driver,2);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("SAMSUNG Galaxy A13 5G Cell Phone, Factory Unlocked Android Smartphone")));
		
		driver.findElement(By.xpath("//input[@aria-labelledby='comparison_add_to_cart_button-announce']")).click();
		wait = new WebDriverWait(driver,2);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("nav-cart")));
		
		driver.findElement(By.id("nav-cart")).click();
		System.out.println("Product added to cart Successfully");

	}
	
	@Test(priority = 3)
	public void cart() {
		driver.findElement(By.id("nav-cart")).click();
	}
	
	@AfterSuite
	public void end() {
		driver.close();
		System.out.println("Testing Ended successfully");
	}
	
}
