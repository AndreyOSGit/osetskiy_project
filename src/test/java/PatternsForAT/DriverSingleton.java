package PatternsForAT;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.DriverManager;

//Based on Thread Safe Singleton - https://www.journaldev.com/1377/java-singleton-design-pattern-best-practices-examples
// Singlton driver create if needed store
public class DriverSingleton
{
    // static DriverSingleton instance = null;
    private static WebDriver driver;
//    private static WrappedWebdriver wrappedWebdriver;
    public DriverSingleton()
    {
        System.setProperty("webdriver.chrome.driver", "src\\drivers\\chromedriver.exe");
        WebDriver teporaryDriver = new ChromeDriver();
        driver = new WrappedWebdriver(teporaryDriver) ;
    }

    public static synchronized WebDriver getDriver()
    {
        return driver;
    }

//
//    public static synchronized DriverSingleton getInstance() // синхронизированный метод создания драйвера - чтобы в разных потоках использовался один и тот же драйвер
//    {
//        if(instance == null ) {
//            instance = new DriverSingleton();
//        }
//        return instance;
//    }

}
