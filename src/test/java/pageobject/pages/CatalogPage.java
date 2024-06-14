package pageobject.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pageobject.BaseFunc;

import java.util.ArrayList;
import java.util.List;

public class CatalogPage {

    private final By PRICE_FROM = By.id("PriceFilterTextEntryMin");
    private final By PRICE_TO = By.id("PriceFilterTextEntryMax");
    private final By FILTER_VALUE = By.id("PriceFilterTextEntry");
    private final By ITEM = By.id("sdlv_53930103");
    private BaseFunc baseFunc;


   private final By CATALOG_ITEM = By.xpath(".//div[contains(@class, 'productimage s-productthumbimage')]");
   private final By DISCOUNT_PRICE = By.xpath(".//div[contains(@class, 's-largered')]");
   private final By REGULAR_PRICE = By.xpath(".//span[contains(@class, 's-smalltext')]");

    public CatalogPage(BaseFunc baseFunc) {
        this.baseFunc = baseFunc;
    }

    public void setPriceFilter(Double priceFrom , Double priceTo)    {
        String priceFromAsText = String.valueOf(priceFrom.intValue());
        String priceToAsText = String.valueOf(priceTo.intValue());

        baseFunc.typeTextInCustomField(PRICE_FROM, priceFromAsText);


        baseFunc.typeTextInCustomField(PRICE_TO, priceToAsText);
        baseFunc.pressEnter(PRICE_TO);

    //    baseFunc.click(ITEM);

 //       baseFunc.waitForContainingText(FILTER_VALUE, " " + priceFromAsText + " - " + priceToAsText);
    }

//        public List<Double> getAllActualPrices()    {
//        List<WebElement> products = baseFunc.findElements(CATALOG_ITEM);
//
//        List<Double> actualPrices = new ArrayList<>();
//        for (WebElement product: products)  {
//            if (baseFunc.findElements(product, DISCOUNT_PRICE).isEmpty())    {
//                String price = baseFunc.getText(product,REGULAR_PRICE).replaceAll(",", ".");
//                actualPrices.add(Double.valueOf(price));
//            } else {
//                String price = baseFunc.getText(product,DISCOUNT_PRICE).replaceAll(",", ".").replaceAll(" €"," ");
//                actualPrices.add(Double.valueOf(price));
//            }
//        }
//        return actualPrices;
//    }

}
