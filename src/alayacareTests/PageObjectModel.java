package alayacareTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageObjectModel 
{

	static WebDriver dr;
	static WebElement element;
		
	public static WebElement myAcc(WebDriver dr)
	{
		element = dr.findElement(By.xpath("//ul[@class='nav navbar-nav navbar-right hidden-sm go-left']//li[@id='li_myaccount']//a[@class='dropdown-toggle go-text-right']"));
		return element;
	}
		public static WebElement loginButton(WebDriver dr)
	{
		element = dr.findElement(By.xpath("//ul[@class='nav navbar-nav navbar-right hidden-sm go-left']//ul[@class='nav navbar-nav navbar-side navbar-right sidebar go-left user_menu']//li[@id='li_myaccount']//ul[@class='dropdown-menu']//li//a[@class='go-text-right'][contains(text(),'Login')]"));
		return element;
	}
	public static WebElement email(WebDriver dr)
	{
		element = dr.findElement(By.xpath("//input[@placeholder='Email']"));
		return element;
	}
	public static WebElement password(WebDriver dr)
	{
		element = dr.findElement(By.xpath("//input[@placeholder='Password']"));
		return element;
	}
	public static WebElement LOGIN(WebDriver dr)
	{
		element = dr.findElement(By.xpath("//button[contains(text(),'Login')]"));
		return element;
	}
	public static WebElement logoutButton(WebDriver dr)
	{
		element = dr.findElement(By.xpath("/html[1]/body[1]/nav[1]/div[1]/div[2]/ul[2]/ul[1]/li[1]/a[1]"));
		return element;
	}
	public static WebElement LOGOUT(WebDriver dr)
	{
		element = dr.findElement(By.xpath("//li[@class='open']//ul[@class='dropdown-menu']//li//a[@class='go-text-right'][contains(text(),'Logout')]"));
		return element;
	}
	public static WebElement message(WebDriver dr)
	{
		element = dr.findElement(By.xpath("//div[@class='alert alert-danger']"));
		return element;
	}
	public static WebElement home(WebDriver dr)
	{
		element = dr.findElement(By.xpath("//a[@class='navbar-brand go-right']//img"));
		return element;
	}
	public static WebElement hotels(WebDriver dr)
	{
		element = dr.findElement(By.xpath("//span[contains(text(),'Hotels')]"));
		return element;
	}
	public static WebElement textin(WebDriver dr)
	{
		element = dr.findElement(By.xpath("//div[@id='s2id_autogen8']//a[@class='select2-choice']"));
		return element;
	}
	public static WebElement textin2(WebDriver dr)
	{
		element = dr.findElement(By.xpath("//div[@id='select2-drop']//input[@type='text']"));
		return element;
	}
	public static WebElement textin3(WebDriver dr)
	{
		element = dr.findElement(By.xpath("//div[@class='select2-drop select2-display-none select2-with-searchbox select2-drop-active']//ul[@class='select2-results']"));
		return element;
	}
	public static WebElement dropmask(WebDriver dr)
	{
		element = dr.findElement(By.xpath("//div[@id='select2-drop-mask']"));
		return element;
	}
	public static WebElement checkin(WebDriver dr)
	{
		element = dr.findElement(By.xpath("//*[@id=\"dpd1\"]/div/input"));
		return element;
	}
	public static WebElement checkout(WebDriver dr)
	{
		element = dr.findElement(By.xpath("//input[@placeholder='Check out']"));
		return element;
	}
	public static WebElement travellersinput(WebDriver dr)
	{
		element = dr.findElement(By.xpath("//input[@id='travellersInput']"));
		return element;
	}
	public static WebElement adultinput(WebDriver dr)
	{
		element = dr.findElement(By.xpath("//input[@id='adultInput']"));
		return element;
	}
	public static WebElement childinput(WebDriver dr)
	{
		element = dr.findElement(By.xpath("//input[@id='childInput']"));
		return element;
	}
	public static WebElement search(WebDriver dr)
	{
		element = dr.findElement(By.xpath("//form[contains(@name,'fCustomHotelSearch')]//i[contains(@class,'icon_set_1_icon-66')]"));
		return element;
	}
}
