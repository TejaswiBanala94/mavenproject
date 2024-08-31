package amazon.ProjectOne;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfileInformation_Amazon 
{
	ChromeDriver driver;
	@FindBy(xpath="//div[@class='sc-GKYbw iNmWLy']")
	WebElement manageprofile;
	
	@FindBy(xpath="//div[@class='sc-ftTHYK cfzGZz']")
	WebElement profle;
	
	public void mngprfle()
	{
		manageprofile.click();
	}
	
	public void prfl()
	{
		profle.click();
	}
	public ProfileInformation_Amazon(ChromeDriver driver)
	{
		
		PageFactory.initElements(driver, this);
	}
	
	
	

}
