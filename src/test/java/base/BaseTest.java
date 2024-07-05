package base;
import data.DataModel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;
import pages.LoginPage;
import reader.ReadDataFromJson;

import java.io.FileNotFoundException;

public class BaseTest {
   protected WebDriver driver;
    protected HomePage homePage;
  protected   LoginPage loginPage;

    @BeforeClass
    public void setUp(){
      driver=new ChromeDriver();
      driver.manage().window().maximize();
      homePage=new HomePage(driver);
    }
    @BeforeMethod
    public void getUrl() throws FileNotFoundException {
        driver.get(dataModel().URL);
    }
    @AfterClass
    public void quite(){
        driver.quit();
    }

    protected DataModel dataModel() throws FileNotFoundException {
        ReadDataFromJson readDataFromJson=new ReadDataFromJson();
        return  readDataFromJson.ReadJsonFile();
    }
    protected void loginInsert() throws FileNotFoundException {
        loginPage.enterEmailAndPassword(dataModel().LOGIN.Email,dataModel().LOGIN.Password);
    }
    protected void clickLoginCheckoutPage(){
        loginPage.clickLoginCheckoutPage();
    }
    protected void clickLoginDashboardPage(){
        loginPage.clickLoginDashboardPage();
    }

}
