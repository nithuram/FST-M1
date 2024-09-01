package stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class DataTableExampleStepActivity {
    WebDriver driver;
    WebDriverWait wait;

    @Given("^User completes the requirement$")
    public void opedTodoList() {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.get("https://v1.training-support.net/selenium/todo-list");
    }

    @When("^User enters the following tasks$")
    public void enterTask(DataTable dataTable) {
        List<String> tasks = dataTable.asList();
        driver.findElement(By.xpath("//div[@class='ui red bottom attached button']")).click();
        for (String s:tasks){
            driver.findElement(By.id("taskInput")).sendKeys(s);
            driver.findElement(By.xpath("//*[@id='tasksCard']/div[1]/button")).click();
        }
    }
    @When("^User enters the following username and password$")
    public void enterTask2(DataTable dataTable) {
        List<String> tasks = dataTable.asList();
        driver.findElement(By.xpath("//div[@class='ui red bottom attached button']")).click();
        for (String s:tasks){
            driver.findElement(By.id("taskInput")).sendKeys(s);
            driver.findElement(By.xpath("//*[@id='tasksCard']/div[1]/button")).click();
        }
    }


    @Then("^Verify results$")
    public void verifyTask() {
        List<WebElement> addedElement = driver.findElements(By.xpath("//*[@id='tasksList']/div"));
        Assert.assertEquals(3,addedElement.size());
        driver.close();
    }
}
