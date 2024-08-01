import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Homework18  extends BaseTest{
    @Test(priority = 1, description = "play a song and validate that a song is playing")
    public void playSong() throws InterruptedException {
     logIn("hassan.mahim@testpro.io","YOUSSEf2017$");
      enterAllSongs();
      selectSong();
      enterButtonPlaySong();
        Assert.assertTrue(isDisplayedPlayingSong());
        }
}



