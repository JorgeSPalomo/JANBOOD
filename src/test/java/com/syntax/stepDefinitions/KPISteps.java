package com.syntax.stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.syntax.utils.BaseClass;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class KPISteps extends BaseClass {

	@Given("^I logged into OrangeHRM$")
	public void i_logged_into_OrangeHRM() throws Throwable {
		driver.findElement(By.cssSelector("input[name='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.cssSelector("input[name='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.cssSelector("input[type='submit']")).click();
	}

	@When("^I click Performance Module and click KPI$")
	public void i_click_Performance_Module_and_click_KPI() throws Throwable {
		driver.findElement(By.linkText("Performance")).click();
		driver.findElement(By.cssSelector("a[id='menu_performance_Configure']")).click();
		driver.findElement(By.cssSelector("a[id='menu_performance_searchKpi']")).click();
	}

	@When("^I click add$")
	public void i_click_add() throws Throwable {
		driver.findElement(By.cssSelector("input[name='btnAdd']")).click();
	}

	@When("^I Select Job Title$")
	public void i_Select_Job_Title() throws Throwable {
		driver.findElement(By.cssSelector("select[class='formSelect']")).click();

	}

	@When("^I Select IT Executive$")
	public void i_Select_IT_Executive() throws Throwable {
		driver.findElement(By.cssSelector("option[value='7']")).click();
	}

	@When("^Enter Key Performance indicator$")
	public void enter_Key_Performance_indicator() throws Throwable {
		driver.findElement(By.cssSelector("input[class='formInputText']"))
				.sendKeys("Jorge's Key Performance indicator");

	}

	@When("^Enter Minimum Rating$")
	public void enter_Minimum_Rating() throws Throwable {
		driver.findElement(By.cssSelector("input[id='defineKpi360_minRating']")).clear();
		driver.findElement(By.cssSelector("input[id='defineKpi360_minRating']")).sendKeys("7");
	}

	@When("^Enter Maximum Rating$")
	public void enter_Maximum_Rating() throws Throwable {
		driver.findElement(By.cssSelector("input[id='defineKpi360_maxRating']")).clear();
		driver.findElement(By.cssSelector("input[id='defineKpi360_maxRating']")).sendKeys("10");

	}

	@When("^Click Make Default Scale$")
	public void click_Make_Default_Scale() throws Throwable {
		driver.findElement(By.cssSelector("input[class='formCheckbox']")).click();

	}

	@When("^Click Save$")
	public void click_Save() throws Throwable {
		driver.findElement(By.cssSelector("input[class='addbutton']")).click();
	}

	@When("^Select Job Title from Search Key Performance that you chose$")
	public void select_Job_Title_from_Search_Key_Performance_that_you_chose() throws Throwable {
		WebElement drop = driver.findElement(By.cssSelector("select[class='formSelect']"));
		Select dd = new Select(drop);
		dd.selectByVisibleText("IT Executive");

	}

	@When("^click Search$")
	public void click_Search() throws Throwable {
		driver.findElement(By.cssSelector("input[name='searchBtn']")).click();
	}

	@Then("^Validate that Key Performance Indicator has been created$")
	public void validate_that_Key_Performance_Indicator_has_been_created() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^Delete created Key Performance Indicator$")
	public void delete_created_Key_Performance_Indicator() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^Validate that No Records Found$")
	public void validate_that_No_Records_Found() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^I click Performance Module and click Tracker under Configure$")
	public void i_click_Performance_Module_and_click_Tracker_under_Configure() throws Throwable {
		driver.findElement(By.linkText("Performance")).click();
		driver.findElement(By.cssSelector("a[id='menu_performance_Configure']")).click();
		driver.findElement(By.cssSelector("a[id='menu_performance_addPerformanceTracker']")).click();
	}

	@When("^Enter a Tracker Name$")
	public void enter_a_Tracker_Name() throws Throwable {
		driver.findElement(By.cssSelector("input[id='btnAdd']")).click();
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("Personal Tracker");

	}

	@When("^Enter a Default Employee$")
	public void enter_a_Default_Employee() throws Throwable {
		driver.findElement(By.cssSelector("input[name='addPerformanceTracker[employeeName][empName]']"))
				.sendKeys("Linda Anderson");
	}

	@When("^Click John Smith in Available Reviewers$")
	public void click_John_Smith_in_Available_Reviewers() throws Throwable {
		driver.findElement(By.cssSelector("//*[@id=\"addPerformanceTracker_availableEmp\"]/option[3]")).click();
	}

	@When("^Click Add to Assign Reviewers$")
	public void click_Add_to_Assign_Reviewers() throws Throwable {
		driver.findElement(By.cssSelector("input[value='Add >']")).click();

	}

	@When("^Click Save again$")
	public void click_Save_again() throws Throwable {
		driver.findElement(By.cssSelector("input[name='btnSave']")).click();
	}

	@Then("^Validate that Employee is created with Tracker$")
	public void validate_that_Employee_is_created_with_Tracker() throws Throwable {
		WebElement table = driver.findElement(By.cssSelector("table[class='table hover']"));

	}

	@Then("^Delete created Employee$")
	public void delete_created_Employee() throws Throwable {
		driver.findElement(By.cssSelector("input[type='checkbox']")).click();
	}

}
