package seleDemo;

import org.apache.commons.codec.binary.Base32;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class FullintelTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		// Mozilla
/*		 System.setProperty("webdriver.Chrome.marionette",// "./geckodriver.exe");
		 driver =new FirefoxDriver();*/

		// chrome
		driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		String baseUrl = "http://fullintel.com/login";
		// String i="http://fullintel.com/3.5.4/fullintel/addcompany";
		driver.get(baseUrl);
		baseUrl = driver.getCurrentUrl();
		driver.get(baseUrl);
		WebElement analystUsername = driver.findElement(By.name("j_username"));
		WebElement analystPassword = driver.findElement(By.name("j_password"));
		WebElement loginButton = driver.findElement(By.xpath("html/body/div[1]/form/div[3]/button"));

		// String url = "http://fullintel.com/3.5.4/login?error=true";
		// driver.getCurrentUrl();

		analystUsername.sendKeys("anumanthu.e@capestart.com");
		analystPassword.sendKeys("nahibeta");
		loginButton.submit();

		// String baseUrl1 = driver.getCurrentUrl();
		// driver.get(baseUrl1);
		driver.getCurrentUrl();
		WebElement button1 = driver.findElement(By.partialLinkText("Anumanth"));
		button1.click();
		WebElement button2 = driver.findElement(By.linkText("Logout"));
		button2.click();

		// button1.submit();
		// button2.submit();
		// driver.close();
		// System.exit(0);

	}

}
