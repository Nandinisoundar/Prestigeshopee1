package com.PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class UserData {

	public WebDriver driver;
	
	public  void user_data()
	{
	WebElement mobile=driver.findElement(By.xpath("//input[@id=\"customer_mobiles\"]"));
	mobile.sendKeys("8015442705");
		WebElement firstname=driver.findElement(By.xpath("//input[@name='firstname']"));
		firstname.sendKeys("nandini");
		WebElement lastname=driver.findElement(By.xpath("//input[@name='lastname']"));
		lastname.sendKeys("venkateshwaran");
		WebElement email=driver.findElement(By.xpath("//input[@name='custom_attributes[email]']"));
		email.sendKeys("abc@gmail.com");
		WebElement company=driver.findElement(By.xpath("//input[@name='company']"));
		company.sendKeys("kkntech");
		WebElement street=driver.findElement(By.xpath("//input[@name='street[0]']"));
		 street.sendKeys("jjnagar");
		WebElement region =driver.findElement(By.xpath("//select[@name='region_id']"));
		region.sendKeys("Tamilnadu");
		WebElement Telephone =driver.findElement(By.xpath("//input[@name='telephone'][1]"));
		Telephone .sendKeys("044-928374");
		WebElement country=driver.findElement(By.xpath("//select[@name='country_id'][1]"));
		country.sendKeys("India");
		WebElement customer_mobile=driver.findElement(By.xpath("//input[@name='custom_attributes[customer_mobile]']"));
		customer_mobile.sendKeys("8015442705");
	}
		public UserData(WebDriver dri) {
		driver = dri;
		PageFactory.initElements(driver, this);

	}
}
