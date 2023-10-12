package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class WarmUpTask {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        try {
            driver.manage().window().maximize();
            driver.get("https://en.wikipedia.org/wiki/Main_Page");
            driver.findElement(By.linkText("Log in")).click();
            String expectedUserName = "Duotech2023";

            driver.findElement(By.name("wpName")).sendKeys(expectedUserName, Keys.TAB, "duotech$2023", Keys.ENTER);
            // driver.findElement(By.name("wpPassword")).sendKeys("duotech$2023");
            //  driver.findElement(By.name("wploginattempt")).click();
            String actualUsername = driver.findElement(By.linkText(expectedUserName)).getText();
            Assert.assertEquals(actualUsername, expectedUserName);
            String expectedSearchTerm = "Galileo Galilei";
            driver.findElement(By.name("search")).sendKeys(expectedSearchTerm, Keys.ENTER);
            String actualSearchTerm = driver.findElement(By.id("firstHeading")).getText();

            Assert.assertEquals(actualUsername, expectedSearchTerm);

            driver.findElement(By.id("vector-user-links-dropdown-checkbox")).click();
            Thread.sleep(1000);
            driver.findElement(By.linkText("Log out")).click();

            WebElement logOutHeader = driver.findElement(By.id("firstHeading"));

            Assert.assertTrue(logOutHeader.isDisplayed());

        } finally {


            driver.quit();
        }

    }
}