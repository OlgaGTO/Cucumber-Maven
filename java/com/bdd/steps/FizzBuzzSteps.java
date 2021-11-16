package com.bdd.steps;

import com.bdd.FizzBuzz;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class FizzBuzzSteps {
   /* private FizzBuzz fb;
    String result;
    @Given("create a FizzBuzz game play")
    public void createAFizzBuzzgamePlay(){
        fb=new FizzBuzz();

    }
    @When("I introduce the number {int}")
    public void introduceANumber(int number){
        result = fb.play(number);
    }
    @Then("I see message fizz")
    public void iSeeTheMessage(){
        Assertions.assertEquals(result,"fizz");

    }*/
    /*private FizzBuzz fb;
    String result;
    @Given("create a FizzBuzz game play")
    public void createAFizzBuzzgamePlay(){
        fb=new FizzBuzz();
    }
    @When("I introduce the number {int}")
    public void introduceANumber(int number){
        result=fb.play(number);
    }
    @Then("I see message buzz")
    public void iSeeTheMessage() {
        Assertions.assertEquals(result, "buzz");
    }*/
   /* private FizzBuzz fb;
    String result;
   @Given("create a FizzBuzz game play")
   public void createAFizzBuzzgamePlay() {
       fb = new FizzBuzz();
   }
    @When("I introduce the number {int}")
    public void introduceANumber(int number) {
        result = fb.play(number);
    }
    @Then("I see message fizzbuzz")
    public void iSeeTheMessage() {
        Assertions.assertEquals(result, "fizzbuzz");
    } */
   /*private FizzBuzz fb;
    String result;
    @Given("create a FizzBuzz game play")
    public void createAFizzBuzzgamePlay() {
        fb = new FizzBuzz();
    }
    @When("I introduce the number {int}")
    public void introduceANumber(int number) {
        result = fb.play(number);
    }
    @Then("I see message buzz")
    public void iSeeTheMessage() {
        Assertions.assertEquals(result, "buzz");
    }*/
   private FizzBuzz fb;
    String result;
    @Given("create a FizzBuzz game play")
    public void createAFizBuzzgamePlay(){

        fb = new FizzBuzz();
    }
    @When("I introduce the number {int}")
    public void introduceNumber(int number){

        result = fb.play(number);
    }
    @Then("I see message fizz")
    public void iseemessagefizz()
    {
        Assertions.assertEquals(result,"fizz");
    }
    @Then("I see message fizzbuzz")
    public void iseemessagefizzbuzz()
    {
        Assertions.assertEquals(result,"fizzbuzz");
    }
    @Then("I see message buzz")
    public void iseemessagebuzz()
    {
        Assertions.assertEquals(result,"buzz");
    }
    @Then("I see the number {string}")
    public void iseenumber(String number){
        Assertions.assertEquals(result,number);
    }
}
