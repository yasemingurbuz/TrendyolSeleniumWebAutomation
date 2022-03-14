package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
    private WebDriver driver;
    private By clickLoginUp = By.xpath("//*[@id=\"account-navigation-container\"]/div/div[1]/div[1]/p");
    private By clickTextBtn = By.cssSelector("#auto-complete-app > div > div.search-box-container > input");
    private By loginButtonDown =By.xpath("//*[@id=\"login-register\"]/div[3]/div[1]/form/button");
    private By clickAddProduct = By.xpath("//*[@id=\"search-app\"]/div/div[1]/div[2]/div[3]/div/div[2]/div[1]/div[2]/button/div[1]");
    private By confirmBasketBtn = By.xpath("//*[@id=\"pb-container\"]/aside/div/div[1]/a/span");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }
    public void clickLoginDown(){
        driver.findElement(loginButtonDown).click();
    }
    public LoginPage clickLoginUp(){
       driver.findElement(clickLoginUp).click();
       return new LoginPage(driver) ; }
    public SearchProductPage clickSearch(){
        driver.findElement(clickTextBtn).click();
        return new SearchProductPage(driver); }
    public BasketPage clickAddProduct(){
    driver.findElement(clickAddProduct).click();
    return new BasketPage(driver); }
    public OrderProcessingPage ConfirmBasket(){
        driver.findElement(confirmBasketBtn).click();
        return new OrderProcessingPage(driver); }
}
