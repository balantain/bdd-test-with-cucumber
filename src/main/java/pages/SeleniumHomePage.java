package pages;

import driver.SingletonDriver;
import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;

@Getter
public class SeleniumHomePage extends BasePage {
    private static final String SELENIUM_URL = "https://www.selenium.dev/";

    @FindBy(xpath = "//*[@type='search']")
    private WebElement searchField;

    @FindBy(xpath = "//div[@class = 'ds-suggestion']")
    private List<WebElement> searchSuggestions;

    public void openPage() {
        SingletonDriver.getDriver().get(SELENIUM_URL);
    }

    public void searchForQuery(String query) {
        searchField.sendKeys(query);
    }

    public void selectFirstTip() {
        searchSuggestions.get(0).click();
    }
}
