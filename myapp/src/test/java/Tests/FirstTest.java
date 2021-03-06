package Tests;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
//import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class FirstTest {
	
	public WebDriver driver;
	
	@Before
	public void homeTest() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\yagmur\\Desktop\\newchrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
       
        driver.get("https://www.gittigidiyor.com/");
        
        driver.manage().window().maximize();
        
        driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
        
	}
	
	@Test
	public void loginTest() { 
		if(driver!=null) {
		WebElement firstbtn = driver.findElement(By.id("myBtn")); // Giriş yap butonuna tıkla.
		firstbtn.click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//Siteye login olunması.
		WebElement username = driver.findElement(By.id("L-UserNameField"));
		username.click();
		username.sendKeys("admin");
		
		WebElement password = driver.findElement(By.id("L-PasswordField"));
		password.click();
		password.sendKeys("1234");
		driver.findElement(By.id("gg-login-enter")).click();
		}
	}
	
	@After
	public void closee() {
		if(driver!=null) {
		driver.quit();
		}
	}


}
