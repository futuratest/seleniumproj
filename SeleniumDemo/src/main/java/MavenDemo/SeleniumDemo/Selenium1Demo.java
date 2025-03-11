package MavenDemo.SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium1Demo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		WebElement eleClear = driver.findElement(By.id("drop1"));
		JavascriptExecutor js = driver;
		js.executeScript("arguments[0].setAttribute('style','background: yellow; border: 2px solid red;');", eleClear);

	}

}
