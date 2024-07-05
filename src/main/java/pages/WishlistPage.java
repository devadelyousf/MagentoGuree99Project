package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.MethodHandels;

public class WishlistPage extends MethodHandels {

    public WishlistPage(WebDriver driver) {
        super(driver);
    }


    private final By shareWishlist=By.xpath("//button[@title=\"Share Wishlist\"]");
    public SharingInformationPage clickOnShareWishlist(){
        click(shareWishlist);
        return new SharingInformationPage(driver);
    }

}
