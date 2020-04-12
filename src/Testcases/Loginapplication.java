package Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectrepository.RediffHomepage;
import objectrepository.RediffLoginpage;

public class Loginapplication {

	@Test
	public void Login() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\z003srtv\\Documents\\SeleniumDocs\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		RediffLoginpage rd= new RediffLoginpage(driver);
		rd.Emailid().sendKeys("onur");
		rd.Password().sendKeys("onur");
		rd.Signin().click();
		rd.Home().click();
		
		RediffHomepage rh= new RediffHomepage(driver);
		
		rh.Search().sendKeys("rediff");
		rh.Submit().click();
		
		
	}

}
