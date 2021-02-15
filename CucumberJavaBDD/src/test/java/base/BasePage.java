package base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class BasePage {

	public WebDriver driver;
	
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


