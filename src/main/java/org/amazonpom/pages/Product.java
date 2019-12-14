package org.amazonpom.pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.amazonpom.base.ProjectSpecificMethods;
import org.openqa.selenium.WebElement;

public class Product extends ProjectSpecificMethods {
	
	public Product SwitchTo()
	{
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> windowsList = new ArrayList<String>();
		windowsList.addAll(windowHandles);
		driver.switchTo().window(windowsList.get(1));
		return this;
	}
	
	public Product GetDate()
	{
		WebElement date = driver.findElementByXPath("//span[text()='Mon, Dec 16']");
		System.out.println("date is :" +date.getText());
		return this;
	}
	
	public Product AddToCart()
	{
		driver.findElementById("add-to-cart-button").click();
		//String a1 = driver.findElementById("h1").getText();
		String a1 = driver.findElementByXPath("//h1[@class='a-size-medium a-text-bold']").getText();
		if(a1.equals("Added to Cart"))
		{
			System.out.println("Added to Cart");
		}
		else
		{
			System.out.println("Not Added to Cart");
		}
		return this;
	}
	
	public Product ClickLogin()
	{
		driver.findElementByXPath("//a[@id='hlb-ptc-btn-native']").click();	
		String a2 = driver.findElementByXPath("//h1[text()[normalize-space()='Login']]").getText();
				if(a2.equals("Login"))
				{
					System.out.println("login");
				}	
				return this;
	}
	
	public Product ClickCont()
	{
	  driver.findElementByXPath("(//input[@id='continue'])[1]").click();
	  String text = driver.findElementByXPath("(//div[@class='a-alert-content'])[2]").getText();
	  if(text.equals("Enter your email or mobile phone number"))
	  {
		  System.out.println("Enter your email or mobile phone number");
	  }
	  return this;
	}

}
