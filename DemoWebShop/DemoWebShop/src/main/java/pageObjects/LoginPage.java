package pageObjects;

import java.awt.Desktop.Action;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.objectRepository.Repository;


import commonfunctions.baseclass;

public class LoginPage extends baseclass {
	Actions action;
	Select select;
	
	
	public void palcetheOrder() throws IOException {
		
		  System.out.println("User landing into the home page");
		  driver.findElement(By.xpath(objrepository.getProperty("loginbutton"))).click();
		  
		  String welcomeMessag=driver.findElement(By.xpath(objrepository.getProperty("welcomeMessageText"))).getText();
		  
		  String expectedMessage = "Welcome, Please Sign In!";
		  
		  Assert.assertEquals(welcomeMessag, expectedMessage);
		  
		  System.out.println("Successfully validated the Welcome, Please Sign In ");
		  
		  driver.findElement(By.xpath(objrepository.getProperty("emailButton"))).sendKeys(prop.getProperty("username"));
		  
		  driver.findElement(By.xpath(objrepository.getProperty("passwordButton"))).click();
		  
		  driver.findElement(By.xpath(objrepository.getProperty("passwordButton"))).sendKeys(prop.getProperty("password"));
		  
		  driver.findElement(By.xpath(objrepository.getProperty("signinButton"))).click();
		  
		  String userAccount=driver.findElement(By.xpath(objrepository.getProperty("useraccout"))).getText(); 
		  
		  Assert.assertEquals(userAccount, prop.getProperty("username"));
		  
		  System.out.println("Successfully validated the UserName ");
		  
		  String cartQuantity=driver.findElement(By.xpath(objrepository.getProperty("selectedProductCountText"))).getText(); 
		  
		  String totalQuantity=cartQuantity.replaceAll("[()]",""); 
		  
		  int count= Integer.parseInt(totalQuantity);
		  
		  if(count > 0) {
		  
		  action=new Actions(driver);
		  
		  action.moveToElement(driver.findElement(By.xpath(objrepository.getProperty("selectedProductCountText")))).build().perform();
		  
		  driver.findElement(By.xpath(objrepository.getProperty("gotoCartButton"))).click();
		  
		  driver.findElement(By.xpath(objrepository.getProperty("itemQuantityTextBox"))).clear();
		  
		  driver.findElement(By.xpath(objrepository.getProperty("itemQuantityTextBox"))).sendKeys("0");
		  
		  driver.findElement(By.xpath(objrepository.getProperty("updateCartButton"))).click();
		  
		  System.out.println("Successfully Clear the cart history");
		  
		  driver.navigate().to("http://demowebshop.tricentis.com/"); 
		  }
		  
		  
		  
	
		  String catogiries =driver.findElement(By.xpath(objrepository.getProperty("catogiriesText"))).getText(); 
		  
		  if(catogiries.equals(prop.getProperty("catogiries"))) {
		  
		  driver.findElement(By.xpath(objrepository.getProperty("booksLink"))).click();
		  
		  System.out.println("Successfully selected the books from the catogiries");
		  
		  }
		  
		  driver.findElement(By.xpath(objrepository.getProperty("bookItemLink"))).click();
		  
		  String productPrice=driver.findElement(By.xpath(objrepository.getProperty("bookpriceText"))).getText();
		  
		  System.out.println(" The selected itemProduct price "+productPrice);
		  
		  driver.findElement(By.xpath(objrepository.getProperty("quantityfieldTextBox"))).clear();
		  
		  driver.findElement(By.xpath(objrepository.getProperty("quantityfieldTextBox"))).sendKeys("2");
		  
		  driver.findElement(By.xpath(objrepository.getProperty("addToCardButton"))).click();
		  
		  System.out.println("Successfully added the morethen one product into the cart");
		  
		  String afterAddingProductintoCartSuccessMessage=driver.findElement(By.xpath(objrepository.getProperty("afterAddingTheItamIntoCartSuccessVerificationText"))).getText();
		  
		  System.out.println(afterAddingProductintoCartSuccessMessage);
		  
		  action=new Actions(driver);
		  
		  action.moveToElement(driver.findElement(By.xpath(objrepository.getProperty("shoppingcartquantity")))).build().perform();
		  
		  String subTotalPrice=driver.findElement(By.xpath(objrepository.getProperty("subTotalPriceText"))).getText(); 
		  
		  System.out.println("Successfully validated the Sub-total price :"+subTotalPrice);
		  
		  driver.findElement(By.xpath(objrepository.getProperty("gotoCartButton"))).click();
		 
		 driver.findElement(By.xpath(objrepository.getProperty("termsandserviceChekBox"))).click();
		 
		 driver.findElement(By.xpath(objrepository.getProperty("checkoutButton"))).click();
		  
		 select=new Select(driver.findElement(By.xpath(objrepository.getProperty("billingAddres"))));
		  
		 select.selectByIndex(2);
		 
		 driver.findElement(By.xpath(objrepository.getProperty("billingAddresContinueButton"))).click();
		 
		 select=new Select(driver.findElement(By.xpath(objrepository.getProperty("shippingAddress"))));
		  
		 select.selectByIndex(2);
		 
		 driver.findElement(By.xpath(objrepository.getProperty("shippingAddressContinueButton"))).click();
		 
		 driver.findElement(By.xpath(objrepository.getProperty("shippingOptionRadioButton"))).click();
		 
		 driver.findElement(By.xpath(objrepository.getProperty("shippingmethodContinueButton"))).click();
		 
         driver.findElement(By.xpath(objrepository.getProperty("paymentMethodRadioButton"))).click();
		 
		 driver.findElement(By.xpath(objrepository.getProperty("paymentMethodContinue"))).click();
		 
		 String paymentMethodType = driver.findElement(By.xpath(objrepository.getProperty("YouwillpaybyCODText"))).getText();
		 
		 System.out.println( "Successfully validated the paymentMethodType"+paymentMethodType);
		 
		 driver.findElement(By.xpath(objrepository.getProperty("paymentinfoContinueButton"))).click();
		 
		 driver.findElement(By.xpath(objrepository.getProperty("confirmButton"))).click();
		 
        String confirmordermessage = driver.findElement(By.xpath(objrepository.getProperty("confirmorderMessageText"))).getText();
		 
		 System.out.println("Successfully validated the confirm order message"+confirmordermessage);
		 
        String ordernumber = driver.findElement(By.xpath(objrepository.getProperty("orderNumberText"))).getText();
		 
		 System.out.println("Successfully validated the confirm order Number "+ordernumber);
		 
         driver.findElement(By.xpath(objrepository.getProperty("orderContinueButton"))).click();
         
         System.out.println("User order the Product Successfully");
		 
		 driver.findElement(By.xpath(objrepository.getProperty("logoutButton"))).click();
		 
		 System.out.println(" User logout from the appliction Successfully ");
		 
	}

}

