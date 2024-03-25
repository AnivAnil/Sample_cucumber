package org.test;

import static org.junit.Assert.assertTrue;

import java.sql.DriverManager;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.GetCurrentUrl;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage extends BaseMethod{
	PageFact p;

	@Given("user shoud be in poshmark")
	public void user_shoud_be_in_poshmark() {
		browserlauch("chrome");
		implicitywait(20);
	}

	@When("user shoud click continue with google")
	public void user_shoud_click_continue_with_google() {
		geturl("https://poshmark.com.au/");
		 p=new PageFact();
		 click(p.getFacebook()); 	
	}
	
	@When("user shoud click next button")
	public void user_shoud_click_next_button() {
		switchtowindow(1);
		SendKeys(p.getUser(), "9514391536");
		 SendKeys(p.getPass(), "anivnivetha");
		 click(p.getLogin());

	}

	@Then("user shoud be in login page")
	public void user_shoud_be_in_login_page() {
		Assert.assertTrue("veryfy url",getcurrenturl().contains("poshmark"));
		quit();
     
	}

}
