package pom;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CreateMailPage extends BasePage
{

    @FindBy(css = "#to")
    protected WebElement inputAdres;

    @FindBy(css = "input[name=\"subject\"]")
    protected WebElement inputSubject;


//    @FindBy( css = "body.Smile")
    @FindBy( css = "iframe#wysiwygtext")
    protected WebElement inputText;


    @FindBy(css = "input[name=\"send\"]")
    protected WebElement buttonSend;

public WebDriver driver;

//    @FindBy(css = "")
//    protected WebElement buttonUndo;
//
//    @FindBy(css = "")
//    protected WebElement buttonSave;

    public void writeImail(String Adres, String Subject, String Text ) throws InterruptedException {
        inputAdres.sendKeys(Adres);
        inputSubject.sendKeys(Subject+ Keys.ENTER);
//        inputText.click();
        Thread.sleep(1000);

//        js.executeScript("document.getElementsByClassName('Smile').value='"+Text+"'");
//        js.executeScript("arguments[0].setAttribute('innerText', ' "+Text+" ')", driver.findElement(By.cssSelector("body.Smile")));
    }

    public  void sendEmail() throws InterruptedException {
        buttonSend.click();
        Thread.sleep(2000);
    }

    public CreateMailPage()
    {
            // put here some initiazization
    }



}
