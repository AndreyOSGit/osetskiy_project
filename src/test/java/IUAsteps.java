

import PatternsForAT.DriverSingleton;
import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import pom.CreateMailPage;
import pom.MailPage;
import pom.MainPage;
import pom.openedLetterPage;


public class IUAsteps {


    WebDriver runDriver = new DriverSingleton().getDriver();
//    DriverFactory driverFactory = new DriverFactory();
   // WebDriver runDriver = driverFactory.getBrowser("firefox");
  //  WebDriver runDriver2 = driverFactory.getBrowser("firefox");
    protected MainPage MainPageInstance = null;

    @Before
    public void before()
    {
        runDriver.manage().window().maximize();
       // runDriver2.manage().window().maximize();
        MainPageInstance = PageFactory.initElements(runDriver,MainPage.class);
       // MainPageInstance = PageFactory.initElements(runDriver2,MainPage.class);
    }

    @After
    public void after()
    {
   //     driverFactory.closeAllDriver();
        runDriver.close();
        runDriver.quit();
    }

    @Given("^I on iua main page$")
    public void IonMainPage ()
        {
            runDriver.get("http://i.ua");
//            runDriver2.get("http://i.ua");
        }

    @When("^Enter e-mail as (.*) and password as (.*) and press login button$")
    public void EnterEmailAndPasswordAndPressLoginButton ( String login, String password)
    {
        MainPageInstance.loginToaccount(login, password, runDriver);
//        MainPageInstance.loginToaccount(login, password, runDriver2);
    }

    @Then("^Check my login (.*)$")
        public void checkMyLogin(String exp)
    {
        String act1 = PageFactory.initElements(runDriver,MailPage.class).getAccountName();
//        String act2 = PageFactory.initElements(runDriver2,MailPage.class).getAccountName();
        Assert.assertEquals(exp,act1);
//        Assert.assertEquals(exp,act2);
    }
    @And("^I opewn create mail window(.*)$")
    public void OpenCreateMailWindow(String exp)
    {
        String act1 = PageFactory.initElements(runDriver,MailPage.class).getAccountName();
        Assert.assertEquals(exp,act1);
    }


    @When("^I open create mail window$")
    public void iOpenCreateMailWindow() throws InterruptedException {
        MailPage mailPage = PageFactory.initElements(runDriver, MailPage.class);
        mailPage.clickCreateMail();
        Thread.sleep(1000);
    }



    @Then("^Sent created email$")
    public void sentCreatedEmail() throws Throwable {
        CreateMailPage mail = PageFactory.initElements(runDriver, CreateMailPage.class);
        mail.sendEmail();
    }

    @And("^I enter adress as (.*), subject as (.*), mail text as (.*)$")
    public void iEnterAdressAsSubjectAsMailTextAs(String Adress, String Subject, String Text) throws Throwable {
        CreateMailPage mail = PageFactory.initElements(runDriver, CreateMailPage.class);
        mail.writeImail(Adress,Subject,Text);
        runDriver.switchTo().frame(runDriver.findElement(By.cssSelector("iframe#wysiwygtext")));
        runDriver.findElement(By.cssSelector("body.Smile")).sendKeys(Text);
        runDriver.switchTo().parentFrame();
    }

    @And("^I Open mail list$")
    public void iOpenMailList() throws Throwable {
        MailPage mail = PageFactory.initElements(runDriver, MailPage.class);
        mail.showMeInbox();
    }


    @And("^Open last mail I haven`t read from (.*)$")
    public void openLastMailIHavenTReadFromTestmailswatIUa(String name) throws Throwable {
        MailPage mail = PageFactory.initElements(runDriver, MailPage.class);
        mail.openLastMailFrom(name);
    }

    @Then("^I see mail with subject as (.*) and text as (.*)$")
    public void iSeeMailWithSubjectAsAndTextAs(String  Subject, String Text ) throws Throwable {
        openedLetterPage mail = PageFactory.initElements(runDriver, openedLetterPage.class);
        mail.seeMailWithTitleAndText(Subject);
        runDriver.switchTo().frame(runDriver.findElement(By.cssSelector("div.message_body iframe")));
        String act = runDriver.findElement(By.cssSelector("body")).getText();
         runDriver.switchTo().parentFrame();
        Assert.assertTrue (act.contains(Text));
    }


}
