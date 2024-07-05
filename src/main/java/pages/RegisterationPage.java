package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.MethodHandels;

public class RegisterationPage extends MethodHandels {
    public RegisterationPage(WebDriver driver) {
        super(driver);
    }

    private final By inputFirstname=By.xpath("//input[@name=\"firstname\"]");
    private final By inputMiddleName=By.xpath("//input[@name=\"middlename\"]");
    private final By inputLastname=By.xpath("//input[@name=\"lastname\"]");
    private final By inputEmail=By.xpath("//input[@name=\"email\"]");
    private final By inputPassword=By.xpath("//input[@name=\"password\"]");
    private final By inputConfirmPassword=By.xpath("//input[@name=\"confirmation\"]");
    private final By registerButton=By.xpath("//button[@title=\"Register\"]");

    private void insertFirstName(String text){
        sendKeys(inputFirstname,text);
    }
    private void insertMiddleName(String text){
        sendKeys(inputMiddleName,text);
    }
    private void insertLastName(String text){
        sendKeys(inputLastname,text);
    }
    private void insertEmail(String text){
        sendKeys(inputEmail,text);
    }
    private void insertPassword(String text){
        sendKeys(inputPassword,text);
    }
    private void insertConfirmPassword(String text){
        sendKeys(inputConfirmPassword,text);
    }

    public void enterValueOfFields(String firstname,String midname,String lastname,String email,String password,String confirmpass){
        insertFirstName(firstname);
        insertMiddleName(midname);
        insertLastName(lastname);
        insertEmail(email);
        insertPassword(password);
        insertConfirmPassword(confirmpass);
        clickOnRegisterButton();

    }
    private WishlistPage clickOnRegisterButton(){
        click(registerButton);
        return new WishlistPage(driver);
    }
}
