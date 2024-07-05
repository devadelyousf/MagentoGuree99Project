package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.MethodHandels;

public class ProductDetailsPage extends MethodHandels {
    public ProductDetailsPage(WebDriver driver) {
        super(driver);
    }
    private final By productPrice=By.xpath("//span[@id=\"product-price-1\"]//span[@class=\"price\"]");
    public String getCostProduct(){
        return  getText(productPrice);
    }
}
