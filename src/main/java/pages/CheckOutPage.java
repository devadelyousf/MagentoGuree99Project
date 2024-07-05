package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.MethodHandels;

import java.time.Duration;

public class CheckOutPage extends MethodHandels {
    public CheckOutPage(WebDriver driver) {
        super(driver);
    }

    private final By continueShippingInformation = By.xpath("//div[@class=\"fieldset\"]//button[@title=\"Continue\"]");
    private final By continueShippingMethod = By.xpath("(//div[@class=\"buttons-set\"]//button[@class=\"button\"])[2]");
    private final By continuePaymentInformation = By.xpath("(//div[@class=\"buttons-set\"]//button[@type=\"button\"])[4]");
    private final By moneyOrder = By.xpath("//div[@class=\"fieldset\"]//input[@title=\"Check / Money order\"]");
    private final By placeOrderButton = By.xpath("//button[@class=\"button btn-checkout\"]");



    private void clickOnContinueShippingInformation() {
        click(continueShippingInformation);
    }

    private void clickOnContinueShippingMethod() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
        click(continueShippingMethod);
    }
    private void clickOnMoneyOrder() {
        click(moneyOrder);
    }

    private void clickOnContinuePaymentInformation() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
        click(continuePaymentInformation);
    }
    private void clickOnPlaceOrderButton() {
        click(placeOrderButton);
    }
    public void checkOutAllMethods(){
        clickOnContinueShippingInformation();
        clickOnContinueShippingMethod();
        clickOnMoneyOrder();
        clickOnContinuePaymentInformation();
        clickOnPlaceOrderButton();
    }
}
