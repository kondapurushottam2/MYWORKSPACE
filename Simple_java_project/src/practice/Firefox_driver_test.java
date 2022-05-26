package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox_driver_test {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "F:\\Eclipse IDE\\Simple_java_project\\Resources\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.myntra.com/login");
	}
	
}
