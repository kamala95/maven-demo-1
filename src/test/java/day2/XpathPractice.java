package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;

public class XpathPractice {
        public static void main(String[] args)  {
            WebDriver driver = null;

                driver = new ChromeDriver();

                driver.manage().window().maximize();
                driver.get("https://www.imdb.com");
                driver.findElement(By.xpath("//span[.='Sign In']")).click();
                driver.findElement(By.xpath("//span[.='Sign in with IMDb']")).click();
                driver.findElement(By.xpath("//input[@maxlength = '128']")).sendKeys("dtacademyb12@gmail.com");
                driver.findElement(By.xpath("//input[@maxlength = '1024']")).sendKeys("duotech$2023");
                driver.findElement(By.xpath("//input[@type= 'submit'] [@aria-labelledby ='a-autoid-0-announce']")).click();

                WebElement userElement = driver.findElement(By.xpath("//label[@class='ipc-btn ipc-btn--single-padding ipc-btn--center-align-content ipc-btn--default-height ipc-btn--core-baseAlt ipc-btn--theme-baseAlt ipc-btn--on-textPrimary ipc-text-button navbar__flyout__text-button-after-mobile navbar__user-menu-toggle__button']"));

                Assert.assertTrue(userElement.isDisplayed());

                String expectedTitle = "The Shawshank Redemption";
                driver.findElement(By.xpath("//div[@id='react-autowhatever-navSuggestionSearch']//preceding-sibling::input")).sendKeys("The Shawshank Redemption",Keys.ENTER);


                List<WebElement> elements = driver.findElements(By.xpath("//section[@data-testid='find-results-section-title']//a[@class='ipc-metadata-list-summary-item__t']"));
                elements.get(0).click();
                Assert.assertEquals(driver.findElement(By.xpath("//h1[@data-testid='hero__pageTitle']//span")).getText(),expectedTitle);
                Assert.assertEquals(driver.findElement(By.xpath("(//a[@class='ipc-link ipc-link--baseAlt ipc-link--inherit-color'])[6]")).getText(),"1994");
               // Thread.sleep(1000);
                driver.quit();







        }
}
