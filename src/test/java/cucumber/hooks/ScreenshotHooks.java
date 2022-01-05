package cucumber.hooks;

import driver.SingletonDriver;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class ScreenshotHooks {
    public static final String PNG_FILE_EXTENSION = "image/png";

    @After
    public void createScreenshot(Scenario scenario){
        scenario.log(SingletonDriver.getDriver().getCurrentUrl());
        byte[] screenshot = ((TakesScreenshot) SingletonDriver.getDriver()).getScreenshotAs(OutputType.BYTES);
        scenario.attach(screenshot, PNG_FILE_EXTENSION, scenario.getName());
    }
}
