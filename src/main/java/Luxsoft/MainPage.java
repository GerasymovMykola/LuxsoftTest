package Luxsoft;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage{

    private WebDriver driver;

    private final By newLetter = By.cssSelector(".T-I.J-J5-Ji.T-I-KE.L3");

    public MainPage clickNewLetter(){
        WebElement elNewLetter = (new WebDriverWait(driver, 30))
                .until(ExpectedConditions.presenceOfElementLocated(newLetter));
        driver.findElement(newLetter).click();
        return this;
    }

    public MainPage(WebDriver driver){
        this.driver = driver;
    }

}
