package tests;

//import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//import org.openqa.selenium.support.ui.WebDriverWait;
import org.junit.*;

public class BaseTest {
    
        public WebDriver driver;
        String myUsername = "branka@example.co.jp";
        String password = "Mihajlo2015Hana";
        
    @Before
        public void setup(){
            System.setProperty("webdriver.gecko.driver", "C:\\Users\\Korisnik\\Desktop\\ExamProject.java\\ExamProject.java\\lib\\geckodriver.exe");
            driver = new FirefoxDriver();
            driver.navigate().to("http://automationpractice.com");
            driver.manage().window().maximize();
         }
    @After
        public void teardown(){
                 driver.quit();
             }
        }

