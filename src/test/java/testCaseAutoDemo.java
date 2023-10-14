import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class testCaseAutoDemo {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        if(driver.getCurrentUrl().equals("https://www.google.com/")){
            System.out.println("Url test passed");
        }else {
            System.out.println("Test faild");
        }
if(driver.getTitle().equals("Google")){
            System.out.println("Title Test Passed");

            }else {

    System.out.println("Title Test faild");
}
driver.quit();
    }
}
