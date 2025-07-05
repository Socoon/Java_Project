package test_Cases;

import com.codeborne.selenide.Configuration;
import static com.codeborne.selenide.Selenide.*;

//import org.testng.annotations.AfterSuite;
//import org.testng.annotations.BeforeSuite;


public class TestBase {
	//@BeforeSuite
	public void startBrowser(){
		Configuration.browser = "chrome";
		Configuration.headless = true;
		open("https://automationteststore.com/");
	}
	//@AfterSuite
	public void closeBroswer(){
	closeWebDriver();
		
	}

}
