package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;

public class MethodHandels {
    LoginPage loginPage;
  protected   WebDriver driver;

    public MethodHandels(WebDriver driver) {
        this.driver=driver;
    }

    protected void click (By locator){
        driver.findElement(locator).click();
    }
    protected String getText(By locator){
     return    driver.findElement(locator).getText();
    }
    protected void sendKeys(By locator , String text){
        driver.findElement(locator).sendKeys(text);
    }






}
