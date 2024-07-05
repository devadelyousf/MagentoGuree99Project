package product;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.FileNotFoundException;


public class MobileTest extends BaseTest {
    @Test
    public void verifyMobilePage() throws FileNotFoundException {
        var mobilePage = homePage.clickOnMobileLink();
        String actualResult = mobilePage.getTitleMobilePage();
        String expectedResult = dataModel().TitleOfMobilePage;
        Assert.assertTrue(actualResult.contains(expectedResult));
        /////////////////////////////////////////////////////////////////////
        mobilePage.sortByName();
        String actualResultOfPrice1 = mobilePage.getCostProduct();
        var productDetailsPage = mobilePage.clickOnProductName();
        String actualResultOfPrice2 = productDetailsPage.getCostProduct();
        Assert.assertEquals(actualResultOfPrice1, actualResultOfPrice2);


    }
}
