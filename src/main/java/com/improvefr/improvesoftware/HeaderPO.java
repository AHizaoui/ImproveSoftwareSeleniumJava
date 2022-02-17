package com.improvefr.improvesoftware;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HeaderPO extends PageObject {
	public HeaderPO(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//div[@class='top_bar_phone']")
	private WebElement numerosTelephones;
	
	@FindBy(xpath="//div[@class='top_bar_address']")
	private WebElement adresse;
	
	@FindBy(xpath="//a[@title='facebook']")
	private WebElement lien_facebook;
	
	@FindBy(xpath="//a[@title='linkedin']")
	private WebElement lien_linkedin;

	@FindBy(xpath="//a[@class='trp-floater-ls-disabled-language trp-ls-disabled-language']")
	private WebElement langue;
		
	@FindBy(xpath="//a[@title='English']")
	private WebElement langue_anglais;		
	
	@FindBy(xpath="//span[normalize-space()='About us']")
	private WebElement lien_about_us;
	
	public WebElement getNumerosTelephones() {
		return numerosTelephones;
	}

	public void setNumerosTelephones(WebElement numerosTelephones) {
		this.numerosTelephones = numerosTelephones;
	}

	public WebElement getAdresse() {
		return adresse;
	}

	public void setAdresse(WebElement adresse) {
		this.adresse = adresse;
	}

	public WebElement getLien_facebook() {
		return lien_facebook;
	}

	public void setLien_facebook(WebElement lien_facebook) {
		this.lien_facebook = lien_facebook;
	}

	public WebElement getLien_linkedin() {
		return lien_linkedin;
	}

	public void setLien_linkedin(WebElement lien_linkedin) {
		this.lien_linkedin = lien_linkedin;
	}

	public WebElement getLangue() {
		return langue;
	}

	public void setLangue(WebElement langue) {
		this.langue = langue;
	}

	public WebElement getLangue_anglais() {
		return langue_anglais;
	}

	public void setLangue_anglais(WebElement langue_anglais) {
		this.langue_anglais = langue_anglais;
	}

	public WebElement getLien_about_us() {
		return lien_about_us;
	}

	public void setLien_about_us(WebElement lien_about_us) {
		this.lien_about_us = lien_about_us;
	}

	
}
