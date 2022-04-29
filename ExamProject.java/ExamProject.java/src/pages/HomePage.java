package pages;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{

    public HomePage(WebDriver driver ){
        super(driver); 
    }
    //String baseUrl = "http://automationpractice.com/index.php";

    By homePageLogoTitleBy = By.className("page-heading");
    By singOutButtonBy = By.className("logout");
    By singInButtonBy = By.xpath("//*[@id='header']/div[2]/div/div/nav/div[1]/a");
    By countItemsBestSellersBy = By.cssSelector("html body#index.index.hide-left-column.hide-right-column.lang_en div#page div.columns-container div#columns.container div.row div#center_column.center_column.col-xs-12.col-sm-12 div.tab-content ul#blockbestsellers.product_list.grid.row.blockbestsellers.tab-pane.active li.ajax_block_product");
    By countItemsPopularBy =By.cssSelector("html body#index.index.hide-left-column.hide-right-column.lang_en div#page div.columns-container div#columns.container div.row div#center_column.center_column.col-xs-12.col-sm-12 div.tab-content ul#homefeatured.product_list.grid.row.homefeatured.tab-pane.active li.ajax_block_product"); 
    By bestSellersButonBy = By.xpath("//*[@id='home-page-tabs']/li[2]/a");
    By popularButtonBy = By.xpath("//*[@id='home-page-tabs']/li[1]/a");
    By tShirtButtonBy = By.xpath("//*[@id='block_top_menu']/ul/li[3]/a");
    By addToCartButton2By = By.xpath("//*[@id='add_to_cart']/button/span");
    By productAddedToYourCartBy = By.xpath("//*[@id='layer_cart']/div[1]/div[2]/h2/span[2]");
    By productNameBy = By.xpath("//*[@id='center_column']/ul/li/div/div[2]/h5/a");By createAccountEmailBy = By.id("email_create");
    By createAccountButtonBy = By.xpath("//*[@id='SubmitCreate']/span");
    By clickOnProceedeToCheckOutButtonBy = By.xpath("//*[@id='layer_cart']/div[1]/div[2]/div[4]/a/span");
    By totalProductPriceBy = By.xpath("//*[@id='layer_cart']/div[1]/div[2]/div[1]/span");
    By taxPriceBy = By.xpath("//*[@id='layer_cart']/div[1]/div[2]/div[2]/span");
    By totalPriceWithTaxBy = By.xpath("//*[@id='layer_cart']/div[1]/div[2]/div[3]/strong");
    
    
    
    public HomePage verifySucessfulLogin(String expectedText){
    String actualTitle = readText(homePageLogoTitleBy);
    assertTextEquals(expectedText,actualTitle);
    return this;
 }
    public HomePage clickOnSingoutButton(){
    click(singOutButtonBy);
    return this;
}
    public HomePage clickOnSingInButton(){
      click(singInButtonBy);
        return this;
    }
    public HomePage clickOnPopularButton(){
        click(popularButtonBy);
        return this;
    }
    public HomePage clickOnBestSellersButon(){
      click(bestSellersButonBy);
      return this;
}
    public HomePage verifyBestSellersNumOfProducts(int expected){
    int actualNumberOfProducts = countItems(countItemsBestSellersBy);
    assertNumEquals(expected,actualNumberOfProducts);
    System.out.println("Total Number of products count on BestSellers = " + actualNumberOfProducts);
    return this;
}
    public HomePage verifyPopularNumOfProducts(int expected){
    int actualNumberOfProducts = countItems(countItemsPopularBy);
    assertNumEquals(expected, actualNumberOfProducts);
    System.out.println("Total Number of products count on Popular =" + actualNumberOfProducts);
    return this;
    }
    public HomePage clickOnTShirtButton(){
    click(tShirtButtonBy);
    return this;
    }
    public HomePage clickOnAddToCartButton(){
        click(addToCartButton2By);
        return this;
    }
    public HomePage verifySuccessfulyAddedProduct(String expectedText){
        String actualTitle = readText(productAddedToYourCartBy);
        assertTextEquals(expectedText, actualTitle);
        System.out.println("There is 1 product added to your cart");
        return this;
    }
    public HomePage clickOnProductName(){
        click(productNameBy);
        return this;
    }
    
    public HomePage clickOnProceedeToCheckOutButton(){
        click(clickOnProceedeToCheckOutButtonBy);
        return this;
    }
   public HomePage verifyTotalPriceWithTax(double totalProductPrice,double tax,double totalPriceWithTax){
        assertDoubleEquals(totalProductPrice , tax ,totalPriceWithTax);
        System.out.println("Total price with tax is  = " + totalPriceWithTax);
        return this;

    }

    
}

    
       
        



