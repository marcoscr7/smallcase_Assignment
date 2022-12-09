package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductCartPage
{
	//Initialization
		public  ProductCartPage(WebDriver driver)
		{
			PageFactory.initElements(driver,this);
		}
		
		//declaration
		@FindBy(xpath="(//button[@class='_23FHuj'])[2]")
		private WebElement IncreaseProductButton;
		
		@FindBy(xpath="(//div[@class='_24KATy'])[6]")
		private WebElement TotalAmount;

		@FindBy(xpath="//div[@class='_2FYYw1 _2_OGP3 _2T1qz2']")
		private WebElement FlipkartModule;
		
		public WebElement getFlipkartModule()
		{
			return FlipkartModule;
		}

		//getters method
		public WebElement getIncreaseProductButton()
		{
			return IncreaseProductButton;
		}

		public WebElement getTotalAmount() 
		{
			return TotalAmount;
		}
		
		//business Logics
				/**
				 * @author vikas
				 */
		public void increaseProductByOne()
		{
			IncreaseProductButton.click();
		}
		public void flipkartModule()
		{
			FlipkartModule.click();
		}

}
