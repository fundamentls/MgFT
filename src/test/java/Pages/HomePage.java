package Pages;

import static Core.PageLoader.getDirectingURL;
import static StepDefinitions.Hooks.Hooks.driver;
import static Core.Navigator.isOnPage;

/**
 * Created by Ruben-Portatil on 07/02/2016.
 */
public class HomePage {
    public static void goToHome() throws Exception {

        String url;

        //Get Page
        url = getDirectingURL("Home");

        //Visit Page
        driver.get(url);

        //Is on Page
        isOnPage("Home");
    }
}
