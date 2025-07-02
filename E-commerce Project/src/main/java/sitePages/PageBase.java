package sitePages;

import com.codeborne.selenide.SelenideElement;

public class PageBase {
		
	protected void clickButton(SelenideElement elment){
		elment.click();
	}
	protected void setText(SelenideElement element , String value){
		element.setValue(value);
	}
	protected void mouseHover(SelenideElement element){
		element.hover();
	}

}
