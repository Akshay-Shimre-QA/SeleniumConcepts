package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.SessionNotCreatedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class ActionsScrolling {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();

		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

		// partial scrolling:
		Actions act = new Actions(driver);
//		act.sendKeys(Keys.PAGE_DOWN).perform();
//		Thread.sleep(2000);
//		act.sendKeys(Keys.PAGE_UP).perform();

		// scroll to footer of the page
//		act.sendKeys(Keys.COMMAND).sendKeys(Keys.END).perform();
//		Thread.sleep(2000);
//		
//		//scroll to top of the page
//		act.sendKeys(Keys.COMMAND).sendKeys(Keys.HOME).perform();

		// scroll to element:
		act.scrollToElement(driver.findElement(By.linkText("OpenCart"))).pause(200)
				.click(driver.findElement(By.linkText("OpenCart"))).perform();

		

	}

}
