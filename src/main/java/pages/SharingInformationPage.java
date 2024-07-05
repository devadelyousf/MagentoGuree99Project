package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.MethodHandels;

public class SharingInformationPage extends MethodHandels {
    public SharingInformationPage(WebDriver driver) {
        super(driver);
    }
    private final By emailInTextarea=By.xpath("//textarea[@name=\"emails\"]");
    private final By messageInTextarea=By.xpath("//textarea[@name=\"message\"]");
    private final By shareWishlistButton=By.xpath("//button[@title=\"Share Wishlist\"]");
    private void insertEmailInTextArea(String text){
        sendKeys(emailInTextarea,text);
    }
    private void insertMessageInTextArea(String text){
        sendKeys(messageInTextarea,text);
    }
    public void enterEmailAndMessage(String email,String message){
        insertEmailInTextArea(email);
        insertMessageInTextArea(message);
        clickOnShareWishlistButton();
    }
    private void clickOnShareWishlistButton(){
        click(shareWishlistButton);
    }
}
