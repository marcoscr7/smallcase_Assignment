package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonProductPage
{
	//Initialization
		public  AmazonProductPage(WebDriver driver)
		{
			PageFactory.initElements(driver,this);
		}
		//declaration
		@FindBy(xpath="(//span[@class='a-price-whole'])[5]")
		private WebElement ProductPrice;
		
		
		
		
		//Getters Method
		public WebElement getProductPrice() 
		{
			return ProductPrice;
		}
		
		
		
		

}
