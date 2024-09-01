package Activities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
    public class Activity9 {
        WebDriver driver;

        @BeforeClass
        public void beforeMethod() {
            driver = new FirefoxDriver();
            Reporter.log("starting test");
            //wait = new WebDriverWait(driver,10);
            driver.get("https://v1.training-support.net/selenium/javascript-alerts");
            Reporter.log("opened browser");
            Reporter.log("Page title is " + driver.getTitle() + " |");
        }
        @Test(priority = 0)
        public void simpleAlertTestCase(){
            Reporter.log("simpleAlertTestCase() started |");

            driver.findElement(By.id("simple")).click();
            Reporter.log("Simple Alert opened |");

            Alert simpleAlert = driver.switchTo().alert();
            Reporter.log("Switched foucs to alert |");

            String alertText = simpleAlert.getText();
            Reporter.log("Alert text is: " + alertText + " |");
            Assert.assertEquals("This is a JavaScript Alert!", alertText);

            simpleAlert.accept();
            Reporter.log("Alert closed");

            Reporter.log("Test case ended |");

        }
        @Test(priority = 1)
        public void confirmAlertTestCase(){
            Reporter.log("confirmAlertTestCase() started |");
            //Click the button to open a simple alert
            driver.findElement(By.id("confirm")).click();
            Reporter.log("Confirm Alert opened |");

            //Switch to alert window
            Alert confirmAlert = driver.switchTo().alert();
            Reporter.log("Switched foucs to alert |");

            //Get text in the alert box and print it
            String alertText = confirmAlert.getText();
            Reporter.log("Alert text is: " + alertText + " |");

            //Assertion
            Assert.assertEquals("This is a JavaScript Confirmation!", alertText);

            confirmAlert.accept();
            Reporter.log("Alert closed |");

            Reporter.log("Test case ended |");

        }
        @Test(priority = 2)
        public void promptAlertTestCase(){
            Reporter.log("promptAlertTestCase started");
            driver.findElement(By.id("prompt")).click();
            Reporter.log("Prompt alert opened");
            Alert promptAlert=driver.switchTo().alert();
            Reporter.log("Switched focus to alert");
            String alertText = promptAlert.getText();
            Reporter.log("Alert text is: " + alertText + " |");
            promptAlert.sendKeys("awesome!");
            Reporter.log("text is entered in the alert");
            Assert.assertEquals("This is a JavaScript Prompt!", alertText);

            promptAlert.accept();
            Reporter.log("Alert closed |");

            Reporter.log("Test case ended |");
        }

        @AfterClass
        public void afterMethod(){
            driver.close();
        }
    }
