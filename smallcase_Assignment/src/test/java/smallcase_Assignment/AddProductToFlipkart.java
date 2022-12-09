package smallcase_Assignment;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver.WindowType;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import genericUtility.BaseClass;
import genericUtility.Excel_Utility;
import genericUtility.Java_Utility;
import genericUtility.WebDriver_Utility;
import objectRepository.FlipkartHomePage;
import objectRepository.ProductCartPage;
import objectRepository.ProductListPage;
import objectRepository.ProductPage;

@Listeners(genericUtility.ListnerImplementationClass.class)

public class AddProductToFlipkart extends BaseClass
{
	@Test(groups= {"smokeTest","regressionTest"})
	public void addProduct() throws Throwable 
{
//   Java_Utility jlib=new Java_Utility();
     Excel_Utility elib=new Excel_Utility();
     WebDriver_Utility wlib=new WebDriver_Utility();
     driver.manage().window().maximize();
     wlib.waitForPageToLoad(driver);
     
     // Search for product(fectching iphone from excel sheet)
     String productName=elib.getDataFromExcel("Sheet1",1,0);
     FlipkartHomePage flipkarthomepage=new FlipkartHomePage(driver);
     flipkarthomepage.searchTextField(productName);
     flipkarthomepage.searchButton();
     
     
     //Clicking  on the First Item from the list.
     ProductListPage productlistpage=new ProductListPage(driver);
     productlistpage.productLink();
     
     //Switching Windows Tab
     wlib.switchToWindow(driver, "MOBGC9VGPXQNTXDW&lid");
     
     ProductPage productpage=new ProductPage(driver);
     WebElement productPrice = productpage.getProductPrice();
     
     // Printing price of the item
     System.out.println("Price of the item is :"+" "+productPrice.getText());
     
     // Adding Product to cart
     productpage.addToCart();
     Thread.sleep(2000);
     //navigating back
     driver.navigate().back();
     //clicking on cartbutton from flipkart home page
     flipkarthomepage.cartButton();
     ProductCartPage productcartpage=new ProductCartPage(driver);
     productcartpage.flipkartModule();
     // Increasing Quantity by 1.
     productcartpage.increaseProductByOne();
     // Price after addition of Quantity
     WebElement TotalPrice = productcartpage.getTotalAmount();
     System.out.println("Total Price of item after addition of Quantity"+" "+TotalPrice.getText());
     driver.quit();
   

	   

}
}
