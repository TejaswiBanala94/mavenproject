package amazon.ProjectOne;

import org.testng.annotations.Test;

import amazon.ProjectOne.Home_Amazon;

public class Testcase5_searchingshoe extends Launch_Quit_Amazon 
{
	@Test(retryAnalyzer = utility.RetryLogic.class)
	public void search()
	{
		Home_Amazon h1 = new Home_Amazon(driver);
		h1.searchproduct();
	}
	

}
