package QAWorks;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertTrue;

/**
 * Barebones QAWorks Contact Us test
 *
 * @author Peter Kidson  Mar 2018
 */

public class ContactUs {

	@Test
	public void gotoPage()  throws Exception {
		System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("http://www.qaworks.com/");
		Thread.sleep(2000);
		assertTrue(driver.getTitle().equals("QAWorks Limited - Software Quality & Delivery Experts"));

		String xpMenuItem = ".//html/descendant::span[contains(text(), 'CONTACT US') ]";
		WebElement weMenuItem = driver.findElement(By.xpath(xpMenuItem));
		weMenuItem.click();

		String xpName = ".//html/descendant::span[@class='wpcf7-form-control-wrap your-name']/descendant::input[@name='your-name']";
		WebElement weName = driver.findElement(By.xpath(xpName));
		weName.sendKeys("j.Bloggs");

		String xpEmail = ".//html/descendant::span[@class='wpcf7-form-control-wrap your-email']/descendant::input[@name='your-email']";
		WebElement weEmail = driver.findElement(By.xpath(xpEmail));
		weEmail.sendKeys(" j.Bloggs@qaworks.com");

		String xpCompany = ".//html/descendant::span[@class='wpcf7-form-control-wrap your-company']/descendant::input[@name='your-company']";
		WebElement weCompany = driver.findElement(By.xpath(xpCompany));
		weCompany.sendKeys("test automation");

		String xpMessage = ".//html/descendant::span[@class='wpcf7-form-control-wrap your-message']/descendant::textarea[@name='your-message']";
		WebElement weMessage = driver.findElement(By.xpath(xpMessage));
		weMessage.sendKeys("please contact me I want to find out more ");

		Thread.sleep(2000);
		driver.quit();
	}
}
