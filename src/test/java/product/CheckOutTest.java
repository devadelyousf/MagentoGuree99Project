package product;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.*;

import java.io.FileNotFoundException;

public class CheckOutTest extends BaseTest {
    @Test
    public void addProductAndCheckOut() throws FileNotFoundException {
        var mobilePage = homePage.clickOnMobileLink();
        var shoppingCartPage = mobilePage.clickAddCartButton();
        shoppingCartPage.clickOnProcessToCheckoutButton();
        loginInsert();
        clickLoginCheckoutPage();
        CheckOutPage checkOutPage = new CheckOutPage(driver);
        checkOutPage.checkOutAllMethods();


    }
}
