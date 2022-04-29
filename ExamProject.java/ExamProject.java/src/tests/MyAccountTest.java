package tests;

import org.junit.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.MyAccountPage;

public class MyAccountTest extends BaseTest {
    public LoginPage loginPage;
    public HomePage homePage;
    public MyAccountPage myAccountPage;
    
    String myEmailNew = "branka2010@example.co.jp";
    String myName = "Branka";
    String myLastName = "Milinkovic";
    String myPassword = "Mihajlo2022Hana";
    String myAddress = "Nova";
    String myCity = "Sacramento";
    String myState = "California";
    String postalCode = "11000";
    String mobileNumber = "98765";
    String signOutButton = "Sign out";
    

@Test
public void creteAnAccount(){
        loginPage = new LoginPage (driver);
        homePage = new HomePage(driver);
        myAccountPage  = new MyAccountPage(driver);

        homePage.clickOnSingInButton();
        myAccountPage.createAccount(myEmailNew);
        myAccountPage.clickOnCreateAccountButton();
        myAccountPage.inputFirstAndLastName(myName,myLastName);
        myAccountPage.confirmeMyEmail(myEmailNew);
        myAccountPage.inputEmailAndPassword(myEmailNew, myPassword);
        myAccountPage.inputAddressAndCity(myAddress,myCity );
        myAccountPage.scrollDropdownButton(myState);
        myAccountPage.inputPostalCodeAndMobileNumber(postalCode,mobileNumber);
        myAccountPage.clickOnRegisterButton();
        myAccountPage.verifySuccessfullyCreatedAccount(signOutButton);
    }
}