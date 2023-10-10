import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class TestCaseAutomationDemoWithAssertions {
    public static void main(String[] args) {

        Assert.assertEquals("","");


        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
       // Assert.assertEquals(driver.getCurrentUrl(),"https://www.google.com/");

        Assert.assertEquals(driver.getTitle(),"Google");




        /*
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
          driver.close();

         */
    }
}
