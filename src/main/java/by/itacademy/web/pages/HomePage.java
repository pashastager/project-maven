package by.itacademy.web.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage extends BasePage {
    protected String HOME_URL = BASE_URL + "wiki/Main_Page";

    @Override
    public void open() {
        super.BASE_URL=HOME_URL;
        super.open();
    }

    public String getTitel() {

        WebDriver webDriver = new ChromeDriver();
        webDriver.navigate().to(HOME_URL);
        return webDriver.getTitle();
    }

    public void   clickLogin() {
        WebDriver webDriver=new ChromeDriver();
        webDriver.navigate().to(HOME_URL);
        String Path="//*[@id=\"pt-login-2\"]/a/span";
        By by=By.xpath(Path);
        WebElement webElement=webDriver.findElement(by);
        webElement.click();
        System.out.println("Пользователь кликнул по кнопке Войти");

    }


}
