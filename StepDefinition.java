package com.Stepdefinition;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import com.PageObjectModel.Product_Selector;
import com.Prestigeshop.runner.Runner1;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {

	public WebDriver driver = Runner1.driver;

	Product_Selector ps = new Product_Selector(driver);
	Actions ac;
	JavascriptExecutor js;

	@Given("User Launches the Application")
	public void user_launches_the_application() {
		driver.get("https://shop.ttkprestige.com/");

		driver.manage().window().maximize();
	}

	@Given("User clicks the presure cooker menu")
	public void user_clicks_the_presure_cooker_menu() {
		ac = new Actions(driver);
		ac.moveToElement(ps.getPressCoke()).build().perform();

	}

	@Given("User can able to check the available products in presure cooker tab")
	public void user_can_able_to_check_the_available_products_in_presure_cooker_tab() {
		ac.moveToElement(ps.getAluminum()).build().perform();
	}

	@Then("User can click any of the sub menu in presure cooker menu It navigates to the another page")
	public void user_can_click_any_of_the_sub_menu_in_presure_cooker_menu_it_navigates_to_the_another_page() {
		ac.click(ps.getAluminum()).build().perform();
	}

	@When("User selects the products")
	public void user_selects_the_products() throws InterruptedException {
		Thread.sleep(10000);
		js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200);");
		Thread.sleep(5000);
		ps.getCookerClick().click();

	}

	@When("User can able to select the products with given available features")
	public void user_can_able_to_select_the_products_with_given_available_features() throws InterruptedException {
		Thread.sleep(5000);
		ps.getLitre().click();
	}

	@Then("User clicks the products It navigates to another page.")
	public void user_clicks_the_products_it_navigates_to_another_page() {
		ps.getAddtoCart().click();

	}

	@When("User can able to view the prodcuts in add to cart page.")
	public void user_can_able_to_view_the_prodcuts_in_add_to_cart_page() throws InterruptedException {
		Thread.sleep(10000);
		ps.getShowcart().click();
	}


	@When("User clicks the proceedtocheckout button it navigates to next page.")
public void user_clicks_the_checkout_button_it_navigates_to_next_page() throws InterruptedException {
		Thread.sleep(1000);
  ps.getProceedtocheck().click();
}

}
