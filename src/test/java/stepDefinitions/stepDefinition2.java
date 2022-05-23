package stepDefinitions;



import org.junit.runner.RunWith;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

//@RunWith(Cucumber.class)
public class stepDefinition2 {

    @Given("^User is on landing page$")
    public void user_is_on_landing_page()  {
    	 System.out.println("user is on landing pageafasdf");
    	 // throw new io.cucumber.java.PendingException();
    }
        

    @Then("^Home page is populated$")
    public void home_page_is_populated()  {
    	 System.out.println("home is po;ulatedafasdf");
     //	throw new io.cucumber.java.PendingException();
    
    }

    	 @When("^User login to the application with user name \"([^\"]*)\" and password \"([^\"]*)\"$")
    	    public void user_login_to_the_application_with_user_name_something_and_password_something(String arg1,String arg2) {
           System.out.println(arg1);
           System.out.println(arg2);
       	
        	//throw new PendingException();
                    }

    	 @And("^Cards displayed are \"([^\"]*)\"$")
    	    public void cards_displayed_are_something(String strArg1) {
    		 System.out.println(strArg1);
    	        
    	    }
    }
