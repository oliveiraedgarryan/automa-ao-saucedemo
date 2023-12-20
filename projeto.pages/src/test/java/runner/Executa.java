package runner;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import drivers.Drivers;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Executa extends Drivers {

	public static void abrirNavegador() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://saucedemo.com");
		driver.manage().window().maximize();

	}

	public static void fecharNavegador() {
		//driver.quit();

	}

}
