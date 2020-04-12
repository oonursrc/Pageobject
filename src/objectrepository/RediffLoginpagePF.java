package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffLoginpagePF {
	
	WebDriver driver;
	
	public RediffLoginpagePF(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	
	
	/*By username=By.xpath("//*[@id='login1']");
	By password=By.name("passwd");
	By signin = By.name("proceed");
	By home=By.linkText("rediff.com");*/
	
	@FindBy(xpath = "//*[@id='login1']")
	WebElement username;
	
	@FindBy(name = "passwd")
	WebElement password;
	
	@FindBy(name = "proceed")
	WebElement signin;
	
	@FindBy(linkText = "rediff.com")
	WebElement home;
	
	
	
	public WebElement Emailid() {
		return username;
	}
	
	public WebElement Password() {
		return password;
	}
	
	public WebElement Signin() {
		return signin;
	}
	
	public WebElement Home() {
		return home;
	}
	
	
}
