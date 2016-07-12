package Luxsoft;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LetterPage {

    private WebDriver driver;

    public LetterPage(WebDriver driver) {
        this.driver = driver;
    }

    public LetterPage findTextLetter(String text) {

        By letterText = By.xpath("//*[contains(text(),'" + text + "')]");

        WebElement elTextLetter = (new WebDriverWait(driver, 30))
                .until(ExpectedConditions.presenceOfElementLocated(letterText));

        return this;

    }

}
