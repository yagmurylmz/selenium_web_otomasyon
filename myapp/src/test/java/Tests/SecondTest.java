package Tests;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;  
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebElement;

public class SecondTest {
	
   
	Actions action;

	public SecondTest(WebDriver driver) {
	action = new Actions(driver);
	}

	public void pressEnter() {
	action.sendKeys(Keys.ENTER).build().perform();
	}

	public static void main(String[] args) throws InterruptedException{
		
    System.setProperty("webdriver.chrome.driver","C:\\Users\\yagmur\\Desktop\\newchrome\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
	SecondTest objSearch = new SecondTest(driver);
	
	driver.get("https://www.gittigidiyor.com/");
	driver.manage().window().maximize();
	
	/*Arama kutusuna  "Bilgisayar" yazıp, arama */
	WebElement inputSearch = driver.findElement(By.xpath("//*[@id=\"main-header\"]/div[3]/div/div/div/div[2]/form/div/div[1]/div[2]/input"));
	inputSearch.sendKeys("Bilgisayar");
	objSearch.pressEnter();
	
	Thread.sleep(2000);
	
	WebElement element = driver.findElement(By.xpath("//*[@id=\"best-match-right\"]/div[5]/ul/li[2]/a"));
	JavascriptExecutor executor = (JavascriptExecutor)driver;
	executor.executeScript("arguments[0].click();", element);

	
	
	
	}   
  }