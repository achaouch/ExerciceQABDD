package pagefactory;

import java.util.List;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.BasePage;
import junit.framework.Assert;

public class GoogleSearchPage  extends BasePage {
	
	WebDriver driver;
	
	public GoogleSearchPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void UserIsNavigatedToSearchResultsPage(String Key) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		String expectedTitle = Key+" - Recherche Google";
		wait.until(ExpectedConditions.titleContains(expectedTitle));
		driver.close();
	}
}
