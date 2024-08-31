package amazon.ProjectOne;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import amazon.ProjectOne.Home_Amazon;
import amazon.ProjectOne.LoginAmazon;
@Listeners(utility.ListenersforScreenshot.class)

public class Testcase3_for_Loginfails extends Launch_Quit_Amazon 
{
	@Test(retryAnalyzer = utility.RetryLogic.class)
	public void loginwithincorrect() throws EncryptedDocumentException, IOException
	{
		Home_Amazon h1 = new Home_Amazon(driver);
		h1.acctlist(driver);
		h1.signin();
		LoginAmazon l1= new LoginAmazon(driver);
		l1.un("loginamazon",1,0);
		l1.cnt();
		l1.pswd("loginamazon",1,1);
		l1.signin();
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0", "Sorry the testcase is failed");
	}

	

}
