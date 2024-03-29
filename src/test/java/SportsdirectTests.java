import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.devtools.v118.tethering.model.Accepted;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.w3c.dom.CDATASection;

import java.time.Duration;
import java.util.List;

public class SportsdirectTests {
    private final By ACCEPT_COOKIES_BUTTON = By.id("onetrust-accept-btn-handler");
    private final By KIDS_MENU_BTN = By.xpath(".//div[@title = 'Kids']");
    private final By CLICK_HOODIES = By.xpath(".//a[contains(@href, '/kids/clothing/hoodies')]");
    private final String SECTION = "Hoodies";

    @Test
    public void shoppingSportDirect() {
        WebDriver browser = new ChromeDriver();
        browser.manage().window().maximize();
        browser.get("https://lv.sportsdirect.com");

        WebDriverWait wait = new WebDriverWait(browser, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.presenceOfElementLocated(ACCEPT_COOKIES_BUTTON));

        WebElement acceptBtn = browser.findElement(ACCEPT_COOKIES_BUTTON);
        acceptBtn.click();

        WebElement kidsBtn = browser.findElement(KIDS_MENU_BTN);
        kidsBtn.click();

        WebElement hoodiesBtn = browser.findElement(CLICK_HOODIES);
        hoodiesBtn.click();


        WebElement menuBlock = browser.findElement(CLICK_HOODIES);
        List<WebElement> menuItems = menuBlock.findElements(KIDS_MENU_BTN);


//        boolean isSectionFound = false;
//        for (WebElement we : menuItems) {
//            System.out.println(we.getText());
//            if (we.getText().equals(SECTION)) {
//                wait.until(ExpectedConditions.elementToBeClickable(we));
//                isSectionFound = true;
//                we.click();
//                break;
//            }
//        }
//        Assertions.assertTrue(isSectionFound,"Section not found!");
    }
    }


