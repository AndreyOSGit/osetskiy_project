package PatternsForAT;

import org.openqa.selenium.WebDriver;

import java.util.HashMap;
import java.util.Map;

// using only to store drivers or they instances
public class DriverHolderMulti
{
    private static Map<String, WebDriver> drivers = new HashMap<String, WebDriver>();
    public DriverHolderMulti(WebDriver driver)
    {

    }
    public void putDriverinHolder(WebDriver driver)
    {
        drivers.keySet();
    }
    public WebDriver getWebdriverByHashKey(String hashKey)
    {
        WebDriver storeDriver = null;
        storeDriver = drivers.get(hashKey);
        return storeDriver;
    }
    public  void cleareDriverByHash(String hashKey)
    {
        if (drivers.size() > 0)
        {
//            drivers.;
        }
    }

}
