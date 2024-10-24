package webdriwer24_10;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalculatorTestB {
    @Test
    public void testClick() {
        WebDriver webDriver = new ChromeDriver();
        //сайт калькулятора
        webDriver.get("https://svyatoslav.biz/testlab/wt/index.php");

        String textHeaderXpath = "/html/body/table/tbody/tr[1]/td";
        By textHeaderBy = By.xpath(textHeaderXpath);
        WebElement textHeaderWebElement = webDriver.findElement(textHeaderBy);
        //присваевание полученного текста переменной actualResult
        String actualResult = textHeaderWebElement.getText();
        //проверяем полученный текст с ожидаемым
        Assertions.assertTrue(actualResult.contains("Расчёт веса"), "Текст заголовка не совпадает");

        //проверка текста ошибки,если поля не заполены

//нажатие на кнопку рассчитать
        String xpath = "//input[@type='submit' and @value='Рассчитать']";
        By by = By.xpath(xpath);
        WebElement webElement = webDriver.findElement(by);
        webElement.click();

        String textResultErrorXpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[1]/td";
        By textResultErrorBy = By.xpath(textResultErrorXpath);
        WebElement textResultErrorWebElement = webDriver.findElement(textResultErrorBy);
        String actualResultTextResultError1 = textResultErrorWebElement.getText();
        String expectedResultTextResultError1 = "Не указано имя.\n" +
                "Рост должен быть в диапазоне 50-300 см.\n" +
                "Вес должен быть в диапазоне 3-500 кг.\n" +
                "Не указан пол.";
        Assertions.assertEquals(actualResultTextResultError1, expectedResultTextResultError1);


        //сравнение текста ошибки,если введено только имя
        String inputNameXpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[2]/td[2]/input";
        By inputNameBy = By.xpath(inputNameXpath);
        WebElement inputNameWebElement = webDriver.findElement(inputNameBy);
        inputNameWebElement.sendKeys("John");

        //нажатие на кнопку рассчитать
//        webElement.findElement(by);
//        webElement.click(xpath);
//
//        String actualResultTextResultError2 = textResultErrorWebElement.getText();
//        String expectedResultTextResultError2 = "Рост должен быть в диапазоне 50-300 см.\n" +
//                "Вес должен быть в диапазоне 3-500 кг.\n" +
//                "Не указан пол.";
//        Assertions.assertEquals(actualResultTextResultError2, expectedResultTextResultError2);

    }
}

