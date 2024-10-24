package webdriwer24_10;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static webdriwer24_10.CalculatorMessages.*;
import static webdriwer24_10.CalculatorPageMethods.*;
import static webdriwer24_10.CalculatorPageXpath.*;

public class CalculatorTestAllTests {
    @Test
    public void testClick1() {
        WebDriver webDriver = new ChromeDriver();
        //сайт калькулятора
        webDriver.get("https://svyatoslav.biz/testlab/wt/index.php");
        CalculatorPageMethods calculatorPageMethods = new CalculatorPageMethods(webDriver);

        //имя
        calculatorPageMethods.sendKeysInputName("John");

        //рост
        calculatorPageMethods.sendHeightValue("180");

        //вес
        calculatorPageMethods.sendWeightValue("80");

        //нажатие на чекбокс "М"
        calculatorPageMethods.clickManCheckbox();

        //нажатие на кнопку рассчитать
        calculatorPageMethods.clickButtonCalculate();

        String actualResultTextResult1 = calculatorPageMethods.getActualResultTextResul();
        String expectedResultTextResultError1 = HEIGHT_RESULT;
        Assertions.assertEquals(actualResultTextResult1, expectedResultTextResultError1);
    }

    @Test
    public void testClick2() {
        WebDriver webDriver = new ChromeDriver();
        //сайт калькулятора
        webDriver.get("https://svyatoslav.biz/testlab/wt/index.php");
        CalculatorPageMethods calculatorPageMethods = new CalculatorPageMethods(webDriver);

        //сайт калькулятора
        webDriver.get("https://svyatoslav.biz/testlab/wt/index.php");

        //имя
        calculatorPageMethods.sendKeysInputName("Гена");

        //рост
        calculatorPageMethods.sendHeightValue("180");

        //вес
        calculatorPageMethods.sendWeightValue("80");

        //нажатие на чекбокс "Ж"
        calculatorPageMethods.clickFemaleCheckbox();

        //нажатие на кнопку рассчитать
        calculatorPageMethods.clickButtonCalculate();
    }

    @Test
    public void testClick3() {
        WebDriver webDriver = new ChromeDriver();
        //сайт калькулятора
        webDriver.get("https://svyatoslav.biz/testlab/wt/index.php");
        CalculatorPageMethods calculatorPageMethods = new CalculatorPageMethods(webDriver);

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

        String actualResultTextResultError1 = calculatorPageMethods.getActualResultTextResultError();
        String expectedResultTextResultError1 = DONT_HAVE_NAME_HEIGHT_WEIGHT_FEMALE;
        Assertions.assertEquals(actualResultTextResultError1, expectedResultTextResultError1);


        //сравнение текста ошибки,если введено только имя
        calculatorPageMethods.sendKeysInputName("John");
    }

    @Test
    public void testClick4() {
        WebDriver webDriver = new ChromeDriver();
        //сайт калькулятора
        webDriver.get("https://svyatoslav.biz/testlab/wt/index.php");
        CalculatorPageMethods calculatorPageMethods = new CalculatorPageMethods(webDriver);

        //сайт калькулятора
        webDriver.get("https://svyatoslav.biz/testlab/wt/index.php");

        //имя
        calculatorPageMethods.sendKeysInputName("John");

        //рост
        calculatorPageMethods.sendHeightValue("165");

        //вес
        calculatorPageMethods.sendWeightValue("75");

        //нажатие на чекбокс "Ж"
        calculatorPageMethods.clickFemaleCheckbox();

        //нажатие на кнопку рассчитать
        calculatorPageMethods.clickButtonCalculate();

        String actualResultTextResult1 = calculatorPageMethods.getActualResultTextResul();
        String expectedResultTextResultError1 = MAX_WEIGHT;
        Assertions.assertEquals(actualResultTextResult1, expectedResultTextResultError1);
    }

    @Test
    public void testClick5() {
        WebDriver webDriver = new ChromeDriver();
        //сайт калькулятора
        webDriver.get("https://svyatoslav.biz/testlab/wt/index.php");
        CalculatorPageMethods calculatorPageMethods = new CalculatorPageMethods(webDriver);

        //сайт калькулятора
        webDriver.get("https://svyatoslav.biz/testlab/wt/index.php");

        //имя
        calculatorPageMethods.sendKeysInputName("John");

        //рост
        calculatorPageMethods.sendHeightValue("165");

        //вес
        calculatorPageMethods.sendWeightValue("75");

        //нажатие на чекбокс "М"
        By manGenderBy = By.xpath(MAN_CHECKBOX);
        WebElement manGenderWebElement = webDriver.findElement(manGenderBy);
        manGenderWebElement.click();

        //нажатие на кнопку рассчитать
        calculatorPageMethods.clickButtonCalculate();

        String actualResultTextResult1 = calculatorPageMethods.getActualResultTextResul();
        String expectedResultTextResultError1 = MIN_WEIGHT;
        Assertions.assertEquals(actualResultTextResult1, expectedResultTextResultError1);
    }
}



