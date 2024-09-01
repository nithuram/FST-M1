package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity21 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://v1.training-support.net/selenium/tab-opener");
        System.out.println(driver.getTitle());
        System.out.println("Current tab: " + driver.getWindowHandle());
        driver.findElement(By.id("launcher")).click();
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));
        System.out.println(driver.getWindowHandles());
        for(String handle: driver.getWindowHandles()) {
            driver.switchTo().window(handle);
        }
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("content")));
        System.out.println(driver.getTitle());
        System.out.println("next tab: " + driver.getWindowHandle());
        System.out.println(driver.findElement(By.className("content")).getText());
        driver.quit();
    }
}
