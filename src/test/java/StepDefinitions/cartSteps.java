package StepDefinitions;

import Pages.CartPage;
import Pages.HomePage;
import Pages.ProductPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Created by Ruben-Portatil on 07/02/2016.
 */
public class cartSteps {

    private String product;

    @Given("^I am at the shop homepage$")
    public void I_am_at_the_shop_homepage() throws Throwable {
        HomePage.goToHome();
    }

    @And("^I head to a product page$")
    public void I_head_to_a_product_page() throws Throwable {
        ProductPage.goToProduct();
    }

    @Given("^I have added an item to my cart$")
    public void I_have_added_an_item_to_my_cart() throws Throwable {
        this.product = ProductPage.addToCart();
    }

    @When("^I view the contents of my cart$")
    public void I_view_the_contents_of_my_cart() throws Throwable {
        CartPage.goToCart();
    }

    @Then("^I should see the contents of the cart include the item$")
    public void I_should_see_the_contents_of_the_cart_include_the_item() throws Throwable {
        CartPage.checkForProduct(product);
    }
}
