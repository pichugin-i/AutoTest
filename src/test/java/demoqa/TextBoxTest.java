package demoqa;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class TextBoxTest {

    private static WebDriver driver;
    private static MainPage page;

    @BeforeAll
    static void setUpAll() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\IlyaPich\\Desktop\\z\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.getWindowHandle();
        page = new MainPage(driver);
    }

    @BeforeEach
    void connect() {
        driver.get("https://demoqa.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void test1() {
        String fieldName = "Ilya";
        String fieldEmail = "pichugin.lua@yandex.ru";
        String fieldCurrentAdr = "Проспект Ленина";
        String fieldPermamentAdr = "Проспект Лиги";
        page.createTextBox(fieldName, fieldEmail, fieldCurrentAdr, fieldPermamentAdr);
    }


}