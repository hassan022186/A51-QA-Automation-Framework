
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Homework18 {
    @Test
    public void playSong() {
        System.setProperty("webdriver.chrome.driver","/Users/hassanmahim/Downloads/chromedriver-mac-arm64/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://qa.koel.app/#!/profile");
        driver.quit();
    }
}
