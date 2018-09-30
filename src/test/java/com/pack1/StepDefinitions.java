package com.pack1;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitions {
	Common cobj;

	@Given("^open chrome brower$")
	public void open_chrome_brower() throws Throwable {
		cobj = new Common();
		cobj.launchBrowser("Chrome");

	}

	@When("^navigate to orangehrm application$")
	public void navigate_to_orangehrm_application() throws Throwable {
		cobj.accesApplication("http://apps.qaplanet.in/qahrm/login.php");

	}

	@Then("^enter the user details$")
	public void enter_the_user_details() throws Throwable {
		cobj.setIntoTextBox("//*[@id=\"Table_01\"]/tbody/tr[1]/td[2]/table/tbody/tr[2]/td[2]/input", "qaplanet1");
		cobj.setIntoTextBox("//*[@id=\"Table_01\"]/tbody/tr[1]/td[2]/table/tbody/tr[3]/td[2]/input", "lab1");
		cobj.clickOnButton("//*[@id=\"Table_01\"]/tbody/tr[1]/td[2]/table/tbody/tr[4]/td[1]/input");

	}

	@Then("^logout from the application$")
	public void logout_from_the_application() throws Throwable {
		cobj.clickOnLink("Logout");

	}

	@Then("^quit the browser$")
	public void quit_the_browser() throws Throwable {
		cobj.quitBrowser();
	}

}
