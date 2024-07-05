package product;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.FileNotFoundException;

public class AsserErrorMessageTest extends BaseTest {
    @Test
    public void addProductToCart() throws FileNotFoundException {
        var mobilePage = homePage.clickOnMobileLink();
        mobilePage.sortByName();
        var shoppingCartPage = mobilePage.clickAddCartButton();
        shoppingCartPage.insertQuantity("1000");
        shoppingCartPage.clickOnUpdateButton();
        String expectedResult = dataModel().ErrorMessage;
        String actualResult = shoppingCartPage.getErrorMessage();
        Assert.assertTrue(actualResult.contains(expectedResult));
        shoppingCartPage.clickOnEmptyButton();
        String actualResultOfEmptyCart = shoppingCartPage.getEmptyMessage();
        String expectedResultOfEmptyCart =dataModel().ShoppingMessage;
        Assert.assertTrue(actualResultOfEmptyCart.contains(expectedResultOfEmptyCart));

    }
}
