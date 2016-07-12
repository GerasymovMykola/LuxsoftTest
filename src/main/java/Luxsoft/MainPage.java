package Luxsoft;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage{

    private final By newLetter = By.cssSelector(".T-I.J-J5-Ji.T-I-KE.L3");
    private final By accButton = By.cssSelector(".gb_3a.gbii");
    private final By logInOtherUser = By.cssSelector(".gb_Fa.gb_Ce.gb_rb");
    private final By logOffButton = By.cssSelector(".gb_Fa.gb_Fe.gb_Ne.gb_rb");
    private WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    public MainPage clickNewLetter(){
        WebElement elNewLetter = (new WebDriverWait(driver, 30))
                .until(ExpectedConditions.presenceOfElementLocated(newLetter));
        driver.findElement(newLetter).click();
        return this;
    }

    public MainPage clickNewUser() {

        driver.findElement(accButton).click();
        driver.findElement(logInOtherUser).click();
        return this;
    }

    public MainPage clickLoggOffButton() {
        driver.findElement(accButton).click();
        driver.findElement(logOffButton).click();
        return this;
    }

    public MainPage findThemeLetter(String text) {
        By letter = By.xpath("//b[contains(text(),'" + text + "')]");
        WebElement elLetter = (new WebDriverWait(driver, 30))
                .until(ExpectedConditions.presenceOfElementLocated(letter));
        driver.findElement(letter).click();
        return this;
    }

}
