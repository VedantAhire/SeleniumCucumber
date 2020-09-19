package stepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class HooksInCucumber {
	
//@Before  // Global hooks
//public void setUp()
//{
//	System.out.println("Launch the chrome browser");
//	System.out.println("Enter url of FreeCRM");
//	System.out.println("Login to CRM");
//}
//
//@After  //Global hooks
//public void tearDown()
//{
//	System.out.println("close the browser");
//}
//
//@Before("@First")
//@Given("^user is on deal page$")
//public void user_is_on_deal_page() {
//    System.out.println("user is on the new deal page");
//}
//
//@When("^user fills the deal details$")
//public void user_fills_the_deal_details() {
//    System.out.println("user fills all the new deal details");
//}

@Then("^new deal is created$")
public void new_deal_is_created() {
System.out.println("user created new deal"); 
}


@Given("^user is on contact page$")
public void user_is_on_contact_page() {
    System.out.println("user is on the new contact page");
}

@When("^user fills the contact details$")
public void user_fills_the_contact_details() {
    System.out.println("user fills all the new contact details");
}

@Then("^new contact is created$")
public void new_contact_is_created() {
System.out.println("user created new contact"); 
}
	
@Given("^user is on tasks page$")
public void user_is_on_tasks_page() {
    System.out.println("user is on the new tasks page");
}

@When("^user fills the taskdetails$")
public void user_fills_the_task_details() {
    System.out.println("user fills all the new task details");
}

@Then("^new task is created$")
public void new_task_is_created() {
System.out.println("user created new task"); 
}

@Given("^user is on calls page$")
public void user_is_on_call_page() {
    System.out.println("user is on the new deal page");
}

@When("^user fills the calldetails$")
public void user_fills_the_call_details() {
    System.out.println("user fills all the new call details");
}

@Then("^new call is created$")
public void new_call_is_created() {
System.out.println("user created new call"); 
}

	
	
	
	
	
	
	
	
	
	

}
