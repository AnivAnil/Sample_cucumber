package org.test;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseMethod {
	public static WebDriver driver;
public static WebDriver browserlauch(String bname) {
	if (bname.equalsIgnoreCase("chrome")) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
	else if(bname.equalsIgnoreCase("edge")) {
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
	}
	else if(bname.equalsIgnoreCase("firefox")) {
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
	}
	driver.manage().window().maximize();
	return driver;

}
	public static void geturl(String a) {
	driver.get(a);
	}
	
	public static void SendKeys(WebElement e ,String a) {
		e.sendKeys(a);
	}
	 
	public static String getcurrenturl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
		
	}
	public static  String attribute(WebElement e) {
		String attribute = e.getAttribute("value");
		return attribute;

	}
	
	public static void click(WebElement e) {
		e.click();
	}
	
	public static void quit() {
		driver.quit();
	}
	
	public static void implicitywait(int a){
		driver.manage().timeouts().implicitlyWait(a,TimeUnit.SECONDS);
		
	}
	public static void moveToElement(WebElement b) {
		Actions a=new Actions(driver);
		a.moveToElement(b).perform();
	}
	
	
	public static void Alert() {
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
		
	}
	public static void switchtowindow(int a) {
		Set<String> windowHandles = driver.getWindowHandles();
		List<String>l=new LinkedList<String>();
		l.addAll(windowHandles);
		driver.switchTo().window(l.get(a));
	}
	 
	public static void drgandrop(WebElement b , WebElement c) {
		Actions a=new Actions(driver);
		a.dragAndDrop(b, c).perform();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
