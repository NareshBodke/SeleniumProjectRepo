package Features;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Search {

	@Given("^I visit the website as guest user$")
public void I_visit_the_website_as_guest_user() {
	
	System.out.println(" sample codw executed..............1...");
	
}
	
	@When("^I select the book option from search dropdown$")
	public void I_select_the_book_option_from_search_dropdown() {
		
		System.out.println("^sample codw executed..............2...$");
	}
	
	@And("^I click on the search option$")
	public void I_click_on_the_search_option() {
		
		System.out.println("^sample codw executed..............3...$");
	}
	
	@Then("^I should be going on book search page$")
	public void I_should_be_going_on_book_search_page() {
		
		System.out.println("^sample codw executed..............4...$");
	}
	
	@But("^I should not be able to see other products$")
	public void I_should_not_be_able_to_see_other_products() {
		
		System.out.println("^sample codw executed..............5...$");
	}
	
	
	
	
	@Given("^I visit the website as guest user two$")
	public void I_visit_the_website_as_guest_user_two() {
		
		System.out.println(" sample codw executed..............6...");
		
	}
		
		@When("^I select the baby products option from search dropdown$")
		public void I_select_the_baby_products_option_from_search_dropdown() {
			
			System.out.println("^sample codw executed..............7...$");
		}
		
		@And("^I click on the search option button$")
		public void I_click_on_the_search_option_button() {
			
			System.out.println("^sample codw executed..............8...$");
		}
		
		@Then("^I should be going on baby product search page$")
		public void I_should_be_going_on_baby_product_search_page() {
			
			System.out.println("^sample codw executed..............9...$");
		}
		
		@But("^I should not be able to see other products on page$")
		public void I_should_not_be_able_to_see_other_products_on_page() {
			
			System.out.println("^sample codw executed..............10...$");
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
