package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity2 {
    WebDriver driver;

    @BeforeClass
    public void beforeMethos() {
        driver = new FirefoxDriver();
        driver.get("https://v1.training-support.net/selenium/target-practice");
    }

    @Test
    public void testCase1(){
        String title=driver.getTitle();
        Assert.assertEquals(title,"Target Practice");
        Reporter.log("testcase 1 passed");
    }

    @Test
    public void testCase2(){
        WebElement blackButton = driver.findElement(By.cssSelector("button.black"));
        Assert.assertTrue(blackButton.isDisplayed());
        Assert.assertEquals(blackButton.getText(), "black");
        Reporter.log("testcase2");
    }

    @Test(enabled = false)
    public void testCase3(){
        System.out.println("hello");
        Reporter.log("testcase3");
    }

    @Test
    public void testCase4(){
        throw new SkipException("Skipping test case");

    }

    @AfterClass
    public void afterMethos(){
        driver.close();
    }
}
