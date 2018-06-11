package pom;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CreateMailPage extends BasePage
{

    @FindBy(css = "#to")
    protected WebElement inputAdres;

    @FindBy(css = "input[name=\"subject\"]")
    protected WebElement inputSubject;

    @FindBy(css = "body.Smile")
    protected WebElement inputText;

    @FindBy(css = "input[name=\"send\"]")
    protected WebElement buttonSend;



//    @FindBy(css = "")
//    protected WebElement buttonUndo;
//
//    @FindBy(css = "")
//    protected WebElement buttonSave;

    public void writeImail(String Adres, String Subject, String Text)
    {
        inputAdres.sendKeys(Adres);
        inputSubject.sendKeys(Subject+ Keys.ENTER);
//        inputText.click();
//        inputText.sendKeys(Text);
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
