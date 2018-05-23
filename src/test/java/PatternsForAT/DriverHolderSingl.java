//package PatternsForAT;
//
//import org.openqa.selenium.WebDriver;
//
//
//public class DriverHolderSingl
//{
//    private static WebDriver instance = null;
//
//    public static void setInstance(WebDriver instance) {
//        DriverHolderSingl.instance = instance;
//    }
//
//    public static synchronized WebDriver getInstance() {
//        try {
//            if (instance == null) {
////                instance = WebdriverConfig.webDriver();
//            }
//        }catch(Exception e){
//            e.printStackTrace();
//        }
//        return instance;
//    }
//
//    public static synchronized void restart() {
//        try {
//            if (instance != null) {
//                instance.close();
////                instance = WebdriverConfig.webDriver();
//            }
//        }catch(Exception e){
//            e.printStackTrace();
//        }
//    }
//
//}