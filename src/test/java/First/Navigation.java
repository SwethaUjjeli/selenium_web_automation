package First;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Navigation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");//opens the url
		Thread.sleep(3000);//it will wait for 3seconds
		driver.findElement(By.name("q")).sendKeys("HYR Tutorials");//search bar typ
		driver.findElement(By.name("q")).submit();//on submission it will redirect to the search result page
		Thread.sleep(3000);
		driver.navigate().to("https://www.facebook.com/");//it will go to the facebook
		Thread.sleep(3000);
		driver.findElement(By.id("email")).sendKeys("test@gmail.com");//email will be typed
		Thread.sleep(3000);
		driver.navigate().refresh();//if refreshed email will be gone
		Thread.sleep(3000);
		driver.navigate().back();//when we go back it will be on search result HYR page
		Thread.sleep(3000);
		driver.navigate().forward();//if clicked forward it will be on facebook page
		Thread.sleep(3000);
		driver.quit();//closes  browser
	}

	}


