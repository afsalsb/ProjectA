package stepDefinitions;



import org.junit.runner.RunWith;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

//@RunWith(Cucumber.class)
public class stepDefinition {

    @Given("^first$")
    public void user_is_on_landing_page()  {
    	 System.out.println("user is on landing pageafasdf");
    	 // throw new io.cucumber.java.PendingException();
    }
        

    @Then("^second$")
    public void home_page_is_populated()  {
    	 System.out.println("home is po;ulatedafasdf");
     //	throw new io.cucumber.java.PendingException();
    
    }
  

    	 @When("^third$")
    	    public void third() {
         System.out.println("third");
         
        	//throw new PendingException();
                    }

    	 @And("^forth$")
    	    public void cards_displayed_are_something(){
    		 System.out.println("forthe");
    	        
    	    }
    }


