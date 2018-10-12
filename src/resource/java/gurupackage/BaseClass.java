package gurupackage;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class BaseClass {
	static WebDriver driver;
	@Given("^The user is in Guru login page$")
	public void the_user_is_in_Guru_login_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\JavaSeleniumTraning\\JavaTraining\\CucumberProject\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/V4/");	
	}

	@When("^The user enters username & password$")
	public void the_user_enters_username_password() {
		driver.findElement(By.name("uid")).sendKeys("mngr157328");
		   driver.findElement(By.name("password")).sendKeys("zYqetAm");
		   driver.findElement(By.name("btnLogin")).click();
	}

	@Then("^The user should be logged in$")
	public void the_user_should_be_logged_in() {
		Assert.assertEquals("Welcome To Manager's Page of Guru99 Bank", driver.findElement(By.xpath("//marquee[contains(text(),Welcome)]")).getText());
	}
	@Given("^The user is in add new customer$")
	public void the_user_is_in_add_new_customer() {
		System.setProperty("webdriver.chrome.driver", "C:\\JavaSeleniumTraning\\JavaTraining\\CucumberProject\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/V4/manager/addcustomerpage.php");
	}

	@When("^the user enter the details$")
	public void the_user_enter_the_details(DataTable credentials) {
		List<String> credentialslist = credentials.asList(String.class);
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys(credentialslist.get(0));
		driver.findElement(By.xpath("//input[@name='rad1'][2]")).click();
		driver.findElement(By.xpath("//input[@id='dob']")).sendKeys(credentialslist.get(8));
		driver.findElement(By.xpath("//textarea[@name='addr']")).sendKeys(credentialslist.get(1));
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys(credentialslist.get(2));
		driver.findElement(By.xpath("//input[@name='state']")).sendKeys(credentialslist.get(3));
		driver.findElement(By.xpath("//input[@name='pinno']")).sendKeys(credentialslist.get(4));
		driver.findElement(By.xpath("//input[@name='telephoneno']")).sendKeys(credentialslist.get(5));
		driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys(credentialslist.get(6));
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(credentialslist.get(7));
		
	}

	@When("^the user click the submit button$")
	public void the_user_click_the_submit_button() {
		driver.findElement(By.xpath("//input[@name='sub']")).click();
	}

	@Then("^The user should see the success message$")
	public void the_user_should_see_the_success_message() {
		Assert.assertEquals("Customer Registered Successfully!!!", driver.findElement(By.xpath("//p[@class='heading3']")).getText());
	}

	@Given("^The user is in login page$")
	public void the_user_is_in_login_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\JavaSeleniumTraning\\JavaTraining\\CucumberProject\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/V4/");
	}

	@When("^The user enter username\"([^\"]*)\",password\"([^\"]*)\"$")
	public void the_user_enter_username_password(String username, String password) {
	   driver.findElement(By.name("uid")).sendKeys(username);
	   driver.findElement(By.name("password")).sendKeys(password);
	   
	}

	@When("^The user click reset button$")
	public void the_user_click_reset_button() {
		driver.findElement(By.name("btnReset")).click();
	}

	@Then("^The fields should be empty$")
	public void the_fields_should_be_empty() {
		Assert.assertEquals(driver.findElement(By.name("uid")).getAttribute("value"),"");
	}


}
