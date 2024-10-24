package webdriwer24_10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static webdriwer24_10.CalculatorPageXpath.*;

public class CalculatorPageMethods {
    private WebDriver webDriver;

    public CalculatorPageMethods(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void clickButtonCalculate() {

        By by = By.xpath(RESULT_BUTTON);
        WebElement webElement = webDriver.findElement(by);
        webElement.click();
    }

    public void sendKeysInputName(String name) {

        By inputNameBy = By.xpath(INPUT_NAME_XPATH);
        WebElement inputNameWebElement = webDriver.findElement(inputNameBy);
        inputNameWebElement.sendKeys(name);
    }

    public void sendHeightValue(String height) {
        By inputHeightBy = By.xpath(INPUT_HEIGHT_XPATH);
        WebElement inputHeightWebElement = webDriver.findElement(inputHeightBy);
        inputHeightWebElement.sendKeys(height);
    }

    public void sendWeightValue(String weight) {
        By inputWeightBy = By.xpath(INPUT_WEIGHT_XPATH);
        WebElement inputWeightWebElement = webDriver.findElement(inputWeightBy);
        inputWeightWebElement.sendKeys(weight);
    }

    public void clickManCheckbox() {
        By femaleGenderBy = By.xpath(MAN_CHECKBOX);
        WebElement femaleGenderWebElement = webDriver.findElement(femaleGenderBy);
        femaleGenderWebElement.click();
    }

    public void clickFemaleCheckbox() {
        By femaleGenderBy = By.xpath(FEMALE_CHECKBOX);
        WebElement femaleGenderWebElement = webDriver.findElement(femaleGenderBy);
        femaleGenderWebElement.click();
    }

    public String getActualResultTextResultError() {
        By textResultErrorBy = By.xpath(ACTUAL_RESULT_ERROR_XPATH);
        WebElement textResultErrorWebElement = webDriver.findElement(textResultErrorBy);
        return textResultErrorWebElement.getText();
    }

    public String getActualResultTextResul() {
        By textResultBy = By.xpath(ACTUAL_RESULT_XPATH);
        WebElement textResultByWebElement = webDriver.findElement(textResultBy);
        return textResultByWebElement.getText();
    }


}
