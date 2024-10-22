package webdriwer;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalculatorTest {
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
        inputHeightWebElement.sendKeys("180");

        //вес
        String inputWeightXpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[4]/td[2]/input";
        By inputWeightBy = By.xpath(inputWeightXpath);
        WebElement inputWeightWebElement = webDriver.findElement(inputWeightBy);
        inputWeightWebElement.sendKeys("80");

        //нажатие на чекбокс "М"
        String femaleGenderXpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[5]/td[2]/input[2]";
        By femaleGenderBy = By.xpath(femaleGenderXpath);
        WebElement femaleGenderWebElement = webDriver.findElement(femaleGenderBy);
        femaleGenderWebElement.click();

        //нажатие на кнопку рассчитать
        String xpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[6]/td/input";
        By by = By.xpath(xpath);
        WebElement webElement = webDriver.findElement(by);
        webElement.click();
    }
}
