package pages.base;
//класс-родитель, от которого будут наследоваться все другие страницы
//реализация основных функций любой страницы

//Импорт встроенных библиотек и классов

import org.openqa.selenium.WebDriver;

public class BasePage {
    protected WebDriver driver; //создаем переменную driver доступную всем наследникам класса

    public BasePage(WebDriver driver) { //передача драйвера
        this.driver = driver;
    }

    public void open(String url){ //передача ссылки н астраницу
        driver.get(url);
    }

   /* public WebElement waitIsVisible(WebElement element){ //ожидание появления элемента
        new WebDriverWait(driver, EXPLICIT_WAIT).until(ExpectedConditions.visibilityOf(element));
        return  element;
    }*/
}
