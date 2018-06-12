package pom;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class openedLetterPage extends BasePage
{

    @FindBy(css = ".message_header.clear h3")
    protected WebElement letterMailTitle;

    @FindBy(css = "li.current a")
    protected WebElement letterMailText;


    public void seeMailWithTitleAndText(String Title)
    {
        Assert.assertEquals(Title, letterMailTitle.getText());

    }


}
