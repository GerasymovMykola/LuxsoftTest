package Luxsoft;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

    private final By userField = By.id("Email");
    private final By passField = By.id("Passwd");
    private final By nextButton = By.id("next");
    private final By singInButton = By.id("signIn");
    private final By addNewLinkUser = By.id("account-chooser-link");
    private final By addNewUser = By.id("account-chooser-add-account");
    private WebDriver driver;


    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public HomePage openHomePage(){
        driver.get("https://accounts.google.com/ServiceLogin?service=mail&continue=https://mail.google.com/mail/&hl=ru#identifier");
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

    public HomePage changeUser() {

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
