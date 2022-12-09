package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonProductListPage
{
	//Initialization
			public  AmazonProductListPage(WebDriver driver)
			{
				PageFactory.initElements(driver,this);
			}
			//declaration
			@FindBy(xpath="(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")
			private WebElement ProductLink;
			
			

			//Getters Method
			public WebElement getProductLink() 
			{
				return ProductLink;
			}
			
			//business Logics
			/**
			 * @author vikas
			 */
			public void productLink()
			{
				ProductLink.click();
			}
			

}
