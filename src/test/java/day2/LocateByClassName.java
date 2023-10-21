package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class LocateByClassName {
    public static void main(String[] args) throws InterruptedException{
        WebDriver driver = null;
        try{
            driver = new ChromeDriver();

            driver.manage().window().maximize();
            driver.get("https://en.wikipedia.org/wiki/Main_Page");
            System.out.println(driver.findElement(By.className("vector-tab-noicon")).getText());
            List<WebElement> elements = driver.findElements(By.className("vector-tab-noicon"));
            for (WebElement element :elements) {
                System.out.println(element.getText());
            }
            //driver.findElement(By.linkText("anyone can edit")).click();
            // driver.findElement(By.linkText("Three earthquakes")).click();
            // driver.findElement(By.partialLinkText("can edit")).click();
            System.out.println(driver.findElement(By.tagName("h2")).getText());
            List<WebElement> links = driver.findElements(By.tagName("a"));
            links.forEach(s -> System.out.println(s.getText()));
            System.out.println("This page has " + links.size() + " links.");


        }finally {
            Thread.sleep(1000);
            driver.quit();
        }
    }
}
