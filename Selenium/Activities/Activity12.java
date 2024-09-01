package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity12 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://v1.training-support.net/selenium/dynamic-controls");
        System.out.println(driver.getTitle());
        WebElement text = driver.findElement(By.id("input-text"));
        System.out.println("text field is enabled:"+text.isEnabled());
        driver.findElement(By.id("toggleInput")).click();
        System.out.println("text field is enabled:"+text.isEnabled());
        driver.quit();
    }
}
