package pages.home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class OuterWearWomen extends BasePage{
    public OuterWearWomen(WebDriver driver) {super(driver);}

    private final By sort = By.cssSelector("div.select__container--city");
    private final By sortNewIncr = By.cssSelector("li.js-catalog-sort-btn[data-sort='new-desc']");
    private final By sortNewDecr = By.cssSelector("li.js-catalog-sort-btn[data-sort='new-asc']");
    private final By sortPriceIncr = By.cssSelector("li.js-catalog-sort-btn[data-sort='price-desc']");
    private final By sortPriceDecr = By.cssSelector("li.js-catalog-sort-btn[data-sort='price-asc']");
    private final By sortPopularIncr = By.cssSelector("li.js-catalog-sort-btn[data-sort='popular-desc']");
    private final By sortPopularDecr = By.cssSelector("li.js-catalog-sort-btn[data-sort='popular-asc']");
    private final By catalogTitle = By.cssSelector("h1.catalog__title");

    public void sortListOfProduct(){
        By[] listSort = new By[]{sortNewIncr, sortNewDecr, sortPriceIncr,sortPriceDecr,sortPopularIncr,sortPopularDecr};
        String [] expectedSortType = {"По новинкам ↓", "По новинкам ↑", "По возрастанию цены ↓", "По убыванию цены ↑", "По популярности ↓", "По популярности ↑"};
        String [] expectedSortTitle ={"Женская верхняя одежда, новая коллекция", "Женская верхняя одежда, основная коллекция", "Женская верхняя одежда, недорого", "Женская верхняя одежда, премиум", "Женская верхняя одежда, смелое", "Женская верхняя одежда, популярное"};

        int i = 0;
        for (By sortType : listSort){
            driver.findElement(sort).click();
            String actualSortType = driver.findElement(sortType).getAttribute("value");
            assert actualSortType == expectedSortType[i];
            driver.findElement(sortType).click();
            String actualSortTitle = driver.findElement(catalogTitle).getText();
            assert actualSortTitle == expectedSortTitle[i];
            i++;
        }

        return;
    }



}
