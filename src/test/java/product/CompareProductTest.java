package product;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.MobilePage;

public class CompareProductTest extends BaseTest {
    @Test
    public void compareProduct() {
      MobilePage mobilePage= homePage.clickOnMobileLink();
      mobilePage.sortByName();
      mobilePage.compareProduct();
      mobilePage.popUpPage();


    }
}
