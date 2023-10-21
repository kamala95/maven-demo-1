package day3;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;
import java.util.*;

public class PracticeWarmUp {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = null;
             try{
                 driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.dice.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        String searchTerm = "SDET";
        driver.findElement(By.xpath("//input[@placeholder='Job title, skills or company']")).
                sendKeys(searchTerm, Keys.TAB, Keys.TAB, "Washington DC", Keys.ENTER);

        List<WebElement> titles = driver.findElements(By.xpath("//div[@id='searchDisplay-div']//a[@data-cy='card-title-link']"));

        Assert.assertEquals(titles.size(), 20);

        for (WebElement title : titles) {
            System.out.println(title.getText());
            Assert.assertTrue(title.getText().toLowerCase().contains(searchTerm.toLowerCase()));
        }
       ((JavascriptExecutor)driver).executeScript("arguments[0].click();",titles.get(0));

       driver.findElement(By.id("descriptionToggle")).click();

      //  String jobDescription = driver.findElement(By.id("jobDescription")).getText();
      //  System.out.println(jobDescription);





        //   String[] words = jobDescription.split("[ ,.();:\\n]");
        //   System.out.println(Arrays.toString(words));

        //Map<String,Integer> map= new TreeMap<>();
        //   for (String word:words) {
        //  word = word.toLowerCase();
        //    if(word.isBlank()) {

        //       if (!map.containsKey(word)) {
        //          map.put(word, 1);
        //     } else {
        //        map.put(word, map.get(word) + 1);
        //     }
        //    }
        //  }
        //   System.out.println(map);


    }finally{
            Thread.sleep(3000);
            driver.quit();


        }




    }
}
