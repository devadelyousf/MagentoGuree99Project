package register;

import base.BaseTest;
import org.testng.annotations.Test;

import java.io.FileNotFoundException;

public class RegisterationTest extends BaseTest {
    @Test
    public void createAnAccount() throws FileNotFoundException {
        var registerationPage = homePage.clickOnAccountLink();
        registerationPage.enterValueOfFields(
                dataModel().REGISTER.FirstName,
                dataModel().REGISTER.MidName,
                dataModel().REGISTER.LastName,
                dataModel().REGISTER.Email,
                dataModel().REGISTER.Password,
                dataModel().REGISTER.ConfirmPassword);
    }
}
