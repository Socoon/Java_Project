package sitePages;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class HomePage extends PageBase {
		private SelenideElement register = $(byCssSelector("ul[id='customer_menu_top'] li a"));
		private SelenideElement currencyMenu = $(byCssSelector("ul[class='nav language pull-left'] a[class='dropdown-toggle']"));
		private SelenideElement euroOption = $(byXpath("//a[contains(text(),'€ Euro')]"));
		
		public void clickRegisterLink(){
			clickButton(register);
		}
	public void selectEuroCurrency(){
		clickButton(currencyMenu);
		euroOption.shouldBe(visible).click();;
		
	}
}
	


