package Task_01;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.Base;

public class PhpTravelsAutomation extends Base {
	public static void main(String[] args) throws InterruptedException {
		setUp();
//step 1

		navigateUrl("https://www.phptravels.net/");

//step 2

		click(By.xpath("//button[@id='tours-tab']"));
//step 3
		click(By.xpath("//*[@id='select2-tours_city-container']"));

		sendKeys(By.xpath("/html/body/span/span/span[1]/input"), "Johor Bahru");

		click(By.xpath("//*[@id='select2-tours_city-results']/li/i"));

		Thread.sleep(2000);
//step 4
		driver.findElement(By.xpath("//form[@id='tours-search']//input[@id='date']")).click();

		click(By.xpath("/html/body/div[10]/div[1]/table/thead/tr[1]/th[3]"));

		click(By.xpath("/html/body/div[10]/div[1]/table/tbody/tr[2]/td[7]"));

		// step 5
		click(By.xpath("//form[@id='tours-search']//a"));

		click(By.xpath("//*[@id='tours-search']/div/div/div[3]/div/div/div/div/div[1]/div/div/div[2]"));

		click(By.xpath("//form[@id='tours-search']//button"));

		Thread.sleep(2000);
//step 6

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0, 1200)");
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		WebDriverWait explicitWait = new WebDriverWait(driver, 30);
		explicitWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='legoland malaysia day pass']//div[@class='card-price']/a")));

		try {
			Thread.sleep(10000);
			click(By.xpath("//*[@id='legoland malaysia day pass']//div[@class='card-price']/a"));
		} catch (Exception e) {
			try {
				Thread.sleep(10000);
				click(By.xpath("//*[@id='legoland malaysia day pass']//div[@class='card-price']/a"));
			} catch (Exception e2) {
				System.out.println("Details link is not clicked.");
			}
		}
//step 7
		js.executeScript("window.scrollBy(0, 2000)");

		// *[text()=' Book Now']

		explicitWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()=' Book Now']")));
		
		try {
			Thread.sleep(10000);
			// *[text()=' Book Now']
			click(By.xpath("//form/div[3]/button"));
		} catch (Exception e) {
			try {
				Thread.sleep(10000);
				// *[text()=' Book Now']
				click(By.xpath("//*[text()=' Book Now']"));
			} catch (Exception e2) {
				System.out.println("Book Now is not clicked.");
			}
		}

		sendKeys(By.xpath("//input[@name='firstname']"), "Jannatul");

		sendKeys(By.xpath("//input[@name='lastname']"), "Ferdous");

		sendKeys(By.xpath("//input[@name='email']"), "jannatul@gmail.com");

		sendKeys(By.xpath("//input[@name='phone']"), "+8801728803979");

		sendKeys(By.xpath("//input[@name='address']"), "Mirpur: 2, Dhaka: 1216");
		
		js.executeScript("window.scrollBy(0, 500)");

		Thread.sleep(10000);
		
		click(By.xpath(
				"//div[@class='contact-form-action']//div[6]//span[text()='India']"));

		click(By.xpath("//li[text()='Bangladesh']"));

		Thread.sleep(10000);
		
		click(By.xpath(
				"//div[@class='contact-form-action']//div[7]//span[text()='India']"));

		click(By.xpath("//li[text()='Bangladesh']"));

		///// Traveler 01 Information

		WebElement t1Title = driver.findElement(By.xpath("//select[@name='title_1']"));

		Select traveller1_title = new Select(t1Title);

		String tr1Title = "MISS";

		traveller1_title.selectByVisibleText(tr1Title);

		String tr1FirstName = "Jannatul";

		sendKeys(By.xpath("//input[@name='firstname_1']"), tr1FirstName);

		String tr1SecondName = "Ferdous";

		sendKeys(By.xpath("//input[@name='lastname_1']"), tr1SecondName);

		///// Traveler 02 Information

		WebElement t2Title = driver.findElement(By.xpath("//select[@name='title_2']"));

		Select traveller2_title = new Select(t2Title);

		String tr2Title = "MR";

		traveller2_title.selectByVisibleText(tr2Title);

		String tr2FirstName = "x";

		sendKeys(By.xpath("//input[@name='firstname_2']"), tr2FirstName);

		String tr2SecondName = "y";

		sendKeys(By.xpath("//input[@name='lastname_2']"), tr2SecondName);
		
		js.executeScript("window.scrollBy(0, 500)");
		
		Thread.sleep(10000);

		click(By.xpath("//ul[@id='myTab']//input[@id='gateway_pay-later']"));

		js.executeScript("window.scrollBy(0, 150)");
		
		Thread.sleep(5000);

		click(By.xpath("//div[@class='custom-checkbox']"));
		
		Thread.sleep(5000);

		click(By.xpath("//button[@id='booking']"));

		click(By.xpath("//a[text()='Back to Home']"));
	}
}
