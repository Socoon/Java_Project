package test_Cases;
import org.testng.annotations.Test;

import sitePages.*;
public class UserRegistrationTest extends TestBase{
	HomePage HomePageobject = new HomePage();
	RegisterPage RegisterPageobject = new RegisterPage();
	UserAccountPage UserAccountPageobject = new UserAccountPage();
	@Test
	public void userRegistrationSteps(){
		HomePageobject.selectEuroCurrency();
		HomePageobject.clickRegisterLink();
		RegisterPageobject.fillUserRegistrationForm("jhonne", "bonny", "jhonne" + System.currentTimeMillis() + "@gmail.com", "123street", "cityname", "12345", "jhon" + System.currentTimeMillis(), "Pass@123456789");
		UserAccountPageobject.addItemsAndPay();
		UserAccountPageobject.assertOrder();
	}
	

}
