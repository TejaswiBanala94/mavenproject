package amazon.ProjectOne;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Checkoutpage_Amazon 
{
	ChromeDriver driver;
	@FindBy(xpath="(//input[@class='a-button-input'])[2]")
	WebElement useaddress;
	
	@FindBy(name="ppw-instrumentRowSelection")
	WebElement creditdebit;
	
	@FindBy(linkText="Enter card details")
	WebElement entercarddetails;
	
	@FindBy(xpath="(//input[@name='ppw-instrumentRowSelection'])[2]")
	WebElement netbanking ;
	
	@FindBy(name="ApxSecureIframe")
	WebElement cardnumber ;
	
	public void crdnum()
	{
		driver.switchTo().frame(cardnumber);
		cardnumber.sendKeys("44233263344");
	}
	
	
	public void usadd()
	{
		useaddress.click();
	}
	
	public void entrcrddet()
	{
		entercarddetails.click();
	}
	
	public void crdt()
	{
		creditdebit.click();
	}
	public void ntbnkng()
	{
		netbanking.click();
	}
	
	public Checkoutpage_Amazon(ChromeDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
