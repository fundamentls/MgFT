package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static Core.Navigator.isOnPage;
import static StepDefinitions.Hooks.Hooks.driver;

/**
 * Created by Ruben-Portatil on 07/02/2016.
 */
public class CartPage {
    public static void goToCart() throws Exception{

        driver.findElement(By.id("nav-cart")).click();

        isOnPage("cart");
    }

    public static void checkForProduct(String product) throws Exception {

        boolean check = false;

        List<WebElement> result = obtainElements();

        for (WebElement element : result) {
            if (element.getText().equals(product)){
                check = true;
                break;
            }
        }

        if (check == false) {
            throw  new Exception("\n\n\nNo product matches the one intended\n\n\n");
        }
    }

    private static List<WebElement> obtainElements() throws Exception{
        // NOTE:
        // This method is just a proof of concept for this particular element!!!
        // On a much larger scale, this should be replaced!
        // I suggest creating a class designed to handle the search for active, visible and clickable elements.
        // There should be different levels of assertion.
        // There should also be different ways to search for elements, and ways to simplifying the search itself.

        // In this particular case, it is needed to search using XPath *yuck*

        List<WebElement> result = driver.findElements(By.xpath("//ul/li//span[contains(@class, 'sc-product-title')]"));

        if (result.size() == 0) {
            throw  new Exception("\n\n\nNo products found\n\n\n");
        }

        return result;

    }
}
