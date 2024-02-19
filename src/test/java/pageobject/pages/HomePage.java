package pageobject.pages;

import org.openqa.selenium.By;
import pageobject.BaseFunc;

public class HomePage {
    private final By ACCEPT_COOKIES_BUTTON = By.id("onetrust-accept-btn-handler");
    private BaseFunc baseFunc;
    //private final By KIDS_MENU_BTN = By.xpath(".//div[@title = 'Kids']");

    public HomePage(BaseFunc baseFunc){
        this.baseFunc = baseFunc;

    }

    public void acceptCookies(){
        baseFunc.click(ACCEPT_COOKIES_BUTTON);
    }
    //public void kidsBtn(){
    //baseFunc.click(KIDS_MENU_BTN);
    //}
}
