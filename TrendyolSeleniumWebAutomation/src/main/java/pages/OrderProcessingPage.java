package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class OrderProcessingPage {
    private WebDriver driver;

    private By AddNewAddressBtn = By.xpath("//*[@id=\"p-layout\"]/div/div[2]/div[1]/div[2]/div[2]/div[1]");
    private By nameField = By.xpath("//*[@id=\"address-popup-container\"]/div/div[1]/div/div[2]/div/div/form/div[1]/div[1]/input");

    private By surnameField = By.xpath("//*[@id=\"address-popup-container\"]/div/div[1]/div/div[2]/div/div/form/div[1]/div[2]/input");
    private By phoneField = By.xpath("//*[@id=\"address-popup-container\"]/div/div[1]/div/div[2]/div/div/form/div[2]/div[1]/input");
    private By citySuggested = By.xpath("//*[@id=\"address-popup-container\"]/div/div[1]/div/div[2]/div/div/form/div[2]/div[2]/div[1]/div");
    private By selectCity = By.xpath("//*[@id=\"address-popup-container\"]/div/div[1]/div/div[2]/div/div/form/div[2]/div[2]/div[1]/div/div/div[3]");
    private By countrySuggested = By.xpath("//*[@id=\"address-popup-container\"]/div/div[1]/div/div[2]/div/div/form/div[3]/div[1]/div[1]/div");
    private By selectCountry = By.xpath("//*[@id=\"address-popup-container\"]/div/div[1]/div/div[2]/div/div/form/div[3]/div[1]/div[1]/div/div/div[3]");
    private By districtSuggested = By.xpath("//*[@id=\"address-popup-container\"]/div/div[1]/div/div[2]/div/div/form/div[3]/div[2]/div[1]/div");
    private By selectDistrict = By.xpath("//*[@id=\"address-popup-container\"]/div/div[1]/div/div[2]/div/div/form/div[3]/div[2]/div[1]/div/div/div[3]");
    private By addressField = By.xpath("//*[@id=\"address-popup-container\"]/div/div[1]/div/div[2]/div/div/form/div[4]/textarea");
    private By addressTitleField = By.xpath("//*[@id=\"address-popup-container\"]/div/div[1]/div/div[2]/div/div/form/div[5]/input");
    private By saveBtn = By.xpath("//*[@id=\"address-popup-container\"]/div/div[1]/div/div[2]/div/div/form/div[6]/button");
    private By closeComeGet = By.xpath("//*[@id=\"p-layout\"]/div/div[2]/div[1]/div[1]/div[2]/div[3]/div[2]/div/div/div[2]/button[1]");
    OrderProcessingPage(WebDriver driver){ this.driver = driver; }
    public void CloseComeGet(){
        driver.findElement(closeComeGet).click(); }
    public void AddNewAddress(){driver.findElement(AddNewAddressBtn).click();}
    public void setNameField(String name){
        driver.findElement(nameField).sendKeys(name);
    }
    public void setSurnameField(String surname){
        driver.findElement(surnameField).sendKeys(surname);
    }
    public void setPhoneField(String phone){
       WebElement telephone =  driver.findElement(phoneField);
       telephone.click();
       telephone.sendKeys(phone); }
    public void clickCity(){
        driver.findElement(citySuggested).click();
        driver.findElement(selectCity).click(); }
    public void clickCountry(){
        driver.findElement(countrySuggested).click();
        driver.findElement(selectCountry).click(); }
    public void clickDistrict(){
        driver.findElement(districtSuggested).click();
        driver.findElement(selectDistrict).click(); }
    public void setAddressField(String address){
        driver.findElement(addressField).sendKeys(address);
    }
    public void setAddressTitleField(String addressTitle){ driver.findElement(addressTitleField).sendKeys(addressTitle); }
    public void clickSave(){driver.findElement(saveBtn).click(); }
}
