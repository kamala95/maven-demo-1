package day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCaseAutomationDemo {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        if (driver.getCurrentUrl().equals("https://www.google.com/")) {
            System.out.println("Url test PASS");
        } else {
            System.out.println("Url test FAIL");
        }
        if (driver.getTitle().equals("Google")) {
            System.out.println("Title test PASS");
        } else {
            System.out.println("Title test FAIL");
        }
        driver.quit();
     //   driver.close();
    }
}


