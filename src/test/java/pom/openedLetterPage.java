package pom;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class openedLetterPage extends BasePage
{

    @FindBy(css = "li.current a")
    protected WebElement letterMailTitle;

    @FindBy(css = "li.current a")
    protected WebElement letterMailText;

    public void seeMailWithTitleAndText(String Title, String Text)
    {
        Assert.assertEquals(Title, letterMailTitle.getText());
        Assert.assertEquals(Text, letterMailText.getText());
    }


}
