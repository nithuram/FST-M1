package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity11 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://v1.training-support.net/selenium/dynamic-controls");
        System.out.println(driver.getTitle());
        WebElement checkboxSelect = driver.findElement(By.xpath("//input[@class ='willDisappear']"));
        System.out.println("checkbox is selected:"+checkboxSelect.isSelected());
        checkboxSelect.click();
        System.out.println("checkbox is selected:"+checkboxSelect.isSelected());
        driver.quit();
    }
}
