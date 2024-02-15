package selenium_core;

public class DriverManagerFactory {

    public static DriverManager getDriverManager(String type) {
        DriverManager driverManager;

        switch (type) {

            case "FIREFOX": {
                driverManager = new FirefoxDriverManager();

            }
            break;
            case "CHROME_H": {
                driverManager = new ChromeHeadlessDriverManager();

            }
            break;
            default:{
                driverManager = new ChromeDriverManager();
        //        new Exception("No such browser");
            }
            break;
        }
        return driverManager;
    }
}





