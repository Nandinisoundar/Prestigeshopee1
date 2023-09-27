package com.PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Product_Selector {

	public WebDriver driver;

	@FindBy(xpath = "(//a[text()='Pressure Cookers'])[1]")
	private WebElement pressCoke;

	@FindBy(xpath = "(//span[text()='Aluminum'])[1]")
	private WebElement aluminum;

	@FindBy(xpath = "//div[contains(text(),'5 L')]")
	private WebElement litre;

	@FindBy(xpath = "//a[contains(text(),'PRESTI')][1]")
	private WebElement cookerClick;

	@FindBy(xpath = "//a[@class='action showcart']")
	private WebElement showcart;

	@FindBy(xpath = "//button[@id='top-cart-btn-checkout']")
	private WebElement proceedtocheck;

	public WebElement getProceedtocheck() {
		return proceedtocheck;
	}

	public WebElement getShowcart() {
		return showcart;
	}

	@FindBy(id = "product-addtocart-button")
	private WebElement addtoCart;

	public WebElement getAddtoCart() {
		return addtoCart;
	}

	public WebElement getLitre() {
		return litre;
	}

	public WebElement getCookerClick() {
		return cookerClick;
	}

	public WebElement getPressCoke() {
		return pressCoke;
	}

	public WebElement getAluminum() {
		return aluminum;
	}

	public Product_Selector(WebDriver dri) {
		driver = dri;
		PageFactory.initElements(driver, this);

	}

}
