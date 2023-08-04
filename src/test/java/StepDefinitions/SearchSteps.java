package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchSteps {
	WebDriver driver;
	WebElement searchInput;

	@Given("open browser")
	public void open_browser() {
		System.out.println("inside step 1 - open browser");
		System.setProperty("webdriver.firefox.driver",
				"C:\\Users\\jsant\\eclipse-workspace\\CumberJava\\src\\test\\resources\\drivers\\chromedriver.exe");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(1));

	}

	@Given("then open macys.com")
	public void then_open_macys_com() {
		System.out.println("inside step 3- then open macys.com");
		driver.get("https://www.macys.com/");
	}

	@When("user enters text in the search box")
	public void user_enters_text_in_the_search_box() {
		System.out.println("step 4- user enters text in the search box");
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(1));
		searchInput = driver.findElement(By.id("globalSearchInputField"));
		searchInput.sendKeys("women clothes");

	}

	@When("hits enter")
	public void hits_enter() {
		System.out.println("inside step 3- hits enter");
		searchInput.sendKeys(Keys.ENTER);

	}

	@Then("should get the text in the search results")
	public void he_should_the_typed_text_in_the_search_results() {
		System.out.println("inside step 4- should type the text in the search results ");
		driver.getPageSource().contains("We found  items you might like for womens clothes");
		// WebElement message = driver.findElement(By.id("resultsFoundMessage"));

	}

}
