package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.MethodHandels;

public class HomePage extends MethodHandels {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    private final By mobileLink=By.xpath("//li[@class=\"level0 nav-1 first\"]//a");
    private final By tvLink=By.xpath("//li[@class=\"level0 nav-2 active last\"]//a[@class=\"level0 \"]");

    private final By accountLink=By.xpath("//div[@class=\"account-cart-wrapper\"] //a[@class=\"skip-link skip-account\"]");
    private final By registerLink=By.xpath(" //a[@title=\"Register\"]");
    private final By loginLink=By.xpath("//a[@title=\"Log In\"]");
    private final By myAccountLink=By.xpath("//div[@class=\"footer\"]//a[@title=\"My Account\"]");

    public LoginPage clickOnLogin(){
        click(accountLink);
        click(loginLink);
        return new LoginPage(driver);
    }
    public LoginPage clickOnMyAccountLink(){
        click(myAccountLink);
        return new LoginPage(driver);
    }


    public TvPage clickOnTvLink(){
        click(tvLink);
        return new TvPage(driver);
    }
    public MobilePage clickOnMobileLink(){
       click(mobileLink);
        return new MobilePage(driver);
    }
    public String getTitle(){
      return  driver.getTitle();
    }
    public RegisterationPage clickOnAccountLink(){
        click(accountLink);
        click(registerLink);
        return new RegisterationPage(driver);
    }
}
