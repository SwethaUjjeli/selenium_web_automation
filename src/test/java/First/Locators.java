package First;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();//selenium cannot communicate directly with browser ,chromedriver is the translator
		WebDriver driver = new ChromeDriver();//webdriver is an interface it contains all the information of browsers,driver is an object ,new ChromeDriver it will open the chrome browser and is stored in driver
		driver.manage().window().maximize();//to maximize the window
		driver.get("https://github.com/login");//instance stores in driver and give the url 
		highlight(driver, driver.findElement(By.id("login_field")));//by id
		Thread.sleep(3000);
		highlight(driver, driver.findElement(By.name("password")));
		Thread.sleep(3000);
		highlight(driver, driver.findElement(By.className("header-logo")));
		Thread.sleep(3000);
		highlight(driver, driver.findElement(By.linkText("Forgot password?")));//we should give complete name , partial will not be accepted/identified
		Thread.sleep(3000);
		highlight(driver, driver.findElement(By.partialLinkText("Create an")));//we can give partial name
		Thread.sleep(3000);
		highlight(driver, driver.findElement(By.tagName("h1")));
		Thread.sleep(3000);
		highlight(driver, driver.findElement(By.xpath("//label[contains(text(),'Username or email address')]")));
		Thread.sleep(3000);
		highlight(driver, driver.findElement(By.cssSelector("input[name='commit']")));		
	}
		
			public static void highlight(WebDriver driver, WebElement element) {
			JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
			jsExecutor.executeScript("arguments[0].setAttribute('style', 'border:2px solid red; background:yellow')", element);//to highlight the fields
		}

	}

	


