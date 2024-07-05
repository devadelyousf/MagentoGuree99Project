package product;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.FileNotFoundException;

public class HomeTest extends BaseTest {
    @Test
    public void verifyTitleAndName() throws FileNotFoundException {
        String expected = dataModel().TitleOfHomePage;
        String actual = homePage.getTitle();
        Assert.assertTrue(actual.contains(expected));
    }
}
