import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ShoppingSteps {
    @Given("I am logged into application")
    @When("I click the product's list page")
    @Then("I see a list of thumbnails")
    @When("I click on the desired product")
    @Then("I see full picture of the product")
    @And("I see product details")

    @Given("I am logged into application")
    @When("I search by category < category>")
    @Then("I see products from the selected category")
    public void shopping_for_a_product(){
        //Write the code here
    }
}

