package com.improvefr.improvesoftware;

import java.util.Iterator;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.log.Log;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageObject {
	
		//Setting Variables 
		WebDriverWait wait;
		private WebDriver driver;
	    Logger log;

	    public PageObject(WebDriver driver){
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	        
	        log = Logger.getLogger(Log.class.getName());

	        log.setLevel(Level.INFO);
	    }
	    
		public WebElement findElement(String xpath)
		
			{
					
			 return  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
					
			}
		
	
	public void scrollInToPage (WebDriver driver) {
		 JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
	}

	public void scrollToElement (WebDriver driver , WebElement element) {
	
		 ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", element);
		
	}
	
	public String MessageEnvoyer(WebElement Message ){
	WebDriverWait wait = new WebDriverWait(driver,30);
	wait.until(ExpectedConditions.visibilityOf(Message));
	return  Message.getText();
	}
	public void move_to_next_window() {
		
		Set<String> s = driver.getWindowHandles();
		Iterator<String> iterator = s.iterator();
		while (iterator.hasNext()) {
			String child = iterator.next();
			driver.switchTo().window(child);
			String title = driver.getTitle();
			log.info("web site page with title : [" + title + "] is opened successfuly");
		}
}}
