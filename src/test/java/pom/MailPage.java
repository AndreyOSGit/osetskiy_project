package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class MailPage extends BasePage
{
    @FindBy(css = "form[name = \"aform\"] .frm")
    protected List<WebElement> mailsListFrom;

    @FindBy(css = "form[name = \"aform\"] .attr input")
    protected List<WebElement> mailListCheckBox;

    @FindBy(css = "div.Right i.m")
    protected List<WebElement> mailListReadCheck;

    @FindBy(css = "div ul.list_underlined li:nth-of-type(1)  a")
    protected WebElement inboxButton;

    public void clickCreateMail() {

        createMail.click();
    }

    @FindBy(css = ".make_message a")
    protected WebElement createMail;

    @FindBy(css = ".sn_menu_title")
    protected WebElement accountName;

    public void showMeInbox() throws InterruptedException {
        inboxButton.click();
    }
    public void goToCreateMail()
    {
        createMail.click();
    }

    public void openLastMailFrom(String name)
    {
        for(WebElement mailsListFrom : mailsListFrom)
        {
            if (
            mailsListFrom.getText().equals(name)
            )
            {
                mailsListFrom.click();
                break;
            }
        }

//        for(WebElement mailListCheckBox : mailListCheckBox){
//            mailListCheckBox.getAttribute("onclick").equals("I_Mbox.ctrlMarkRead(this);");
//        }
    }
    public String getAccountName()
    {

    return accountName.getText();
    }

}
