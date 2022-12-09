package smallcase_Assignment;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericUtility.BaseClass;
import genericUtility.Excel_Utility;
import genericUtility.Property_Utility;
import genericUtility.WebDriver_Utility;
import objectRepository.AmazonHomePage;
import objectRepository.AmazonProductListPage;
import objectRepository.AmazonProductPage;
import objectRepository.FlipkartHomePage;
import objectRepository.ProductListPage;
import objectRepository.ProductPage;
@Listeners(genericUtility.ListnerImplementationClass.class)

public class AddProductToFlipkartAndAmazon extends BaseClass
{

	@Test(groups= {"smokeTest","regressionTest"})
	public void addProduct() throws Throwable 
{
//   Java_Utility jlib=new Java_Utility();
     Excel_Utility elib=new Excel_Utility();
     Property_Utility plib=new Property_Utility();
     WebDriver_Utility wlib=new WebDriver_Utility();
     driver.manage().window().maximize();
     wlib.waitForPageToLoad(driver);
     
     // Search for product(fectching iphone from excel sheet)
     String productName1=elib.getDataFromExcel("Sheet1",2,0);
     FlipkartHomePage flipkarthomepage=new FlipkartHomePage(driver);
     flipkarthomepage.searchTextField(productName1);
     flipkarthomepage.searchButton();
     
     
     //Clicking  on the First Item from the list.
     ProductListPage productlistpage=new ProductListPage(driver);
     productlistpage.productLink();
     
     //Switching Windows Tab
     wlib.switchToWindow(driver, "MOBGC9VGPXQNTXDW&lid");
     
     Thread.sleep(3000);
     ProductPage productpage=new ProductPage(driver);
     WebElement productPrice1 = productpage.getProductPrice();
     
     // Printing price of the item
     System.out.println("Price of the item in Flipkart is"+" "+productPrice1.getText());
     
     // going to amazon
     String Url2 = plib.getPropertyKeyValue("url2");
     driver.get(Url2);
     
     
     // Search for product(fectching iphone from excel sheet)
     String productName2=elib.getDataFromExcel("Sheet1",3,0);
     AmazonHomePage amazonhomepage=new AmazonHomePage(driver);
     amazonhomepage.searchTextField(productName2);
     amazonhomepage.searchButton();
     
     //Clicking  on the First Item from the list.
     AmazonProductListPage amazonproductlistpage=new AmazonProductListPage(driver);
     amazonproductlistpage.productLink();
     
     
     //Switching Windows Tab
     wlib.switchToWindow(driver, "1TM908X9QLJ9X&keywords");
     
     AmazonProductPage amazonproductpage=new AmazonProductPage(driver);
     WebElement productPrice2 = amazonproductpage.getProductPrice();
     
     // Printing price of the item
     System.out.println("Price of the item in amazon is is"+" "+productPrice2.getText());
     if(productPrice2==productPrice1)
     {
    	 System.out.println("Prices are same on both the applications");
     }
     else
     {
    	 System.out.println("Prices are different on both the applications");
     }
     driver.quit();
     
}
}
