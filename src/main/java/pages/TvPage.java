package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.MethodHandels;

public class TvPage extends MethodHandels {
    public TvPage(WebDriver driver) {
        super(driver);
    }
    private final By wishlistButton=By.xpath("(//ul[@class=\"add-to-links\"]//a[@class=\"link-wishlist\"])[1]");
    public LoginPage clickOnAddToWishlist(){
        click(wishlistButton);
        return new LoginPage(driver);
    }
}
