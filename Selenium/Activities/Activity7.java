package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity7 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://v1.training-support.net/selenium/drag-drop");
        System.out.println(driver.getTitle());
        WebElement football = driver.findElement(By.id("draggable"));
        WebElement dropZone1 = driver.findElement(By.id("droppable"));
        WebElement dropZone2 = driver.findElement(By.id("dropzone2"));

        Actions builder = new Actions(driver);

        builder.doubleClick(football).dragAndDrop(football,dropZone1).pause(3000).build().perform();
        String dropZone1Verify = dropZone1.findElement(By.tagName("p")).getText();
        if(dropZone1Verify.equals("Dropped!")) {
            System.out.println("ball has dropped into dropzone1");
        }

        builder.clickAndHold(football).moveToElement(dropZone2).release().build().perform();
        String dropZone2Verify = driver.findElement(By.tagName("p")).getText();
        if(dropZone2Verify.equals("Dropped!")){
            System.out.println("ball has dropped into dropzone2");
        }
        driver.quit();
    }
}
