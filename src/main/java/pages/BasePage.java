package pages;

import driver.SingletonDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class BasePage {
    public BasePage() {
        PageFactory.initElements(SingletonDriver.getDriver(), this);
    }

    public WebElement findElement(By by){
        return SingletonDriver.getDriver().findElement(by);
    }

    public List<WebElement> findElements(By by){
        return SingletonDriver.getDriver().findElements(by);
    }
}
