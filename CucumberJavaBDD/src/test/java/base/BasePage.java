package base;

import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

//import gherkin.ast.Scenario;

import org.openqa.selenium.TakesScreenshot;

import io.cucumber.java.After;
import io.cucumber.java.Before;
//import io.cucumber.core.gherkin.vintage.internal.gherkin.ast.Scenario;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.cucumber.java.Scenario;

public class BasePage {

	public WebDriver driver;
	public Properties prop;
	public static ThreadLocal<WebDriver> tdriver = new ThreadLocal<WebDriver>();

	public WebDriver initialize_driver(String browser) {
		if (browser == "chrome") {
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			tdriver.set(driver);
			return getDriver();
		} else if (browser == "opera") {
			WebDriverManager.operadriver().setup();
			WebDriver driver = new OperaDriver();
			driver.manage().window().maximize();
			tdriver.set(driver);
			return getDriver();
		} else {
			WebDriverManager.firefoxdriver().setup();
			WebDriver driver = new FirefoxDriver();
			driver.manage().window().maximize();
			tdriver.set(driver);
			return getDriver();
		}
	}

	public static synchronized WebDriver getDriver() {
		return tdriver.get();
	}

	
	}


