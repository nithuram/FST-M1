package stepDefinitions;

import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginSteps extends BaseClass {
    @BeforeAll
    public static void setup(){
        driver = new FirefoxDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @AfterAll
    public static void closeBrowser(){
        driver.quit();
    }
    @Given("^the user is on the login page$")
    public void openPage(){
        driver.get("https://v1.training-support.net/selenium/login-form");
        //Assert page title
        Assertions.assertEquals("Login Form", driver.getTitle());
    }
    @When("^the user enters username and password$")
    public void enterCredentials() {
        driver.findElement(By.id("username")).sendKeys("admin");
        driver.findElement(By.id("password")).sendKeys("password");
    }
    @When("the user enters {string} and {string}")
    public void enterCredentialsFromInputs(String username, String password) {
        driver.findElement(By.id("username")).clear();
        driver.findElement(By.id("password")).clear();

        driver.findElement(By.id("username")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
    }

    @When("User enters {string} and {string}")
    public void user_enters_and(String username, String password) throws Throwable {
        //Enter username from Feature file
        driver.findElement(By.id("username")).sendKeys(username);
        //Enter password from Feature file
        driver.findElement(By.id("password")).sendKeys(password);
        //Click Login
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }

    @Then("^Read the page title and confirmation message$")
    public void readTitleAndHeading() {
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("action-confirmation")));

        //Read the page title and heading
        String pageTitle = driver.getTitle();
        String confirmMessage = driver.findElement(By.id("action-confirmation")).getText();

        //Print the page title and heading
        System.out.println("Page title is: " + pageTitle);
        System.out.println("Login message is: " + confirmMessage);

        if(confirmMessage.contains("admin")) {
            Assert.assertEquals(confirmMessage, "Welcome Back, admin");
        } else {
            Assert.assertEquals(confirmMessage, "Invalid Credentials");
        }
    }


    @And("^click on the submit button$")
    public void clickSubmit(){
        driver.findElement(By.xpath("//button[@type='submit']")).click();

    }
    @Then("^get the confirmation message and verify message$")
    public void confirmMassage(){
        String message = driver.findElement(By.id("action-confirmation")).getText();
        Assertions.assertEquals("Welcome Back, admin",message);
    }
    @Then("get the confirmation message and verify message as {string}")
    public void confirmMassageAsInput(String expectedMessage){
        String message = driver.findElement(By.id("action-confirmation")).getText();
        Assertions.assertEquals(expectedMessage,message);

    }

}
