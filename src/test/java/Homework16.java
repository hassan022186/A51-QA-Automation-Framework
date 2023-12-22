import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class Homework16 {
    @Test
    public void registrationNavigation() {
        //Added Chrome Options argument below to fix websocket error
         ChromeOptions option = new ChromeOptions();
         option.addArguments("--remote-allow-origins=*");

         WebDriver driver = new ChromeDriver(option);
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

         String url ="https://qa.koel.app/" ;
         driver.get(url);
         WebElement registrationlink = driver.findElement(By.cssSelector("[href='registration']"));
         registrationlink.click();

         String registrationUrl = "https://qa.koel.app/registration";
         Assert.assertEquals(driver.getCurrentUrl(),registrationUrl);
         driver.quit();
    }
}
