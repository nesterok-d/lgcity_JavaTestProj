package pages.home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

public class Home extends BasePage {

    public Home(WebDriver driver) {
        super(driver);
    }

    private final By catalogSection = By.id("menu-340");
    private final By product = By.cssSelector("div.swiper-slide-active[data-index='0']");
    private final By buttonCart = By.id("btn-add-to-cart");
    private final By cart = By.cssSelector("a.js-header-basket[data-popup='popup--basket']");
    private final By nameProduct = By.cssSelector("span.card__info-desc");
    private final By nameProductInCart = By.cssSelector("p.basket__item-desc");

    //добавление в карзину
    public Home addToCart(){
        driver.findElement(catalogSection).click();
        driver.findElement(product).click();
        driver.findElement(buttonCart).click();
        //String nameTextProduct = driver.findElement(nameProduct).getText();
        return this;
    }

    //переход в карзину
    public Home toCart(){
        driver.findElement(cart).click();
        //String nameTextInCart = driver.findElement(nameProductInCart).getText();
        return this;
    }

   /* public Home checkName(){
        String nameTextProduct = driver.findElement(nameProduct).getText();
        String nameTextInCart = driver.findElement(nameProductInCart).getText();
        Assert.assertEquals(nameTextProduct, nameTextInCart);
        return this;
    }*/
}

