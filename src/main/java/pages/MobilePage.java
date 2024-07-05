package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import utils.MethodHandels;

import java.util.Iterator;
import java.util.Set;

public class MobilePage extends MethodHandels {

    Select select;

    public MobilePage(WebDriver driver) {
        super(driver);
    }

    private final By dropDownSort = By.xpath("(//div[@class=\"sort-by\"]//select[@title=\"Sort By\"])[1]");
    private final By productName = By.xpath("//div[@class=\"product-info\"]//a[@title=\"Sony Xperia\"]");
    private final By priceOfProduct = By.xpath("//div[@class=\"price-box\"]//span[@id=\"product-price-1\"]");
    private final By addCartButton = By.xpath("(//div[@class=\"product-info\"]//button[@class=\"button btn-cart\"])[3]");
    private final By addCompareButtonSonyXperia = By.xpath("(//a[@class=\"link-compare\"])[3]");
    private final By addCompareButtonSamsung = By.xpath("(//a[@class=\"link-compare\"])[2]");
    private final By compareButton = By.xpath("//button[@title=\"Compare\"]");
    private final By closeButtonInPopUpPage = By.xpath("//button[@title=\"Close Window\"]");

    public void popUpPage() {
        String windowHandle = driver.getWindowHandle();
        clickCompareButton();
        Set<String> allWindow = driver.getWindowHandles();
        for (String window : allWindow) {
            if (!window.equals(windowHandle))
                driver.switchTo().window(window);
        }

         click(closeButtonInPopUpPage);

    }

    private void clickCompareButton() {
        click(compareButton);
    }

    private void clickAddCompareButtonSonyXperia() {
        click(addCompareButtonSonyXperia);
    }
    public void compareProduct(){
        clickAddCompareButtonSamsung();
        clickAddCompareButtonSonyXperia();
    }
    private void clickAddCompareButtonSamsung() {
        click(addCompareButtonSamsung);
    }

    public void sortByName() {
        select = new Select(driver.findElement(dropDownSort));
        select.selectByVisibleText("Name");
    }

    public String getTitleMobilePage() {
        return driver.getTitle();
    }

    public ProductDetailsPage clickOnProductName() {
        click(productName);
        return new ProductDetailsPage(driver);
    }

    public String getCostProduct() {
        return getText(priceOfProduct);
    }

    public ShoppingCartPage clickAddCartButton() {
        click(addCartButton);
        return new ShoppingCartPage(driver);
    }
}
