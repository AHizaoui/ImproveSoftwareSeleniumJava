package com.improvefr.improvesoftware;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.awt.Scrollbar;
import java.awt.Window;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.swing.Scrollable;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.improvefr.improvesoftware.FooterPage;
import com.improvefr.improvesoftware.PageObject;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FooterTest {

	private WebDriver driver;
	private String baseUrl;
	ChromeOptions chromeOptions = new ChromeOptions();
	FooterPage Fp;
	PageObject Po;

//************************************ Setup ( Executed Before each Test) *********************************************

	@BeforeTest
	public void setUp() throws Exception {
		WebDriverManager.chromedriver().setup();
		chromeOptions.addArguments("--headless");
		driver = new ChromeDriver(chromeOptions);
		
		driver.get("https://improve-software.com/");
		driver.manage().window().maximize();
		Fp = new FooterPage(driver);
		Po = new PageObject(driver);
	}

//  ******************** test case : Click on Facebook icon and check that the fb page is opened with success  and the title is as required*******************	

	

//  ******************** test case : Click on LinkedIn icon   and check that the LinkedIn page is opened with success  and the title is as required*******************

	

//  ******************** test case : Click on Quick access links   and check that the each link  page is opened with success  and the URL is as required*******************

	

	@Test
	public void CheckSearch() {

		Fp.checkRECHERCHEWord();
		Fp.checkDefaultValueOfSearchBar();
		Fp.makeSearch();

	}

//	****************** test case : Click on down to top button and check that it's working well *****************

	@Test

	public void check_down_to_top_button() {

		Fp.clickOnDownToTopButton();

		assertTrue(Fp.getAdressInHeader().isDisplayed());
	}

//	******************** test case : Check that the content of NOS CONTACT in the footer is as required  *******************
	
	@Test
	public void check_nos_contact_content() {
		
		
        String nosContactWord = Fp.getNosContactField().getText();
        assertEquals("NOS CONTACTS", nosContactWord);
		String nosContactAddress = Fp.getNosContactAddress().getText() ;
		assertEquals("05 Avenue des chasseurs, 75017 Paris",nosContactAddress);
		String phoneNosContact = Fp.getNosContactPhone().getText();
		assertEquals("+33 1 86 61 01 37", phoneNosContact);
		
	
	}
	
	

	
//	**********************************  tear down browser ( Executed at the end of each Test) ****************************************************

	@AfterTest
	public void tear_down() {
		driver.quit();

	}
}
