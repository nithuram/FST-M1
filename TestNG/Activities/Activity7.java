package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Activity7 {
    WebDriver driver;
    WebDriverWait wait;

    @BeforeClass
    public void beforeMethod() {
        driver = new FirefoxDriver();
        //wait = new WebDriverWait(driver,10);
        driver.get("https://v1.training-support.net/selenium/login-form");
    }

    @DataProvider(name="Authentication")
    public Object[][] credentials(){
        return new Object[][]{
                {"admin","password","Welcome Back, admin"},
                {"admin12","password","Invalid Credentials"},
                {"       ","--------","Invalid Credentials"}
        };

    }
    @Test(dataProvider = "Authentication")
    public void loginTest(String username,String password,String message){
       WebElement usernameField =  driver.findElement(By.id("username"));
        WebElement passwordField = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.cssSelector("button[type='submit']"));

        usernameField.clear();
        passwordField.clear();

        usernameField.sendKeys(username);
        passwordField.sendKeys(password);
        loginButton.click();

        String loginmsg = driver.findElement(By.id("action-confirmation")).getText();
        Assert.assertEquals(loginmsg,message);

    }

    @AfterClass
    public void afterMethod(){
        driver.close();
    }

}
