/**
 * 
 */
package Tests;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Model.LoginPage;

/**
 * @author yagmur
 *
 */
public class LoginTest {
	
    @Test
	public void verifyValidLogin()
	{
    	   WebDriver driver = new ChromeDriver();
    	   driver.manage().window().maximize();
    	   driver.get("https://www.gittigidiyor.com/uye-girisi?s=1");
    	   
    	   LoginPage login=new LoginPage(driver);
    	   
    	   login.typeUserName();
           login.typePassword();
           login.clickOnLoginButton();
           
           driver.quit();
	}
}
