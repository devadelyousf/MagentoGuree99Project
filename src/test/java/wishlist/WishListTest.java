package wishlist;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.*;

import java.io.FileNotFoundException;


public class WishListTest extends BaseTest {
    @Test
    public void wishList() throws FileNotFoundException {
        var tvPage = homePage.clickOnTvLink();
        var loginPage = tvPage.clickOnAddToWishlist();
        loginPage.enterEmailAndPassword(dataModel().LOGIN.Email, dataModel().LOGIN.Password);
        var wishlistPage = loginPage.clickOnLoginButton();
        var sharingInformationPage = wishlistPage.clickOnShareWishlist();
        sharingInformationPage.enterEmailAndMessage(dataModel().LOGIN.Email, dataModel().TitleOfHomePage);

    }
}
