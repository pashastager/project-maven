package by.itacademy.web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.URI;

public class BasePage {

    protected String BASE_URL = "https://www.wikipedia.org/";

    public void open() {
        String buf = BASE_URL;
        WebDriver driver = new ChromeDriver();
        driver.navigate().to(buf);

        String url = driver.getCurrentUrl();
        System.out.println("Пользователь открыл страницу " + url);

    }
}
