package amazon.ProjectOne;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import amazon.ProjectOne.Home_Amazon;
import amazon.ProjectOne.SearchResult_Amazon;
@Listeners(utility.ListenersforScreenshot.class)
public class Testcase7_Productdetailspage extends Launch_Quit_Amazon 
{
	@Test(retryAnalyzer = utility.RetryLogic.class)
	public void prdctdet()
	{
		Home_Amazon h1 = new Home_Amazon(driver);
		h1.searchproduct();
		
		SearchResult_Amazon s1 = new SearchResult_Amazon(driver);
		s1.slctsh();
		
	}

}
