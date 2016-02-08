package Pages;

import org.openqa.selenium.By;

import static Core.PageLoader.getDirectingURL;
import static StepDefinitions.Hooks.Hooks.driver;

/**
 * Created by Ruben-Portatil on 07/02/2016.
 */
public class ProductPage {

    public static void goToProduct() throws Exception{
        String url = getDirectingURL("product");
        driver.get(url);
    }

    public static String addToCart() {
        String productName = driver.findElement(By.id("productTitle")).getAttribute("innerHTML");
        driver.findElement(By.id("add-to-cart-button")).click();
        return productName;
    }
}
