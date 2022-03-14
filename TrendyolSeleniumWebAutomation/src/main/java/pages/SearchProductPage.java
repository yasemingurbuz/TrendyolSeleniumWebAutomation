package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import static java.lang.Thread.sleep;

public class SearchProductPage {
    private WebDriver driver;
    private By searchBox = By.xpath("//*[@id=\"auto-complete-app\"]/div/div/input");
    private By clickSearchBtn = By.xpath("//*[@id=\"auto-complete-app\"]/div/div[2]/i");
    private By clickSuggested = By.xpath("//*[@id=\"search-app\"]/div/div[1]/div[2]/div[1]/div[2]/select");

    public SearchProductPage(WebDriver driver){ this.driver = driver; }
    public void setSearch(String search){
        driver.findElement(searchBox).sendKeys(search);
    }
    public void clickIcon(){ driver.findElement(clickSearchBtn).click(); }
    public void Dropdown() {
        Select Sugggested = new Select(driver.findElement(clickSuggested));
        Sugggested.selectByVisibleText("Çok Satanlar"); }
}
