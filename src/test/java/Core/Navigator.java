package Core;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import static Core.PageLoader.getCheckingURL;
import static StepDefinitions.Hooks.Hooks.driver;

/**
 * Created by Ruben-Portatil on 07/02/2016.
 */
public class Navigator {
    static public void isOnPage(String page)throws Exception {

        String url = selector(page);
        WebDriverWait wait = new WebDriverWait(driver, 10);

        //Define timer for a matching regex within 10 seconds with Error Message
        wait
                .withTimeout(10, TimeUnit.SECONDS)
                .withMessage("\n\n=====   ERROR   =====\n\nNot on proper Window! Wrong URL match - " + page + "\n\n=====   ERROR   =====\n\n")
                .pollingEvery(333, TimeUnit.MILLISECONDS)
                .until(ExpectedConditions.urlMatches("\\S*"+url));
    }

    static private String selector(String page) throws Exception {

        //Matching links
        String url = getCheckingURL(page.toLowerCase());

        return url;
    }
}
