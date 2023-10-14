import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class TestCaseAutomationWithAsurtion {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
       // String expectedUrl = "https://www.google.com/";
        //String actualUrl = driver.getCurrentUrl();

        //Assert.assertEquals(driver.getCurrentUrl(),"https://www.google.com/");

        Assert.assertEquals(driver.getTitle(),"Google");

    }
}
