package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
    private WebDriver driver;
    private By emailField = By.id("login-email");
    private By passwordField = By.id("login-password-input");
    private By loginButtonDown =By.xpath("//*[@id=\"login-register\"]/div[3]/div[1]/form/button");
    public void clickLoginDown(){
    driver.findElement(loginButtonDown).click();
    }
    public LoginPage(WebDriver driver){
        this.driver = driver;
    }
    public void setEmail(String email){
        driver.findElement(emailField).sendKeys(email);
    }
    public void setPassword(String password){
        driver.findElement(passwordField).sendKeys(password);
    }

}
