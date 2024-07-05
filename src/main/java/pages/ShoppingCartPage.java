package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.MethodHandels;

public class ShoppingCartPage extends MethodHandels {
    public ShoppingCartPage(WebDriver driver) {
        super(driver);
    }

    private final By quantityInput=By.xpath("//input[@class=\"input-text qty\"]");
    private final By updateButton=By.xpath("//button[@class=\"button btn-update\"]");
    private final By errorValidationMessage=By.xpath("//p[@class=\"item-msg error\"]");
    private final By emptyButton=By.xpath("//button[@class=\"button2 btn-empty\"]");
    private final By messageOfEmptyCart=By.xpath("//div[@class=\"page-title\"]");
    private final By processToCheckoutButton=By.xpath("//ul[@class=\"checkout-types top\"]//button[@class=\"button btn-proceed-checkout btn-checkout\"]");
    public LoginPage clickOnProcessToCheckoutButton(){
        click(processToCheckoutButton);
        return new LoginPage(driver);
    }
    public void clickOnProcessToCheckoutButton2(){
        click(processToCheckoutButton);
    }
    public void insertQuantity(String text){
        driver.findElement(quantityInput).clear();
        driver.findElement(quantityInput).sendKeys(text);
    }
    public void clickOnUpdateButton(){
       click(updateButton);
    }
    public String getErrorMessage(){
        return getText(errorValidationMessage);
    }
    public void clickOnEmptyButton(){
        click(emptyButton);
    }

    public String getEmptyMessage(){
        return getText(messageOfEmptyCart);

    }




}
