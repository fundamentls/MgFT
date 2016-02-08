package StepDefinitions.Hooks;

import Core.Driver;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by Ruben-Portatil on 07/02/2016.
 */
public class Hooks {
    public static volatile WebDriver driver;

    @Before()
    public void testSetup() throws Exception {
        //Clear Instance
        Driver.clearInstance();

        //Create Instance
        driver = Driver.getInstance();

        //Configure default timeout for driver
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @After()
    public void testShutdown() throws Exception {
        //Driver quit
        driver.quit();
    }


}
