# Trendyol Selenium Web Automation Project

Selenium Web Automation project compatible with Google Chrome, where scenario tests are carried out on Trendyol e-commerce site.

You can watch it here:



## Prerequisites

- [Intellij Idea](https://www.jetbrains.com/idea/)

- Java SDK

- [Chrome WebDriver](https://chromedriver.chromium.org/) - I used ChromeDriver 95. You can download it according to what your chrome version is. You should add it to the resources folder in the file.

- In order to enter the system, you must change the e-mail address and password in the test to your own e-mail address and password.

  ```java
  loginPage.setEmail("admin@admin.com");
  loginPage.setPassword("password");
  ```

- You may get an error while running the project. One reason for this is the constant updating of the website. You can see where the update was made by looking at the video of the steps.

  

## The project performs the following steps:

• It is checked that the main page is opened.

• Login to the site and check its operations.

• The word 'içecek' is entered into the search box.

• The page opened in the search results is checked.

• Select 'En çok satanlar' from the suggested drop-down menu and check the page.

• The selected product is added to the basket and increasing in the number of products in the basket is checked.

• The basket is confirmed.

• A new address is added after the address change.

• Adding a new address is checked.

