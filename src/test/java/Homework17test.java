import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class homework17test extends BaseTest {

    @Test
    public void addSongToPlaylist() throws InterruptedException {
        String songAddedMessage = "added 1 song into \"Hello.\"";
        //pre-condition
        navigateToPage();https://qa.koel.app/
        provideEmail("hassan.mahim@testpro.io");
        providePassword("te$t$tudent");
        clickSubmit();
        Thread.sleep(.2000);
        searchSong("Dark Days");
        viewAllButton();
        firstSong();
        addToButton();
        selectPlaylisT();
        getsongAddedToPlaylistSuccessMsg();
        Assert.assertEquals(getSongAddedToPlaylistsuccessMsg(), songAddedMessage);

    }

    public void searchSong(String name) throws InterruptedException{
        WebElement searchField = driver.findElement(By.cssSelector("div#searchFrom input[type='search']"));
        searchField.sendKeys(name);
        Thread.sleep( 2000);
    }

    public void clickViewAllBtn() throws InterruptedException {
        WebElement viewAll = driver.findeElement(By.xpath( "//button[@data-test='view-all-songs-btn']"));
        ViewAll.click();
        Thread.sleep( 2000);
    }

    public void selectFirstSongResult() throws InterruptedException {
        WebElement firstSong = driver.findElement(By.xpath(  "//section[@id='songResultWrapper']//tr[@class='song-item'][1]"));
        firstSong.click();
        Thread.sleep(  2000);
    }
    public void clickAddToBtn() throws InterruptedException {
        WebElement addToButton = driver.findElement(By.xpath( "//section[@id='songResultswrapper']//button[@data-test='add-to-btn']"));
        addToButton.click();
        thread.sleep(2000);
    }

    public void choosePlaylist () throws InterruptedException {
        // we created a playlist named "Hello"
        WebElement playlist = driver.findElement(By.xpath(
        "//section[@id='songResultswrapper']//li[contains(text(),Hello people')]"));
        playlist.click();
        thread.sleep(2000);
    }

   public String getAddToPlaylistSuccessMsg() {
        WebElement notification = driver.dindElement(By.cssSelector("div.success.show"));
        return notification.getText();
   }


}


