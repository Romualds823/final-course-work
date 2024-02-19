package pageobject;

import org.junit.jupiter.api.Test;
import pageobject.pages.HomePage;

public class SportDirectPagesTest {
    @Test
    public void SportDirectPagesTest() {
        BaseFunc baseFunc = new BaseFunc();
        baseFunc.openUrl("lv.sportsdirect.com");


        HomePage homePage = new HomePage(baseFunc);
        homePage.acceptCookies();
      //homePage.kidsBtn();
      //homePage.selectMenuItem("Hoodies");

    }





}
