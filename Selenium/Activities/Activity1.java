package Activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity1 {
    public static void main(String[] args) {

        //get firefox driver
        WebDriverManager.firefoxdriver().setup();

        //create driver object
        WebDriver driver = new FirefoxDriver();

        //open the page
        driver.get("https://training-support.net/");

        //print the title of the page
        String PageTitle = driver.getTitle();
        System.out.println(PageTitle);

        //find and interact with the elements on the page
        driver.findElement(By.linkText("About Us")).click();

        //print the title of the new page
        String newPageTitle = driver.getTitle();
        System.out.println(newPageTitle);

        //close the browser
        driver.quit();
    }
}

