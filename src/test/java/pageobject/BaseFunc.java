package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BaseFunc {
    private WebDriver browser;
    private WebDriverWait waitOne;

    public BaseFunc(){
        browser = new ChromeDriver();
        browser.manage().window().maximize();
        waitOne = new WebDriverWait(browser, Duration.ofSeconds(3));


    }

    public void openUrl(String url) {

        if (!url.startsWith("http://") && !url.startsWith("https://")) {
        url = "http://" + url;
    }


        browser.get(url);

    }
    public void click(By locator){
    waitOne.until(ExpectedConditions.elementToBeClickable(locator)).click();

    }
}
