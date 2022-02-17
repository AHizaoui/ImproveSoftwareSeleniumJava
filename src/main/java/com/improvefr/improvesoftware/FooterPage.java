package com.improvefr.improvesoftware;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FooterPage extends PageObject {

	public FooterPage(WebDriver driver) {
		super(driver);

	}

	// methods to click on social media links

	public void clickOnFacebook() {

		getFacebook().click();
	}

	public void clickOnLinKedIn() {

		getLinkendIn().click();
	}

	// methods to click on Quick access pages locators

	public void clickOnCentreExellenceTesting() {

		getCentreExellenceTesting().click();
	}

	public void clickOnAssistanceAuRecrutement() {

		getAssistanceAuRecrutement().click();
	}

	public void clickOnConsulting() {
		getConsulting().click();

	}

	public void clickOnCarriere() {

		getCarriere().click();
		
	}

	public void clickOnContact() {

		getContact().click();

	}

	// methods to check Search part

	public void checkRECHERCHEWord() {

		assertEquals("RECHERCHE", searchText.getText());

	}

	public void checkDefaultValueOfSearchBar() {

		assertEquals("", searchFieldText.getText());

	}

	public void makeSearch() {

		getSearchFieldText().sendKeys("tessst");
		getSearchFieldButton().click();

	}

//	method to Clik on Down  To Top  button

	public void clickOnDownToTopButton() {

		getDownToTopButton().click();
	}
	
	
//	######## Locators ###############

	// Chiffres Clés locators

	@FindBy(xpath = "//div/div[7]/div/div[1]/div/div/h2")
	private WebElement chiffresClés;

	// Quick access pages locators

	@FindBy(xpath = "//span[contains(text(),'Centre d’Excellence en Testing')]")

	private WebElement centreExellenceTesting;

	@FindBy(xpath = "//span[normalize-space()='Assistance au recrutement']")
	private WebElement assistanceAuRecrutement;

	@FindBy(xpath = "//span[normalize-space()='Consulting']")
	private WebElement consulting;

	@FindBy(xpath = "//li[@id='nav-menu-item-3719']//span[@class='item-title'][normalize-space()='Carrières']")
	private WebElement carriere;

	@FindBy(xpath = "//li[@id='nav-menu-item-3721']//span[@class='item-title'][normalize-space()='Contact']")
	private WebElement contact;

	// Social Media locators

	@FindBy(xpath = "//div[@class='span7']//i[@class='fa fa-facebook']")
	private WebElement facebook;

	@FindBy(xpath = "//div[@class='span7']//i[@class='fa fa-linkedin']")
	private WebElement linkendIn;

	// Search Icon

	@FindBy(xpath = "//body/div[1]/footer[1]/div[1]/div[1]/div[1]/aside[1]/form[1]/input[1]")
	private WebElement searchFieldText;

	@FindBy(id = "searchsubmit")
	private WebElement searchFieldButton;

	@FindBy(xpath = "//h6[contains(text(),'Recherche')]")
	private WebElement searchText;

	// Down to Top Button

	@FindBy(xpath = "//div[@id='scrollTop']")
	private WebElement downToTopButton;

	// Nos Contact
	@FindBy(xpath = "//h6[normalize-space()='Nos Contacts']")
	private WebElement nosContactField;

	@FindBy(xpath = "//div[normalize-space()='05 Avenue des chasseurs, 75017 Paris']")
	private WebElement nosContactAddress;

	@FindBy(xpath = "//div[normalize-space()='+33 1 86 61 01 37']")
	private WebElement nosContactPhone;

	@FindBy(xpath = "//body/div[1]/div[1]/div[1]/div[2]")
	private WebElement adressInHeader;
	
	@FindBy(xpath = "//a[contains(text(),'contact@improve-software.com')]")
	private WebElement mailAdressInFooter;
	

	// ########### Getters & Setters ####################

	public WebElement getChiffresClés() {
		return chiffresClés;
	}

	public void setChiffresClés(WebElement chiffresClés) {
		chiffresClés = chiffresClés;
	}

	public WebElement getCentreExellenceTesting() {
		return centreExellenceTesting;
	}

	public void setCentreExellenceTesting(WebElement centreExellenceTesting) {
		centreExellenceTesting = centreExellenceTesting;
	}

	public WebElement getAssistanceAuRecrutement() {
		return assistanceAuRecrutement;
	}

	public void setAssistanceAuRecrutement(WebElement assistanceAuRecrutement) {
		assistanceAuRecrutement = assistanceAuRecrutement;
	}

	public WebElement getConsulting() {
		return consulting;
	}

	public void setConsulting(WebElement consulting) {
		consulting = consulting;
	}

	public WebElement getCarriere() {
		return carriere;
	}

	public void setCarriere(WebElement carriere) {
		carriere = carriere;
	}

	public WebElement getContact() {
		return contact;
	}

	public void setContact(WebElement contact) {
		contact = contact;
	}

	public WebElement getFacebook() {
		return facebook;
	}

	public void setFacebook(WebElement facebook) {
		facebook = facebook;
	}

	public WebElement getLinkendIn() {
		return linkendIn;
	}

	public void setLinkendIn(WebElement linkendIn) {
		linkendIn = linkendIn;
	}

	public WebElement getSearchFieldText() {
		return searchFieldText;
	}

	public void setSearchFieldText(WebElement searchFieldText) {
		searchFieldText = searchFieldText;
	}

	public WebElement getSearchFieldButton() {
		return searchFieldButton;
	}

	public void setSearchFieldButton(WebElement searchFieldButton) {
		searchFieldButton = searchFieldButton;
	}

	public WebElement getDownToTopButton() {
		return downToTopButton;
	}

	public void setDownToTopButton(WebElement scrollTopButton) {
		downToTopButton = downToTopButton;
	}

	public WebElement getAdressInHeader() {
		return 	adressInHeader;
	}

	public void setAdressInHeader(WebElement adressInHeader) {
		adressInHeader = adressInHeader;
	}

	public WebElement getSearchText() {
		return searchText;
	}

	public void setSearchText(WebElement searchText) {
		searchText = searchText;
	}

	public WebElement getNosContactField() {
		return nosContactField;
	}

	public void setNosContactField(WebElement nosContactField) {
		nosContactField = nosContactField;
	}

	public WebElement getNosContactAddress() {
		return nosContactAddress;
	}

	public void setNosContactAddress(WebElement nosContactAddress) {
		nosContactAddress = nosContactAddress;
	}

	public WebElement getNosContactPhone() {
		return nosContactPhone;
	}

	public void setNosContactPhone(WebElement nosContactPhone) {
		nosContactPhone = nosContactPhone;
	}

	public WebElement getMailAdressInFooter() {
		return mailAdressInFooter;
	}

	public void setMailAdressInFooter(WebElement mailAdressInFooter) {
		mailAdressInFooter = mailAdressInFooter;
	}

	
	
}
