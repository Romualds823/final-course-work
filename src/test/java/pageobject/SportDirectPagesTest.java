package pageobject;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import pageobject.pages.CatalogPage;
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

        CatalogPage catalogPage = new CatalogPage(baseFunc);
        catalogPage.setPriceFilter( 25.0, 35.0 );




 //       for (Double price : catalogPage.getAllActualPrices())   {
 //           Assertions.assertTrue(price >= 25.0 && price <= 35.0, "Price mismatch!");
 //       }
    }






}
