package steps;
import io.cucumber.java.en.*;
import static com.codeborne.selenide.Selenide.open;
import sitePages.*;



public class UserSteps{
	HomePage home = new HomePage();
	RegisterPage register = new RegisterPage();
	UserAccountPage userAccount = new UserAccountPage();
	

	@Given ("user opens the Home Page selects Euro currency and clicks on Register link")
	public void userOpensHomePageAndSelectsEuroCurrency(){
		open("https://automationteststore.com/");
		home.selectEuroCurrency();
		home.clickRegisterLink();
	}
	@When("user fills the registration form with valid data")
	public void userFillsRegistrationForm(){
		register.fillUserRegistrationForm("jhonne", "bonny", "jhonne" + System.currentTimeMillis() + "@gmail.com", "123street", "cityname", "12345", "jhon" + System.currentTimeMillis(), "Pass@123456789");
	} 
	@Then("After filling the form user clicks on Continue button and adds items to cart and pays with successfully message")
	public void userClicksContinueAndAddsItemsTocartAndPays(){
		userAccount.addItemsAndPay();
		userAccount.assertOrder();
	}
	
	
	

}
