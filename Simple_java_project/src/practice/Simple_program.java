package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Simple_program {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", ".\\Resources\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
	}
}
