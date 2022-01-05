package cucumber.steps;

import driver.SingletonDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.SearchResultPage;
import pages.SeleniumHomePage;

public class SeleniumTestSteps {
    SeleniumHomePage seleniumHomePage = new SeleniumHomePage();
    SearchResultPage searchResultPage = new SearchResultPage();

    @Given("the user opens Selenium website")
    public void opensPage() {
        seleniumHomePage.openPage();
    }

    @When("the user clicks on the search field")
    public void clickSearchField() {
        seleniumHomePage.getSearchField().click();

    }

    @And("the user enters {string} in search field")
    public void searchForQuery(String query) {
        seleniumHomePage.searchForQuery(query);
    }

    @And("opens the first search tip")
    public void openFirstSearchTip() {
        seleniumHomePage.selectFirstTip();
    }

    @Then("the page title contains {string}")
    public void verifyPageTitle(String title) {
        Assert.assertTrue(searchResultPage.getTitle().contains(title));
    }
}
