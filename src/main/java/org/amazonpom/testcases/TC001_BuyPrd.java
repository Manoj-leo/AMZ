package org.amazonpom.testcases;

import org.amazonpom.base.ProjectSpecificMethods;
import org.amazonpom.pages.HomePage;
import org.testng.annotations.Test;

public class TC001_BuyPrd extends ProjectSpecificMethods{

	@Test
	public void BuyProd()
	{
	 new HomePage()
	 .enterProduct()
	 .clickImage()
	 .SwitchTo()
	 .GetDate().AddToCart().ClickLogin().ClickCont();
	}
	 
}
