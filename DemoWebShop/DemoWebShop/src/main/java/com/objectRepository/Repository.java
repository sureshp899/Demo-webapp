package com.objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Repository {

	public WebDriver driver;

	
//Landing page
	
public 	By loginbutton = By.xpath("//a[text()='Log in']");
	
//Login page	
	public By welcomeMessage = By.xpath("//div[@class='page-title']/h1");
	public By email = By.xpath("//input[@name='Email']");
	public By pass = By.xpath("//input[@type='password']");
	public By signin = By.xpath("//input[@value='Log in']");
//Home page	
	public By useraccout = By.xpath("//a[text()='atest@gmail.com']");
	public By shoppingcartbutton = By.xpath("//span[text()='Shopping cart']");
	public By gotocart = By.xpath("//input[@value='Go to cart']");
//shop cart page	
	public By itemquantityfield = By.xpath("//input[@class='qty-input valid']");
	public By updateshopcart = By.xpath("//input[@name='updatecart']");
	
//catogiries page	
	public By catogiries = By.xpath("(//div[@class='title'])[1]");
	public By bookslink = By.xpath("(//a[contains(text(),'Books')])[3]");
//book items page	
	public By oneitem = By.xpath("(//a[contains(text(),'Computing and Internet')])[1]");
	public By bookprice = By.xpath("//span[@class='price-value-13']");
	public By Quantityfield = By.xpath("//input[@class='qty-input valid']");
	public By addcart = By.xpath("//input[@id='add-to-cart-button-13']");
	
	
	
	
	
	
	
	
	
	
	
}
