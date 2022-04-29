package tests;

import org.junit.Test;
import pages.HomePage;
import pages.LoginPage;

public class LoginTests extends BaseTest {
    public LoginPage loginPage;
    public HomePage homePage;


        String myUsername = "branka@example.co.jp";
        String password = "Mihajlo2015Hana";
        String fakeUsername = "";
        
        String expectedMyAccountTitle = "MY ACCOUNT";
        String errorMessageLogin2 = "Password is required.";
        String errorMessageLogin1 = "An email address required.";
@Test
    public void verifySucessfullLogin(){
        
        loginPage = new LoginPage (driver);
        homePage = new HomePage(driver);
        homePage.clickOnSingInButton();
        loginPage.login(myUsername , password);
        homePage.verifySucessfulLogin(expectedMyAccountTitle);
        }
@Test
    public void verifySucessfulSingout() {
           
            homePage = new HomePage(driver);
            loginPage = new LoginPage(driver);
            homePage.clickOnSingInButton();
            loginPage.login(myUsername , password);
            homePage.clickOnSingoutButton();
            loginPage.verifySucessfulSingout();
        }
@Test      
       public void verifyLoginWithoutUsername()  {
            
            loginPage = new LoginPage (driver);
            homePage = new HomePage(driver);
            loginPage.basePage();
            homePage.clickOnSingInButton();
            loginPage.verifyLoginWithoutUsername(errorMessageLogin1);
            System.out.println(errorMessageLogin1);
        }  
@Test
        public void verifyLoginWithoutPassword(){
            
            loginPage = new LoginPage(driver);
            homePage = new HomePage(driver);
            loginPage.basePage();
            homePage.clickOnSingInButton();
            loginPage.verifyUnsucessfulLoginWithoutPassword(errorMessageLogin2);
            System.out.println(errorMessageLogin2);
        }
}
