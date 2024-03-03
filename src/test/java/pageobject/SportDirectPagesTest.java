package pageobject;

import org.junit.jupiter.api.Test;
import pageobject.pages.HomePage;
import pageobject.pages.SubcategoriesPage;

public class SportDirectPagesTest {
    @Test
    public void SportdirectPagesTest() {
        BaseFunc baseFunc = new BaseFunc();
        baseFunc.openUrl("lv.sportsdirect.com");


        HomePage homePage = new HomePage(baseFunc);
        homePage.acceptCookies();
        homePage.selectMenuItem("Kids");


        SubcategoriesPage subcategoriesPage = new SubcategoriesPage(baseFunc);
        subcategoriesPage.selectSubcategory("Hoodies");

    }





}
