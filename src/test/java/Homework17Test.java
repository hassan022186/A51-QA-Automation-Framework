import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class homework17 extends BaseTest {

    @Test
    public void addSongToPlaylist() throws InterruptedException {
        String songAddedMessage = "added 1 song into \"Hello.\"";
        //pre-condition
        navigateToPage();
        provideEmail("hassan.mahim@testpro.io");
        providePassword("YOUSSEf2017$");
        clickSubmit();
        Thread.sleep(2000);
        searchSong("Dark Days");
        clickViewAllBtn();
        selectFirstSongResult();
        clickAddToBtn();
        choosePlaylist();
        Assert.assertEquals(getAddToPlaylistSuccessMsg(), expectedSongAddedMessage);

    }

    public void searchSong(String name) throws InterruptedException {
        WebElement searchField = driver.findElement(By.cssSelector("div#searchFrom input[type='search']"));
        searchField.sendKeys(name);
        Thread.sleep(2000);
    }

    public void clickViewAllBtn() throws InterruptedException {
        WebElement viewAll = driver.findElement(By.xpath("//button[@data-test='view-all-songs-btn']"));
        viewAll.click();
        Thread.sleep(2000);
    }

    public void selectFirstSongResult() throws InterruptedException {
        WebElement firstSong = driver.findElement(By.xpath("//section[@id='songResultWrapper']//tr[@class='song-item'][1]"));
        firstSong.click();
        Thread.sleep(2000);
    }

    public void clickAddToBtn() throws InterruptedException {
        WebElement addToButton = driver.findElement(By.xpath("//section[@id='songResultsWrapper']//button[@data-test='add-to-btn']"));
        addToButton.click();
        Thread.sleep(2000);
    }

    public void choosePlaylist() throws InterruptedException {
        // we created a playlist named "Hello People"
        WebElement playlist = driver.findElement(By.xpath(
                "//section[@id='songResultsWrapper']//li[contains(text(),'Hello People')]"));
        playlist.click();
        Thread.sleep(2000);
    }

    public String getAddToPlaylistSuccessMsg() {
        WebElement notification = driver.findElement(By.cssSelector("div.success.show"));
        return notification.getText();
    }


}


