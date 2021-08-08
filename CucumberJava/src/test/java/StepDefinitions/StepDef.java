package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDef {

	WebDriver driver=null;

	@Given("user is on home page")
	public void user_is_on_home_page() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Inside Step : user is on login page");
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Inside Step : user enters username and password");
	}

	@And("clicks on login button")
	public void clicks_on_login_button() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Inside Step : clicks on login button");
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Inside Step : user is navigated to the home page");
	}

	@Given("browser is open")
	public void browser_is_open() {
		// Write code here that turns the phrase above into concrete actions
		
		System.out.println("Inside Step : browser is open");
		String projectPath = System.getProperty("user.dir");
		System.out.println(projectPath);
		System.setProperty("webdriver.chrome.driver",
				projectPath+"/src/test/resources/Drivers/chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
	}

	@Given("user is on google search page")
	public void user_is_on_google_search_page() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Inside Step : user is on google search page");
		driver.navigate().to("https://google.com");
	}

	@When("user enters text in search box")
	public void user_enters_text_in_search_box() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Inside Step : user enters text in search box");
		driver.findElement(By.name("q")).sendKeys("Automation Step by Step");
	}

	@When("hits enter")
	public void hits_enter() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Inside Step : hits enter");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		Thread.sleep(5000);
	}

	@Then("user is navigated to search results")
	public void user_is_navigated_to_search_results() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Inside Step : user is navigated to search results");
		driver.getPageSource().contains("Online Courses");
		driver.quit();
	}
}
