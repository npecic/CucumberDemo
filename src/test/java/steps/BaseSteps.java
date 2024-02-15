package steps;

import excel_core.GetExcelData;
import io.qameta.allure.Allure;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import selenium_core.DriverManager;
import selenium_core.DriverManagerFactory;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;


    public class BaseSteps {


        WebDriver driver;
        DriverManager driverManager;

        public void baseSetUP(String browser, String version, int wait){
            driverManager = DriverManagerFactory.getDriverManager(browser);
            driver = driverManager.getWebDriver(version);
            driver.manage().timeouts().implicitlyWait(wait, TimeUnit.SECONDS);
        }

        public void baseTearDown() {
            driverManager.quit();
        }

    }




