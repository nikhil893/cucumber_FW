package com.VIP.Runner.stepdefs;

import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.After;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class StepDefs {

    String URL = "https://amazon.in";

    WebDriver driver;

    @Given("User opened the Browser")
    public void user_opened_the_browser() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        driver.manage().window().maximize();

    }


    @When("User navigated to the app URL")
    public void user_navigated_to_the_app_url() {
        driver.get(URL);
    }

    @Then("User is able to see application landing page")
    public void user_is_able_to_see_application_landing_page() {
        //assertions
        String titleExpected = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
        String titleActual = driver.getTitle();
        Assert.assertEquals(titleExpected,titleActual);

    }

    @Given("User opened the browser and navigate to the app URL")
    public void user_opened_the_browser_and_navigate_to_the_app_url() {
        user_opened_the_browser_and_navigate_to_the_app_url();

    }

    @When("User search for a new product")
    public void user_search_for_a_new_product() {
        driver.findElement(By.id("nikhilbhure")).sendKeys("gents bags");

    }
    @Then("Search result for the product is displayed")
    public void search_result_for_the_product_is_displayed() {
        String VarietiesExpected = "";
        String ActualVareties = driver.getTitle();
        Assert.assertEquals(VarietiesExpected,ActualVareties);

    }
     String url = "https://www.google.com";

    WebDriver driver1 = new ChromeDriver();

    @Given("i am on the google search page")
    public void i_am_on_the_google_search_page() {
        driver1.get(url);

    }

    @When("I search for {string}")
    public void i_search_for(String string) {
        driver1.findElement(By.id("nikhil bhure")).sendKeys("cheese");

    }
    @Then("the page tile should start with {string}")
    public void the_page_tile_should_start_with(String string) {
        // Wait for the page to load timeout after ten seconds
        new WebDriverWait(driver1,20L).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                String titleStartsWith = "";
                return d.getTitle().toLowerCase(Locale.ROOT).startsWith(titleStartsWith);
            }
        });

    }
      @After
    public void closeBrowser(){
        driver1.quit();
      }
