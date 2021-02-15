package pagefactory;

import java.util.List;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.BasePage;

public class GooglePage  extends BasePage {
	
	@FindBy(name = "q")
	WebElement RechercherInput;

	@FindBy(id = "introAgreeButton")
	WebElement AgreeButton;
	
	WebDriver driver;
	
	public GooglePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void NavigateToGoogleSearchPage() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		driver.navigate().to("https://google.fr");
		wait.until(ExpectedConditions.titleContains("Google"));
	}
	
	public void UserEntersTextInSearchBox(String Key) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		driver.switchTo().frame(0);
		AgreeButton.click();
		driver.switchTo().defaultContent();
		wait.until(ExpectedConditions.visibilityOf(RechercherInput));
		RechercherInput.sendKeys(Key);
	}
	
	public void UserHitsEnter() {
		RechercherInput.sendKeys(Keys.ENTER);
		
	}
	
}
