package home;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.BasketPage;
import pages.LoginPage;
import pages.OrderProcessingPage;
import pages.SearchProductPage;

    public class HomeTests extends BaseTests {
        @Test
        public void testSuccessfulLogin() throws InterruptedException {
            //login processes
            LoginPage loginPage = homePage.clickLoginUp();
            Thread.sleep(1000);
            loginPage.setEmail("admin@admin.com");
            loginPage.setPassword("password");
            Thread.sleep(1000);
            loginPage.clickLoginDown();
            Thread.sleep(1000);

            //Search Product
            SearchProductPage searchProductPage = homePage.clickSearch();
            Thread.sleep(1000);
            searchProductPage.setSearch("içecek");
            Thread.sleep(1000);
            searchProductPage.clickIcon();
            Thread.sleep(1000);
            searchProductPage.Dropdown();
            Thread.sleep(1000);

            //Add Product to Basket
            BasketPage basketPage = homePage.clickAddProduct();
            Thread.sleep(1000);
            basketPage.getClickShowBasket();
            Thread.sleep(1000);
            basketPage.ProductIncrease();
            Thread.sleep(1000);

            //Basket Processes
            OrderProcessingPage orderProcessingPage = homePage.ConfirmBasket();
            Thread.sleep(1000);
            orderProcessingPage.CloseComeGet();
            Thread.sleep(1000);
            orderProcessingPage.AddNewAddress();
            Thread.sleep(1000);

            //Add new address
            orderProcessingPage.setNameField("abc");
            orderProcessingPage.setSurnameField("xyz");
            Thread.sleep(2000);
            orderProcessingPage.setPhoneField("123456789");
            Thread.sleep(1000);
            orderProcessingPage.clickCity();
            Thread.sleep(1000);
            orderProcessingPage.clickCountry();
            Thread.sleep(1000);
            orderProcessingPage.clickDistrict();
            orderProcessingPage.setAddressField("xyz apartmanı");
            orderProcessingPage.setAddressTitleField("Ev3");
            Thread.sleep(1000);
            //orderProcessingPage.clickSave();
            //Thread.sleep(1000);

        }
    }



