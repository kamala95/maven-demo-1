package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;

public class FindElementsVsFindElement {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = null;
        try{
            driver = new ChromeDriver();

            driver.manage().window().maximize();
            driver.get("https://en.wikipedia.org/wiki/Main_Page");
       // driver.findElement(By.tagName("iframe")).getText();
            List<WebElement> list = driver.findElements(By.className("hello"));
            if(list.isEmpty()){
                throw new RuntimeException("No elements found");

            }
            for(WebElement webElement: list){
                Assert.assertTrue(webElement.isDisplayed());
            }


        }finally {
            Thread.sleep(1000);
            driver.quit();
        }
    }
    }

