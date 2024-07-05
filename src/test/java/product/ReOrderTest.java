package product;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.CheckOutPage;
import pages.DashboardPage;

import java.io.FileNotFoundException;

public class ReOrderTest extends BaseTest {
    @Test
    public void ReorderOfProducts() throws FileNotFoundException {
        homePage.clickOnMyAccountLink();
        loginInsert();
        clickLoginDashboardPage();
        var dashboardPage =new DashboardPage(driver);
        dashboardPage.clickOnMyOrderButton();
        var shoppingCartPage = dashboardPage.clickOnReorderButton();
        shoppingCartPage.insertQuantity("20");
        shoppingCartPage.clickOnUpdateButton();
        shoppingCartPage.clickOnProcessToCheckoutButton2();
        var checkOutPage=new CheckOutPage(driver);
        checkOutPage.checkOutAllMethods();
    }
}
