package First;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class HandleTextBoxes {
	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();//selenium cannot communicate directly with browser ,chromedriver is the translator
		WebDriver driver = new ChromeDriver();//webdriver is an interface it contains all the information of browsers,driver is an object ,new ChromeDriver it will open the chrome browser and is stored in driver
		driver.manage().window().maximize();//to maximize the window
		driver.get("https://github.com/login");//instance stores in driver and give the url 
		Thread.sleep(3000);//it will wait for 3sec
		WebElement usernameTxt = driver.findElement(By.id("login_field"));
		if(usernameTxt.isDisplayed()) {
			if(usernameTxt.isEnabled()) {//we have a method called isenabled
				usernameTxt.sendKeys("HYR");//to enter something we have sendkeys method
				String enteredText = usernameTxt.getAttribute("value");//get text we use for labels , if we want attribute value we need get attribute
				System.out.println(enteredText);
				Thread.sleep(3000);
				usernameTxt.clear();//elear methid is used to clear the value whichwe have enetered
			}
			else
				System.err.println("username textbox is not enabled");
		}
		else
			System.err.println("username textbox is not displayed");
	}
}