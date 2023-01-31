package com.stepdefinition;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {
	
	WebDriver driver = new ChromeDriver();
	@Given("User should be in adactinhotel page")
	public void user_should_be_in_adactinhotel_page() {
		driver.get("http://adactinhotelapp.com");
		driver.manage().window().maximize();
	}

	@When("User should enter the Username and password")
	public void user_should_enter_the_Username_and_password() {
		driver.findElement(By.id("username")).sendKeys("suriyaDs");
	    driver.findElement(By.id("password")).sendKeys("M5PT33");
	}

	@When("User should select the login button")
	public void user_should_select_the_login_button() {
	    driver.findElement(By.id("login")).click();
	}
	
	@When("User should select the location")
	public void user_should_select_the_location() {
	    WebElement findElement = driver.findElement(By.id("location"));
	    Select select = new Select(findElement);
	    select.selectByIndex(2);
	}

	@When("User should select the Hotel")
	public void user_should_select_the_Hotel() {
	    
	}

	@When("User sholud select the room type according to his need")
	public void user_sholud_select_the_room_type_according_to_his_need() {
	    
	}

	@Then("User should verify login is success or not")
	public void user_should_verify_login_is_success_or_not() throws InterruptedException {
		Thread.sleep(4000);
	    driver.close();
		System.out.println("Done.......");
	}

}
