package gurupackage;

import java.util.Map;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class AddCustomer {
	static WebDriver driver;
	@Given("^The user is in guru login page$")
	public void the_user_is_in_guru_login_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\JavaSeleniumTraning\\JavaTraining\\CucumberProject\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/V4/");
		}

	@Given("^the user logged in as manager with credentails$")
	public void the_user_logged_in_as_manager_with_credentails(DataTable credentials) {
		Map<String, String> credentialslist = credentials.asMap(String.class,String.class);
		   driver.findElement(By.name("uid")).sendKeys(credentialslist.get("username"));
		   driver.findElement(By.name("password")).sendKeys(credentialslist.get("password"));
		   driver.findElement(By.name("btnLogin")).click();
		   
		   }
	
	@Given("^the user navigator to new customer$")
	public void the_user_navigator_to_new_customer() {
		driver.findElement(By.xpath("//a[text()='New Customer']")).click();
	}

	@When("^The user enters the customer details \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void the_user_enters_the_customer_details(String custname, String Gender, String Dob, String Address, String city, String state, String pin, String phoneno, String email, String password) {
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys(custname);
		driver.findElement(By.xpath("//input[@name='rad1'][2]")).click();
		driver.findElement(By.xpath("//input[@id='dob']")).sendKeys(Dob);
		driver.findElement(By.xpath("//textarea[@name='addr']")).sendKeys(Address);
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys(city);
		driver.findElement(By.xpath("//input[@name='state']")).sendKeys(state);
		driver.findElement(By.xpath("//input[@name='pinno']")).sendKeys(pin);
		driver.findElement(By.xpath("//input[@name='telephoneno']")).sendKeys(phoneno);
		driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
	}

	@When("^The user click reset  button$")
	public void the_user_click_reset_button() {
		driver.findElement(By.name("res")).click();
	}

	@Then("^The fields should in add customer page$")
	public void the_fields_should_in_add_customer_page() {
	    String out=driver.findElement(By.xpath("//p[@class='heading3']")).getText();
	    Assert.assertEquals("Add New Customer",out);
	    Assert.assertTrue(driver.getCurrentUrl().contains("addcustomerpage"));
	}


}
