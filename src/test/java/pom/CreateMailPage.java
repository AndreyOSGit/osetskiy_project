package pom;

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

    @FindBy(css = " html body div.body_container div.Body div.Cols_80_20.message_container div.Left div.text_editor_browser textarea#text ")
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
        inputSubject.sendKeys(Subject);
//        inputText.click();
        inputText.sendKeys(Text);
    }

    public  void sendEmail()
    {
        buttonSend.click();
    }

    public CreateMailPage()
    {
            // put here some initiazization
    }



}
