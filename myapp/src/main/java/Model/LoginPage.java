/**
 * 
 */
package Model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author yagmur
 * Login sayfasının konum ve yöntemlerini burda saklayacak.
 */
public class LoginPage {
	
	WebDriver driver;
	
	By username = By.id("L-UserNameField");
    By password = By.id("L-PasswordField");
    By loginButton = By.id("gg-login-enter");
    
    public LoginPage(WebDriver driver) {
    	
    	this.driver=driver;
    }
    
    public void typeUserName()
    { 
    	driver.findElement(username).sendKeys("admin");
    }
    
    public void typePassword()
    { 
    	driver.findElement(password).sendKeys("1234");
    }
    
    public void clickOnLoginButton() 
    { 
    	driver.findElement(loginButton).click();
    }
    
}
