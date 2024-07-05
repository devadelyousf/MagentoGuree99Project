package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.MethodHandels;

public class DashboardPage extends MethodHandels {
    public DashboardPage(WebDriver driver) {
        super(driver);
    }
  private final By myOrderButton=By.xpath("//div[@class=\"block-content\"]//li[@class=\"current\"]");
    private final By reOrderLink=By.xpath("//tr[@class=\"first odd\"]//a[@class=\"link-reorder\"]");

    public void clickOnMyOrderButton(){
        click(myOrderButton);
    }
    public ShoppingCartPage clickOnReorderButton(){
        click(reOrderLink);
        return new ShoppingCartPage(driver);
    }
}
