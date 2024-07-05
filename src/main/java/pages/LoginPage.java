package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.MethodHandels;

public class LoginPage extends MethodHandels {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    private final By emailInput = By.xpath("//input[@name=\"login[username]\"]");
    private final By passwordInput = By.xpath("//input[@name=\"login[password]\"]");
    private final By loginButton = By.xpath("//button[@title=\"Login\"]");
    private final By loginButtonCheckoutPage = By.xpath("//div[@class=\"buttons-set\"]//button[@type=\"submit\"]");
    private final By loginButtonDashboardPage = By.xpath("//button[@id=\"send2\"]");

    private void enterEmail(String text) {
        sendKeys(emailInput, text);
    }

    private void enterPassword(String text) {
        sendKeys(passwordInput, text);
    }

    public void enterEmailAndPassword(String email, String password) {
        enterEmail(email);
        enterPassword(password);
    }

    public WishlistPage clickOnLoginButton() {
        click(loginButton);
        return new WishlistPage(driver);
    }

    public void clickLoginCheckoutPage() {
        click(loginButtonCheckoutPage);
    }

    public void clickLoginDashboardPage() {
        click(loginButtonDashboardPage);
    }

}
