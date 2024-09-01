package Activities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity19 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();

        driver.get("https://v1.training-support.net/selenium/javascript-alerts");
        System.out.println(driver.getTitle());
        driver.findElement(By.id("confirm")).click();
        Alert confirmationAlert = driver.switchTo().alert();
        System.out.println(confirmationAlert.getText());
        confirmationAlert.accept();

        driver.findElement(By.id("confirm")).click();
        Alert confirmationAlert1 = driver.switchTo().alert();
        System.out.println(confirmationAlert1.getText());
        confirmationAlert1.dismiss();
        driver.quit();
    }
}