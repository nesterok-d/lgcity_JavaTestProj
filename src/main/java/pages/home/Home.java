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

}
