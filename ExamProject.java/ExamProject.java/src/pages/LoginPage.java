package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage{
    String myUsername = "branka@example.co.jp";
    String password = "Mihajlo2015Hana";
    
    
    public LoginPage(WebDriver driver){
        super(driver);
    }
    String baseURL = "http://automationpractice.com " ;
    
    By emailAddressBy = By.xpath("//*[@id='email']");
    By passwordBy = By.xpath("//*[@id='passwd']");
    By loginPageTextBy = By.id("header_logo");
    By loginButtonBy = By.xpath("//*[@id='SubmitLogin']/span");
    By singOutButtoBy = By.xpath("*[@id='header']/div[2]/div/div/nav/div[2]/a");
    By singInButtonBy = By.xpath("//*[@id='header']/div[2]/div/div/nav/div[1]/a");
    By errorMessageLogin2By = By.xpath("//*[@id='center_column']/div[1]/ol/li");
    By erroreMessageLogin1By = By.xpath("//*[@id='center_column']/div[1]/ol/li");
    
    public LoginPage basePage(){
        driver.get(baseURL);
        return this;
    }
    public LoginPage login (String username,String password){
        driver.findElement(passwordBy).sendKeys(password);
        driver.findElement(emailAddressBy).sendKeys(username);
        click(loginButtonBy);
        return this;
    }
    public LoginPage verifySucessfulSingout(){
        assertElementVisible(loginButtonBy);
        return this;
   }
   public LoginPage verifyLoginWithoutUsername(String expectedText) {
        driver.findElement(emailAddressBy).sendKeys("");  
        driver.findElement(passwordBy).sendKeys(password);
        click(loginButtonBy);
        String actualTitle = readText(errorMessageLogin2By);
        assertTextEquals(expectedText,actualTitle);
        return this;
    }
   public LoginPage verifyUnsucessfulLoginWithoutPassword(String expectedText){
       driver.findElement(emailAddressBy).sendKeys(myUsername);
       driver.findElement(passwordBy).sendKeys("");
       click(loginButtonBy);
       String actualTitle = readText(errorMessageLogin2By);
       assertTextEquals(expectedText, actualTitle);
       return this;
   }
}
