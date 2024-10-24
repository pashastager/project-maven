package webdriwer24_10;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalculatorTestE {
    @Test
    public void testClick() {
        WebDriver webDriver = new ChromeDriver();
        //сайт калькулятора
        webDriver.get("https://svyatoslav.biz/testlab/wt/index.php");

        //имя
        String inputNameXpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[2]/td[2]/input";
        By inputNameBy = By.xpath(inputNameXpath);
        WebElement inputNameWebElement = webDriver.findElement(inputNameBy);
        inputNameWebElement.sendKeys("John");

        //рост
        String inputHeightXpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[3]/td[2]/input";
        By inputHeightBy = By.xpath(inputHeightXpath);
        WebElement inputHeightWebElement = webDriver.findElement(inputHeightBy);
        inputHeightWebElement.sendKeys("165");

        //вес
        String inputWeightXpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[4]/td[2]/input";
        By inputWeightBy = By.xpath(inputWeightXpath);
        WebElement inputWeightWebElement = webDriver.findElement(inputWeightBy);
        inputWeightWebElement.sendKeys("75");

        //нажатие на чекбокс "М"
        String manGenderXpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[5]/td[2]/input[1]";
        By manGenderBy = By.xpath(manGenderXpath);
        WebElement manGenderWebElement = webDriver.findElement(manGenderBy);
        manGenderWebElement.click();

        //нажатие на кнопку рассчитать
        String xpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[6]/td/input";
        By by = By.xpath(xpath);
        WebElement webElement = webDriver.findElement(by);
        webElement.click();

        String textResultXpath = "/html/body/table/tbody/tr[2]/td[2]";
        By textResultBy = By.xpath(textResultXpath);
        WebElement textResultByWebElement = webDriver.findElement(textResultBy);
        String actualResultTextResultError1 = textResultByWebElement.getText();
        String expectedResultTextResultError1 = "Незначительный избыток массы тела";
        Assertions.assertEquals(actualResultTextResultError1, expectedResultTextResultError1);
    }
}
