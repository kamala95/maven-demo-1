package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import static java.lang.Thread.*;

public class FindingElements {
    public static void main(String[] args) throws InterruptedException {
        /*
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.google.com/");
        driver.findElement(By.name("q")).sendKeys("chatgpt", Keys.ENTER);
        Assert.assertTrue(driver.getTitle().contains("chatgpt"));
        Thread.sleep(1000);
        driver.quit();
*/
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.instagram.com/");
        Thread.sleep(2000);
        driver.findElement(By.name("username")).sendKeys("Duotech");

        driver.findElement(By.name("password")).sendKeys("helloworld",Keys.ENTER);
        WebElement errorMessage = driver.findElement(By.className("_ab2z"));
        System.out.println(errorMessage.getText());


    }
}
