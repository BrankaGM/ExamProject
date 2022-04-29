package tests;

import org.junit.Test;
import pages.HomePage;
import pages.LoginPage;

public class HomePageTests extends BaseTest {
    public LoginPage loginPage;
    public HomePage homePage;
    
    int numOfBestSellersProducts = 7;
    int numOfPopularProducts = 7;
    String productAddedToYourCart = "There is 1 item in your cart.";
    double totalProductPrice = 16.51;
    double tax  = 2.00;
    double totalPriceWithTax = 18.51;

@Test
    public void verifyThatHomePageIsDisplayed(){
    
        homePage = new HomePage(driver);
        homePage.clickOnBestSellersButon();
    }
@Test
    public void countBestSellersProducts(){

        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);
        loginPage.basePage();
        homePage.clickOnBestSellersButon();
        homePage.verifyBestSellersNumOfProducts(numOfBestSellersProducts);
    }
@Test
    public void verifyPopularNumOfProducts(){
       
        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);
        loginPage.basePage();
        homePage.clickOnPopularButton();
        homePage.verifyPopularNumOfProducts(numOfPopularProducts);
    }

 @Test   
    public void addToCartTShirt(){
       
        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);
        loginPage.basePage();
        homePage.clickOnTShirtButton();
        homePage.clickOnProductName();
        homePage.clickOnAddToCartButton();
        homePage.verifySuccessfulyAddedProduct(productAddedToYourCart);
        homePage.verifyTotalPriceWithTax(totalProductPrice,tax, totalPriceWithTax);
        homePage.clickOnProceedeToCheckOutButton();
    
    }

}