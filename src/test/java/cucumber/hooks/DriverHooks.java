package cucumber.hooks;

import driver.SingletonDriver;
import io.cucumber.java.After;

public class DriverHooks {
    @After
    public void quitDriver(){
        SingletonDriver.closeDriver();
    }
}
