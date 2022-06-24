import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Test1 {
    WebDriver driver;

    @BeforeTest
    public void before(){
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @Test
    public void firstTest() throws InterruptedException {


        driver.get("https://ya.ru");
        driver.findElement(By.id("text")).sendKeys("котики");
        driver.findElement(By.className("search3__button")).click();
        Thread.sleep(2000);
        //driver.quit();
    }

    @Test
    public void firstTest2() throws InterruptedException {


        driver.get("https://ya.ru");
        driver.findElement(By.id("text")).sendKeys("51495849");
        driver.findElement(By.className("search3__button")).click();
        Thread.sleep(2000);

    }

    @AfterTest
    public void after(){
        driver.quit();
    }
}
