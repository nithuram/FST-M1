package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity5 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://v1.training-support.net/selenium/input-events");
        System.out.println(driver.getTitle());
        Actions builder = new Actions(driver);
        builder.click().pause(2000).build().perform();
        System.out.println(driver.findElement(By.className("active")).getText());
        builder.doubleClick().pause(2000).perform();
        System.out.println(driver.findElement(By.className("active")).getText());
        builder.contextClick().pause(2000).build().perform();
        System.out.println(driver.findElement(By.className("active")).getText());

        driver.quit();
    }
}
