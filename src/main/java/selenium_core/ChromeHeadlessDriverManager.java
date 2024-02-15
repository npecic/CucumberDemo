package selenium_core;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeHeadlessDriverManager extends DriverManager{

    public void createWebDriver(String version) {
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver"+version+".exe");
        ChromeOptions options = new ChromeOptions();
//        options.addArguments("start-maximized");
        options.addArguments(("--headless"));
        driver = new ChromeDriver(options);
    }
}
