package PatternsForAT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class WrappedWebdriver implements WebDriver {
    private static WebDriver singltonDriver = null;

    public WrappedWebdriver(WebDriver driver)
    {
        singltonDriver =  driver;
        int timeoutMilis = 60000;
        singltonDriver.manage().timeouts().setScriptTimeout(timeoutMilis, TimeUnit.MILLISECONDS);
        singltonDriver.manage().timeouts().pageLoadTimeout(timeoutMilis, TimeUnit.MILLISECONDS);
        singltonDriver.manage().timeouts().implicitlyWait(timeoutMilis * 3, TimeUnit.MILLISECONDS);
    }

    public void get(String url) {
        singltonDriver.get(url);
        System.out.println("I get ON " + url);
    }
    public String getCurrentUrl() {

        return null;
    }

    public String getTitle() {
        return singltonDriver.getTitle();

    }

    public List<WebElement> findElements(By by)
    {
        List<WebElement> webElements = null;
        try {
            webElements = singltonDriver.findElements(by);
        } catch (Exception e)
        {
            System.out.println();
        }
        return webElements;
    }

    public WebElement findElement(By by) {
        WebElement webElement = null;

        try {
            webElement = singltonDriver.findElement(by);
//            new WebDriverWait(singltonDriver, 10)
//                    .until(ExpectedConditions.elementToBeClickable())
        } catch (Exception e)
        {
            System.out.println();
        }
        return webElement;

//return singltonDriver.findElement(by) ;
 }

    public String getPageSource() {
        return singltonDriver.getPageSource();
    }

    public void close() {
    singltonDriver.close();
    }

    public void quit() {
    singltonDriver.quit();
    }

    public Set<String> getWindowHandles() {
        return null;
    }

    public String getWindowHandle() {
        return null;
    }

    public TargetLocator switchTo() {
        return singltonDriver.switchTo();
    }

    public Navigation navigate() {
      return singltonDriver.navigate();
    }

    public Options manage() {
       return singltonDriver.manage();
    }
    public void click(WebDriver singltonDriver, By by)
    {

        singltonDriver.findElement(by);
    }
}
