package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity10 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://v1.training-support.net/selenium/dynamic-controls");
        System.out.println(driver.getTitle());
        WebElement checkbox = driver.findElement(By.className("willDisappear"));
        WebElement RemoveCheckbox = driver.findElement(By.id("toggleCheckbox"));
        RemoveCheckbox.click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("willDisappear")));
        System.out.println("checkbox is displayed:"+checkbox.isDisplayed());
        RemoveCheckbox.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("willDisappear")));
        System.out.println("checkbox is displayed:"+checkbox.isDisplayed());
        WebElement checkboxSelect = driver.findElement(By.xpath("//input[@class='willDisappear']"));
        checkboxSelect.click();
        System.out.println("checkbox is selected:" + checkboxSelect.isSelected());

        driver.quit();

    }
}
