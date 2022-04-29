package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class MyAccountPage extends BasePage {

    public MyAccountPage (WebDriver driver){
        super(driver);
    } 

    By signInButtonBy = By.xpath("//*[@id='header']/div[2]/div/div/nav/div[1]/a");
    By createAccountEmailBy = By.id("email_create");
    By createAccountButtonBy = By.xpath("//*[@id='SubmitCreate']/span");
    By firstNameBy = By.xpath("//*[@id='customer_firstname']");
    By addressBy = By.xpath("//*[@id='address1']");
    By cityBy = By.xpath("//*[@id='city']");
    By lastNameBy = By.xpath("//*[@id='customer_lastname']");
    By emailFieldBy = By.xpath("//*[@id='email']");
    By passwordFieldBy = By.id ("passwd");
    By inputStateBy = By.xpath("//*[@id='id_state']");
    By postalCodeBy = By.xpath("//*[@id='postcode']");
    By mobileNumberBy = By.xpath("//*[@id='phone_mobile']");
    By registerButtonBy = By.xpath("//*[@id='submitAccount']/span");
    By signOutButtonBy = By.xpath("//*[@id='header']/div[2]/div/div/nav/div[2]/a");

    By confirmeEmailButtonBy = By.xpath("//*[@id='email']");
    
    
    public MyAccountPage createAccount (String emailAddress){
        writeText(createAccountEmailBy,emailAddress);
        click(createAccountButtonBy);
        return this;
    }   
     public MyAccountPage clickOnCreateAccountButton (){
        click(createAccountButtonBy);
        return this;
    }
    public MyAccountPage inputFirstAndLastName(String myName,String myLastName ){
        writeText(firstNameBy,myName);
        writeText(lastNameBy,myLastName);
        return this;
    }
    public MyAccountPage confirmeMyEmail(String myNewEmail){
        writeText(confirmeEmailButtonBy,myNewEmail);
        return this;
    }
    public MyAccountPage inputEmailAndPassword(String myNewEmail,String myPassword){
        writeText(emailFieldBy,myNewEmail);
        writeText(passwordFieldBy,myPassword);
        return this;
    }
    public MyAccountPage inputAddressAndCity(String address,String city){
        writeText(addressBy,address);
        writeText(cityBy, city);
        return this;
    }
    public MyAccountPage inputState(String state ){
        click(inputStateBy);
        writeText(inputStateBy, state);
        return this;
    }
    public MyAccountPage inputPostalCodeAndMobileNumber(String postalCode2 ,String mobileNumber2){
        writeText(postalCodeBy, postalCode2);
        writeText(mobileNumberBy, mobileNumber2);
        return this;
    }
    public MyAccountPage clickOnRegisterButton(){
        click(registerButtonBy);
        return this;
    }
    public MyAccountPage verifySuccessfullyCreatedAccount(String expectedText){
        String actualTitle = readText(signOutButtonBy);
        click(signOutButtonBy);
        assertTextEquals(expectedText,actualTitle);
        return this;
    }
    public MyAccountPage scrollDropdownButton(String myState){
        WebElement mySelectElement = driver.findElement(inputStateBy);
        Select dropdown = new Select((mySelectElement));
        dropdown.selectByIndex(5);
        return this;
 }
    }

    
    

