package objectrepository;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffHomepagePF {
	
	WebDriver driver;
	
	public RediffHomepagePF(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(xpath = "//*[@id='srchword']")
	WebElement search;
	
	@FindBy(xpath = "//input[@type='submit']")
	WebElement submit;

	
	
	public WebElement Search() {
		return search;
	}
	
	public WebElement Submit() {
		return submit;
	}
	

	
	
}
