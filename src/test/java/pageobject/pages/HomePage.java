package pageobject.pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.Browser;
import pageobject.BaseFunc;

import java.util.List;

public class HomePage {
    private final By ACCEPT_COOKIES_BUTTON = By.id("onetrust-accept-btn-handler");
    private final By MENU_ITEM = By.xpath(".//div[@CLASS = 'swiper-wrapper']");
    private final By MENU_KIDS = By.xpath(".//a[@href = '/kids']");
    private final By ITEM = By.id("sdlv_53930103");
    private BaseFunc baseFunc;


        //.//div[@title = 'Kids']"
    public HomePage(BaseFunc baseFunc) {
        this.baseFunc = baseFunc;

    }

    public void acceptCookies()  {
        baseFunc.click(ACCEPT_COOKIES_BUTTON);
    }





    public void selectMenuItem(String menuItemName) {
        WebElement menuBlock = baseFunc.findElement(MENU_ITEM);
        List<WebElement> items = menuBlock.findElements(MENU_KIDS);

        boolean isSectionFound = false;
            for (WebElement we : items) {
            if (we.getText().equals(menuItemName)) {
                isSectionFound = true;
                we.click();
                break;
            }
        }
        Assertions.assertTrue(isSectionFound,"Can't find menu item"+menuItemName);
    }

    public void clickItem() {
        baseFunc.click(ITEM);
    }

}