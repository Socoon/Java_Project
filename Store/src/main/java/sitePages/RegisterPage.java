package sitePages;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Condition.text;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

import java.util.Random;

import com.codeborne.selenide.ElementsCollection;

public class RegisterPage extends PageBase {
	 
		private SelenideElement continueButton = $(byCssSelector("button[title='Continue']"));
		private SelenideElement firstName = $(byId("AccountFrm_firstname"));
		private SelenideElement lastName = $(byId("AccountFrm_lastname"));
		private SelenideElement email = $(byId("AccountFrm_email"));
		private SelenideElement address = $(byId("AccountFrm_address_1"));
		private SelenideElement city = $(byId("AccountFrm_city"));
		private SelenideElement region= $(byId("AccountFrm_zone_id"));
		private SelenideElement zipcode = $(byId("AccountFrm_postcode"));
		private SelenideElement country = $(byId("AccountFrm_country_id"));
		private SelenideElement loginName = $(byId("AccountFrm_loginname"));
		private SelenideElement password = $(byId("AccountFrm_password"));
		private SelenideElement confirmPassword = $(byId("AccountFrm_confirm"));
		private SelenideElement policyCheckbox = $(byId("AccountFrm_agree"));
		private SelenideElement continueButton2 = $(byCssSelector("button[title='Continue']"));
		private SelenideElement resultMessage = $(byCssSelector(".maintext"));
		private SelenideElement continueShopping = $(byXpath("//a[normalize-space()='Continue']"));
		public void assertRegistration(){
			resultMessage.shouldHave(text("Your Account Has Been Created!"));
		}
		
		public void fillUserRegistrationForm(String fname, String lname, String emailText, String addr , String cityText, String zip, String login, String pass){
			clickButton(continueButton);
			setText(firstName, fname);
			setText(lastName, lname);
			setText(email, emailText);
			setText(address, addr);
			setText(city, cityText);
			
			ElementsCollection countriesOptions = country.$$(byTagName("option"));
			int randomCountry = new Random().nextInt(countriesOptions.size()-1)+1;
			String selectedCountry = countriesOptions.get(randomCountry).getText();
			country.selectOption(selectedCountry);
			System.out.println("random country selected:" + selectedCountry);
			
			setText(zipcode, zip);
			
			ElementsCollection regionsOptions = region.$$(byTagName("option"));
			int randomregion = new Random().nextInt(regionsOptions.size()-1)+ 1;
			String selectedRegion = regionsOptions.get(randomregion).getText();
			region.selectOption(selectedRegion);
			System.out.println("random region selected:" + selectedRegion);
			
			setText(loginName, login);
			setText(password, pass);
			setText(confirmPassword, pass);
			clickButton(policyCheckbox);
			clickButton(continueButton2);
			clickButton(continueShopping);
			
			
			
		}
		
		
	

}
