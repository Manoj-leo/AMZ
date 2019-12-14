package org.amazonpom.pages;

import org.amazonpom.base.ProjectSpecificMethods;
import org.openqa.selenium.WebElement;

public class HomePage extends ProjectSpecificMethods{
		
		
		public HomePage enterProduct() {
			driver.findElementByXPath("//input[@id='twotabsearchtextbox']").sendKeys("Samsung Galaxy M30");
			driver.findElementByClassName("nav-input").click();
			WebElement price = driver.findElementByXPath("//span[text()='9,999'][1]");
			System.out.println("price is :" +price.getText());
			return this;
			
		}
		
		public Product clickImage() {
			driver.findElementByXPath("//img[@src='https://m.media-amazon.com/images/I/81Xpn-TDy-L._AC_UY218_ML3_.jpg'][1]").click();
			return new Product();
		}
		
		

}
