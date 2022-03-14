package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import java.awt.*;

public class BasketPage {
    private WebDriver driver;
    private By clickShowBasket = By.xpath("//*[@id=\"account-navigation-container\"]/div/div[2]/a/p");
    private By numericbtn = By.cssSelector("#pb-container > div > div.pb-merchant-group > div.pb-basket-item > div.pb-basket-item-actions > div.pb-counter-container > div > button:nth-child(3) > svg");
    public BasketPage(WebDriver driver){this.driver = driver;}
    public void getClickShowBasket(){driver.findElement(clickShowBasket).click();}
    public void ProductIncrease(){driver.findElement(numericbtn).click();}
}
