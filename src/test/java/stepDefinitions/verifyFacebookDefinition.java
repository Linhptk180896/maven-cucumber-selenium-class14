package stepDefinitions;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

@RunWith(Cucumber.class)
public class verifyFacebookDefinition {
    WebDriver driver;

    @Given("^User open facebook application$")
    public void user_open_facebook_application()  {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();


    }

    @Then("^Verify email textbox is displayed$")
    public void verify_email_textbox_is_displayed()  {
        Assert.assertTrue(driver.findElement(By.xpath("//input[@id='email']")).isDisplayed());
    }

    @And("^Verify password textbox is displayed$")
    public void verify_password_textbox_is_displayed()  {
        Assert.assertTrue(driver.findElement(By.xpath("//input[@id='pass']")).isDisplayed());

    }


    @And("^user input to username$")
    public void userInputToUsername() {
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("layngo10791@gmail.com");
    }
    @And("^user input to password$")
    public void userInputToPassword() {
            driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("123456");

        }

    @And("^user input to username which is \"([^\"]*)\"$")
    public void userInputToUsernameWhichIs(String username)  {
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys(username);

    }

    @And("^user input to password which is \"([^\"]*)\"$")
    public void userInputToPasswordWhichIs(String password)  {
        driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(password);
    }

    @And("^user input to username which is ([^\"]*)$")
    public void userInputToUsername(String username) {
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys(username);

    }

    @And("^user input to password which is ([^\"]*)$")
    public void userInputToPassword(String password) {
        driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(password);

    }

    @And("^user input to username which is \"([^\"]*)\" and user input to password which is \"([^\"]*)\"$")
    public void userInputToUsernameWhichIsAndUserInputToPasswordWhichIs(String username, String password)  {
        driver.findElement(By.xpath("//input[@id='email']")).clear();
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys(username);
        driver.findElement(By.xpath("//input[@id='pass']")).clear();
        driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(password);


    }

    @When("^user clicks on button submit$")
    public void userClicksOnButtonSubmit() {

    }

    @Then("^Verify submitted info is displayed$")
    public void verifySubmittedInfoIsDisplayed() {
        driver.findElement(By.xpath("//div[@class='x9f619 x1n2onr6 x1ja2u2z x78zum5 xdt5ytf x2lah0s x193iq5w x1cy8zhl x1gslohp x12nagc xzboxd6 x14l7nz5']//span[contains(text(),'Khánh Linh Linh')]")).isDisplayed();
    }

    @And("^user input to username and password$")
    public void userInputToUsernameAndPassword(String username, String password) {
        driver.findElement(By.xpath("//input[@id='email']")).clear();
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys(username);
        driver.findElement(By.xpath("//input[@id='pass']")).clear();
        driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(password);

    }

    @And("^close application$")
    public void closeApplication() {
        driver.quit();
    }


    @And("^user input to username and input password$")
    public void userInputToUsernameAndInputPassword(DataTable table) {
    }
}
