import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class seleniumDemo {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com/");
        String curentUrl = driver.getCurrentUrl();
        System.out.println(curentUrl);
        String title = driver.getTitle();
        System.out.println(title);
        String pageSource= driver.getPageSource();
        System.out.println(pageSource);
driver.close();
    }
}
