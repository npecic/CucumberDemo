package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;

public class CucumberSteps extends BaseSteps {

    final String BROWSER = Reporter.getCurrentTestResult().getTestContext().getCurrentXmlTest().getParameter("BROWSER");
    final String BROWSER_VERSION = Reporter.getCurrentTestResult().getTestContext().getCurrentXmlTest().getParameter("BROWSER_VERSION");
    final String WAIT = Reporter.getCurrentTestResult().getTestContext().getCurrentXmlTest().getParameter("WAIT");


    @Before
    public void cucumberBefore(){
        baseSetUP(BROWSER,BROWSER_VERSION, Integer.parseInt(WAIT));
    }

    @After
    public void cucumberAfter()   {
        baseTearDown();
    }

    @Given("a user is on google web page")
    public void aUserIsOnGoogleWebPage() {
        driver.get("http://www.google.com");

    }

    @When("a user types in hello in the search field")
    public void aUserTypesInHelloInTheSearchField() {

        driver.findElement(By.cssSelector("#APjFqb")).sendKeys("hello");
    }

    @And("presses search button")
    public void pressesSearchButton() {

        driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']//input[@name='btnK']")).click();
    }

    @Then("search result page should be shown")
    public void searchResultPageShouldBeShown() {
        Assert.assertTrue(driver.getCurrentUrl().contains("search?q=hello"));

    }
}
