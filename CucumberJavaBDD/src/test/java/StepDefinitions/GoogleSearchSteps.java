package StepDefinitions;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import base.BasePage;
//import io.cucumber.core.gherkin.vintage.internal.gherkin.ast.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.de.Aber;
import io.cucumber.java.en.*;
import page.GooglePage;
import page.GoogleSearchPage;
import io.cucumber.java.Scenario;
public class GoogleSearchSteps {

	public BasePage basePage;
	public WebDriver driver;
	public GooglePage googlePage;
	public GoogleSearchPage googleSearchPage;

	
	@Given("browser window is open")
	public void browser_is_open() {
		basePage = new BasePage();
		driver = basePage.initialize_driver("chrome");
	}

	@And("user is on google search page")
	public void user_is_on_google_search_page() {
		googlePage = new GooglePage(driver);
		googlePage.NavigateToGoogleSearchPage();
	}

	@When("^user enters a (.*) in search box")
	public void user_enters_a_text_in_search_box(String keyword) {
		googlePage.UserEntersTextInSearchBox(keyword);
	}

	@And("user hits enter")
	public void user_hits_on_enter() {
		googlePage.UserHitsEnter();
	}

	@Then("^user is navigated to search results of (.*)$")
	public void user_is_navigated_to_search_results(String keyword) {
		googleSearchPage = new GoogleSearchPage(driver);
		googleSearchPage.UserIsNavigatedToSearchResultsPage(keyword);
	}


	@After
	public void tearDown(Scenario scenario) {
		try {
			String screenshotName = scenario.getName().replaceAll(" ", "_");
			if (scenario.isFailed()) {
				scenario.log("Scenario is Failed");
				TakesScreenshot ts = (TakesScreenshot) driver;
				byte[] screenshot = ts.getScreenshotAs(OutputType.BYTES);
				scenario.attach(screenshot, "image/png", screenshotName);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		driver.quit();
	}
	



}
