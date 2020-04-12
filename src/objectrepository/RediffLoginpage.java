package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffLoginpage {
	
	WebDriver driver;
	
	public RediffLoginpage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	
	
	By username=By.xpath("//*[@id='login1']");
	By password=By.name("passwd");
	By signin = By.name("proceed");
	By home=By.linkText("rediff.com");
	
	
	public WebElement Emailid() {
		return driver.findElement(username);
	}
	
	public WebElement Password() {
		return driver.findElement(password);
	}
	
	public WebElement Signin() {
		return driver.findElement(signin);
	}
	
	public WebElement Home() {
		return driver.findElement(home);
	}
	
	
}
