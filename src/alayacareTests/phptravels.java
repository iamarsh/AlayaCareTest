package alayacareTests;
import alayacareTests.PageObjectModel;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class phptravels 
{

	public WebDriver dr;
	public String url;
		
							/* Please modify the location of your respective WebDriver directory. 
							 * I used Google Chrome for my Automation.
							 */
	
	@Before
	public void setup1() throws IOException{	
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium Files\\webdrivers\\chromedriver.exe");
	dr= new ChromeDriver();
	url= "https://www.phptravels.net/";	  
	dr.manage().window().maximize();
	dr.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
	}
	
	
	@Given("^the user has navigated to the login page$")
	public void the_user_has_navigated_to_the_login_page() throws Throwable {
	dr.get(url);
	Thread.sleep(2000L);
	}

	@When("^they provide the correct credentials$")
	public void they_provide_the_correct_credentials() throws Throwable {
	PageObjectModel.myAcc(dr).click();
	PageObjectModel.loginButton(dr).click();
	PageObjectModel.email(dr).sendKeys("user@phptravels.com");
	PageObjectModel.password(dr).sendKeys("demouser");
	Thread.sleep(1000L);
	}

	@Then("^the user is logged in$")
	public void the_user_is_logged_in() throws Throwable {
	PageObjectModel.LOGIN(dr).click();
	Thread.sleep(3000L);
	}

	@Then("^they will be directed to their account page$")
	public void they_will_be_directed_to_their_account_page() throws Throwable {
	PageObjectModel.logoutButton(dr).click();;
	PageObjectModel.LOGOUT(dr).click();
	Thread.sleep(3000L);
	}

	@When("^they provide the incorrect password for their account$")
	public void they_provide_the_incorrect_password_for_their_account() throws Throwable {
	PageObjectModel.myAcc(dr).click();
	PageObjectModel.loginButton(dr).click();
	PageObjectModel.email(dr).sendKeys("wrongID@phptravels.com");
	PageObjectModel.password(dr).sendKeys("wrongpassword");
	Thread.sleep(2000L);
	PageObjectModel.LOGIN(dr).click();
	}

	@Then("^an error will be provided stating 'Invalid Email or Password'$")
	public void an_error_will_be_provided_stating(String arg1) throws Throwable {
	Thread.sleep(3000L);
	String msg = PageObjectModel.message(dr).getText();
	System.out.println(msg);
	Thread.sleep(2000L);
	}
		
	@Given("^the user has logged-in$")
	public void the_user_has_logged_in() throws Throwable {
	dr.get(url);
	PageObjectModel.myAcc(dr).click();
	PageObjectModel.loginButton(dr).click();
	PageObjectModel.email(dr).sendKeys("user@phptravels.com");
	PageObjectModel.password(dr).sendKeys("demouser");
	Thread.sleep(1000L);
	PageObjectModel.LOGIN(dr).click();
	Thread.sleep(3000L);
	}
	
	@When("^the user has clicked Home to access the search page$")
	public void the_user_has_clicked_Home_to_access_the_search_page() throws Throwable {
	PageObjectModel.home(dr).click();
	Thread.sleep(1000L);
	}
	
	@When("^they have chosen the Hotels option$")
	public void they_have_chosen_the_Hotels_option() throws Throwable {
	PageObjectModel.hotels(dr).click();
	}
	
	@When("^they have chosen a hotel for \"([^\"]*)\"$")
	public void they_have_chosen_a_hotel_for(String city) throws Throwable {
	PageObjectModel.textin(dr).click();
	Thread.sleep(500L);
	PageObjectModel.textin2(dr).sendKeys(city);
	Thread.sleep(1000L);
	PageObjectModel.textin3(dr).click();
	}
	
	@When("^they have chosen \"([^\"]*)\" for checkin$")
	public void they_have_chosen_for_checkin(String checkin) throws Throwable {
	WebDriverWait wait = new WebDriverWait(dr, 3);
	boolean invisible = wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@id='select2-drop-mask']")));
	if(invisible){
		PageObjectModel.checkin(dr).click();
		PageObjectModel.checkin(dr).sendKeys(checkin);
		}
	}
	
	@When("^they have chosen \"([^\"]*)\" for checkout$")
	public void they_have_chosen_for_checkout(String checkout) throws Throwable {
	Thread.sleep(1000L);
	PageObjectModel.checkout(dr).click();
	PageObjectModel.checkout(dr).sendKeys(checkout);
	}

	@When("^they have selected \"([^\"]*)\" for adults$")
	public void they_have_selected_for_adults(String adults) throws Throwable {
	PageObjectModel.travellersinput(dr).click();
	Thread.sleep(1000L);
	PageObjectModel.adultinput(dr).clear();
	PageObjectModel.adultinput(dr).sendKeys(adults);
	}
	
	@When("^they have chosen \"([^\"]*)\" for children$")
	public void they_have_chosen_for_children(String children) throws Throwable {
	PageObjectModel.childinput(dr).clear();
	PageObjectModel.childinput(dr).sendKeys(children);
	}
	
	@When("^they click search$")
	public void they_click_search() throws Throwable {
	Thread.sleep(1000L);
	PageObjectModel.search(dr).click();
	}
		
	@Then("^matching results are displayed$")
	public void matching_results_are_displayed() throws Throwable {
	Thread.sleep(3000L);
	}
			
	@After()
	public void cleanup1() {
	dr.close();
	dr.quit();
	}

}
