package Luxsoft;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

    private WebDriver driver;

    private final By userField = By.id("Email");
    private final By passField = By.id("Passwd");
    private final By nextButton = By.id("next");
    private final By singInButton = By.id("signIn");
    private final By accButton = By.cssSelector(".gb_3a.gbii");
    private final By logOffButton = By.cssSelector(".gb_Fa.gb_Fe.gb_Ne.gb_rb");
    private final By addNewLinkUser = By.id("account-chooser-link");
    private final By addNewUser = By.id("account-chooser-add-account");

    public HomePage openHomePage(){
        driver.get("https://mail.google.com/");
        return this;
    }

    public HomePage enterUserName(String text){
        driver.findElement(userField).sendKeys(text);
        return this;
    }

    public HomePage clickNextButton(){
        driver.findElement(nextButton).click();
        return this;
    }

    public HomePage clickSingInButton(){
        driver.findElement(singInButton).click();
        return this;
    }


    public HomePage enterPassword(String text){
        WebElement elPassField = (new WebDriverWait(driver, 30))
                .until(ExpectedConditions.presenceOfElementLocated(passField));
        driver.findElement(passField).sendKeys(text);

        return this;
    }


    public HomePage(WebDriver driver){
        this.driver = driver;

    }

    public HomePage clickLoggOffButton(){
        driver.findElement(accButton).click();
        driver.findElement(logOffButton).click();
        WebElement eladdNewLinkUser = (new WebDriverWait(driver, 30))
                .until(ExpectedConditions.presenceOfElementLocated(addNewLinkUser));
        driver.findElement(addNewLinkUser).click();
        WebElement eladdNewUser = (new WebDriverWait(driver, 30))
                .until(ExpectedConditions.presenceOfElementLocated(addNewUser));
        driver.findElement(addNewUser).click();
        WebElement eluserField = (new WebDriverWait(driver, 30))
                .until(ExpectedConditions.presenceOfElementLocated(userField));
        return this;
    }

}
