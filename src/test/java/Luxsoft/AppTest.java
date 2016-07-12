package Luxsoft;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AppTest{

    private HomePage homePage;
    private MainPage mainPage;
    private NewLetterPage newLetterPage;
    private LetterPage letterPage;

    @Before
    public void precondition() {
        FirefoxDriver driver = new FirefoxDriver();
        homePage = new HomePage(driver);
        mainPage = new MainPage(driver);
        newLetterPage = new NewLetterPage(driver);
        letterPage = new LetterPage(driver);
    }

    @org.junit.Test
    public void Test() throws InterruptedException {

        homePage.openHomePage()
                .enterUserName("mykolatest1")
                .clickNextButton()
                .enterPassword("mykolatest123")
                .clickSingInButton();

        mainPage.clickNewLetter();

        String mailTo = "mykolatest2@gmail.com";
        String textTheme = "QA automation engineer";
        String textLetter = "Dear Ms/Msr, " +
                "I am interested in applying for the position of automation QA and enclose my CV for your consideration. I have extensive experience in database development on 1C programing language and strong knowledge in hardware testing and software maintenance. I hope that this experience combined with my personal skills make me a good candidate for this job. " +
                "Now I am working as a freelance tester on Web project. Doing this job I got the following knowledge: software testing development life cycle, how to write testing documentation (test cases/test plans/bug reports), software development methodologies, software testing methods and test design techniques. " +
                "I am flexible in working in any team environment and can sit and work for long hours. I enjoy finding and preventing bugs so that the end-user can work on the application without any trouble. " +
                "I would be excited to participate in the work of Luxsoft and to contribute to its success. " +
                "Yours faithfully, " +
                "Mykola Gerasymov";

        newLetterPage.enterFieldTo(mailTo)
                .enterFieldTheme(textTheme)
                .enterLetterText(textLetter)
                .clickSendButton();


        mainPage.clickLoggOffButton();

        homePage.changeUser();

        homePage.enterUserName("mykolatest2")
                .clickNextButton()
                .enterPassword("mykolatest123")
                .clickSingInButton();

        mainPage.findThemeLetter(textTheme);

        letterPage.findTextLetter(textLetter);

    }


    @After
    public void postcondition(){
        //driver.quit();
    }


}
