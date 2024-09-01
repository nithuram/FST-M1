package Activities;

import net.bytebuddy.implementation.bytecode.ShiftLeft;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity6 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://v1.training-support.net/selenium/input-events");
        System.out.println(driver.getTitle());
        Actions builder = new Actions(driver);
        builder.sendKeys("C").build().perform();
        builder.keyDown(Keys.CONTROL).sendKeys("a").sendKeys("c").keyUp(Keys.CONTROL).build().perform();
        driver.quit();
    }
}
