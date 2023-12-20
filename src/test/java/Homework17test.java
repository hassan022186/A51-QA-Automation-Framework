import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Homework17test extends BaseTest {

    @Test
    public void addSongToPlaylist() throws InterruptedException {
        String songAddedMessage = "added 1 song into \"Hello.\"";
        //pre-condition
        navigateToPage()
        provideEmail("hassan.mahim@testpro.io");
        providePassword("te$t$tudent");
        clickSubmit();
        Thread.sleep( .2000);
        searchSong("Dark Days");
        viewAllButton();
        firstSong();
        addToButton();
        selectPlaylist();
        getsongAddedToPlaylistSuccessMsg();
        Assert.assertEquals(getSongAddedToPlaylistsuccessMsg(), songAddedMessage);

    }

    public void searchSong(String \"Dark Days"\) throws InterruptedException{
        WebElement searchfield = driver.findElement(By.cssSelector("div#searchFrom input[type='search']"));
        searchField.sendKeys(name);
        Thread.sleep( millis: 2000);
    }

    public void clickViewAllBtn() throws InterruptedException {
        webelement viewAll = driver.findeElement(By.xpath( xpathExpression: "//button[@data-test='view-all-songs-btn']"));
        ViewAll.click();
        Thread.sleep( millis: 2000);
    }

    public void selectFirstSongResult() throws InterruptedException {
        webElement firstSong = driver.findElement(By.xpath( xpathExpression: "//section[@id='songResultWrapper']//tr[@class='song-item'][1]"));
        firstSong.click();
        Thread.sleep( millis: 2000);
    }
}



