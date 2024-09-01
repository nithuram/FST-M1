package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity1 {
    WebDriver driver;

    @BeforeClass
    public void beforeMethos() {
        driver = new FirefoxDriver();
        driver.get(" https://v1.training-support.net");
        Reporter.log("Browser opened");
    }

    @Test
    public void Testcase() {
        String title = driver.getTitle();
            System.out.println(title);
            Assert.assertEquals(title,"Training Support");
        Reporter.log("login page opened");

            driver.findElement(By.id("about-link")).click();
            System.out.println("title of the new page is "+driver.getTitle());
            Assert.assertEquals(driver.getTitle(), "About Training Support");
        Reporter.log("About us link opened");

        }

    @AfterClass
    public void afterMethod(){
        Reporter.log("Browser closed");
        driver.close();
        }
    }
    