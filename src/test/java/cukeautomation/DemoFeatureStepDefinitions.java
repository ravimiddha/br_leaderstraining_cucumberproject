package cukeautomation;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DemoFeatureStepDefinitions {
	@Given("Precondition is given")
	public void p() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Precondition is given, my random text");
		//throw new io.cucumber.java.PendingException();
	}

	@When("Something is done")
	public void s() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Something is done");
		//throw new io.cucumber.java.PendingException();
	}

	@Then("Something is expected")
	public void se() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Something is expected");
		//throw new io.cucumber.java.PendingException();
	}

	@Given("Another precondition is given")
	public void another_precondition_is_given() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Another precondition is given");
		//throw new io.cucumber.java.PendingException();
	}

	@When("Something is done again")
	public void something_is_done_again() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Something is done again");
		//throw new io.cucumber.java.PendingException();
	}

	@Then("Something is expected again")
	public void something_is_expected_again() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Something is expected again");
		//throw new io.cucumber.java.PendingException();
	}

}
