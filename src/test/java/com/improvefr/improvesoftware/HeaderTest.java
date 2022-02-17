package com.improvefr.improvesoftware;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeaderTest {


	private WebDriver driver;
	private String baseUrl="https://improve-software.com/";
	private HeaderPO HeaderPO ;
	ChromeOptions chromeOptions = new ChromeOptions();
	@Before
	public void setUp() throws Exception {

		WebDriverManager.chromedriver().setup();
		chromeOptions.addArguments("--headless");
		driver = new ChromeDriver(chromeOptions);
		driver.get(baseUrl);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		HeaderPO = new HeaderPO(driver);
	}
	
	@After
	public void tearDown() throws InterruptedException   {		
		driver.quit();		
	}
	
	@Test
	/*  Test pour vérifier l'existence des numéros et d'addresse dans le header */
	public void testNumEtAddress () {
		HeaderPO.log.info("Les numeros sont " + HeaderPO.getNumerosTelephones().getText());
		HeaderPO.log.info("L'adresse est " + HeaderPO.getAdresse().getText());
		assertEquals("+33 1 86 61 01 37, +33 9 70 40 56 65",HeaderPO.getNumerosTelephones().getText()); // Vérifier l'existence des numéros
		HeaderPO.log.info("Vérification des numero OK ");
		assertEquals("05 Avenue des chasseurs Paris 75017, France",HeaderPO.getAdresse().getText()); // Vérifier l'existence d'adresse Postal
		HeaderPO.log.info("Vérification addresse OK ");
	}		
	/*  Test pour vérifier l'ouverture  des réseaux sociaux depuis le header et verifier les titres  */
		
	@Test
	public void ChoixDeLangueAnglaise () throws Exception   {
		Actions actionProvider = new Actions(driver);
		actionProvider.moveToElement(HeaderPO.getLangue()).perform(); //.build().perform(); // Mouvement vers le choix de langue
		HeaderPO.getLangue_anglais().click(); // Choisir l'Anglais	
		HeaderPO.log.info(HeaderPO.getLien_about_us().getText());
		assertEquals("About us",HeaderPO.getLien_about_us().getText()); // Vérifier le changement de la langue	
	}
	




}
