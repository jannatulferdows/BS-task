package base;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	public static WebDriver driver;

	public static void setUp() {
		System.setProperty("webdriver.chrome.driver", "D:\\Java\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	public static void navigateUrl(String url) {
		driver.get(url);
	}

	public static void click(By by) {
		driver.findElement(by).click();
	}

	public static void sendKeys(By by, String keyWord) {
		driver.findElement(by).sendKeys(keyWord);
	}

	public static void tearDown() {
		driver.close();
	}
}
