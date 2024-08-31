package amazon.ProjectOne;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(utility.ListenersforScreenshot.class)
public class Testcase14_OrderedPage_5StarRating extends Launch_Quit_Amazon
{
	@Test(retryAnalyzer=utility.RetryLogic.class)
	public void rating()
	{
		
	}
	

}
