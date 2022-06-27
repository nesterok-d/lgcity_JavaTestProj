package tests.base;
//создание родителя для всех тестов с функциями, использемыми всеми тестами

import common.CommonActions;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import pages.base.BasePage;
import pages.home.Home;

import static common.Config.Browser_Close;
import static common.Config.Clear_Cookies_And_Storage;


public class BaseTest {
    protected WebDriver driver = CommonActions.createDriver(); // создание драйвера
    protected BasePage basePage = new BasePage(driver); //запуск страницы, далее наследники смогут работать с методами страницы
    protected Home homePage = new Home(driver);



    @AfterTest
    public void clearCookiesAndStorage(){
        if(Clear_Cookies_And_Storage){
            JavascriptExecutor javascriptExecutor  = (JavascriptExecutor) driver;
            driver.manage().deleteAllCookies();
            javascriptExecutor.executeScript("window.sessionStorage.clear()");
        }
    }
    @AfterSuite(alwaysRun = true)
    public void browserClose(){
        if(Browser_Close){
            driver.quit();
        }
    }


}

