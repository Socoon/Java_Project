package sitePages;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Condition.text;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Condition.visible;



import static com.codeborne.selenide.Selenide.$;
public class UserAccountPage extends PageBase {
	
	private SelenideElement skinCare = $(byCssSelector("a[href*='path=43']"));
	private SelenideElement addProduct1 = $(byXpath("(//i[@class='fa fa-cart-plus fa-fw'])[2]"));
	private SelenideElement addProduct2 = $(byXpath("(//i[@class='fa fa-cart-plus fa-fw'])[3]"));
	private SelenideElement cart = $(byXpath("(//span[contains(@class,'menu_text')][normalize-space()='Cart'])[1]"));
	private SelenideElement checkout = $(byCssSelector("#cart_checkout1"));
	private SelenideElement confirmOrder = $(byCssSelector("#checkout_btn"));
	private SelenideElement resultMessage = $(byCssSelector(".maintext"));
	public void addItemsAndPay(){
		skinCare.shouldBe(visible);
		clickButton(skinCare);
		clickButton(addProduct1);
		clickButton(addProduct2);
		clickButton(cart);
		clickButton(checkout);
		clickButton(confirmOrder);
	}	
	public void assertOrder(){
		resultMessage.shouldHave(text("Your Order Has Been Processed!"));
			System.out.println("Order placed successfully");
		
	}

}
