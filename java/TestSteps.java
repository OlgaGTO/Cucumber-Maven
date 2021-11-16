import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestSteps {
   @Given("Login page is opened in browser")
   @When("I introduce username \"ana\"")
   @And("I introduce password \"A1234567.\"")
   @And("I click Login button")
   @Then("I see application page")

    public void open_login_page(){
       //Write code here that turns the phrase/cod pentru pagina de login.
   }
}
