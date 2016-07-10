package Luxsoft;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NewLetterPage {

    private WebDriver driver;

    private final By fieldTo = By.cssSelector("[name=\"to\"]");
    private final By fieldTheme = By.cssSelector("[name=\"subjectbox\"]");
    private final By letterText = By.cssSelector("[role=\"textbox\"]");
    private final By sendButton = By.cssSelector(".T-I.J-J5-Ji.aoO.T-I-atl.L3");
    private final By sendAllRight = By.cssSelector(".ag.a8k");

    public NewLetterPage enterFieldTo(String text){
        WebElement elPassField = (new WebDriverWait(driver, 30))
                .until(ExpectedConditions.presenceOfElementLocated(fieldTo));
        driver.findElement(fieldTo).sendKeys(text);
        return this;
    }

    public NewLetterPage enterFieldTheme(String text){
        driver.findElement(fieldTheme).click();
        driver.findElement(fieldTheme).sendKeys(text);
        return this;
    }

    public NewLetterPage enterLetterText(String text){

        driver.findElement(letterText).click();
        driver.findElement(letterText).sendKeys(text);
        return this;

    }

    public NewLetterPage clickSendButton(){
        driver.findElement(sendButton).click();
        WebElement elAllRight = (new WebDriverWait(driver, 30))
                .until(ExpectedConditions.presenceOfElementLocated(sendAllRight));
        return this;
    }

    public NewLetterPage(WebDriver driver){
        this.driver = driver;
    }

}
