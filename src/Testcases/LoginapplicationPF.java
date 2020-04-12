package Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectrepository.RediffHomepagePF;
import objectrepository.RediffLoginpagePF;

public class LoginapplicationPF {

	@Test
	public void Login() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\z003srtv\\Documents\\SeleniumDocs\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		RediffLoginpagePF rdpf= new RediffLoginpagePF(driver);
		rdpf.Emailid().sendKeys("onur");
		rdpf.Password().sendKeys("onur");
		rdpf.Signin().click();
		rdpf.Home().click();
		
		RediffHomepagePF rhpf= new RediffHomepagePF(driver);
		
		rhpf.Search().sendKeys("rediff");
		rhpf.Submit().click();
		
		
	}

}
