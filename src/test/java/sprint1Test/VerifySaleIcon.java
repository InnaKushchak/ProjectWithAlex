package sprint1Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifySaleIcon {
    @Test
    public void firstTest() throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://askomdch.com");
        Assert.assertEquals(driver.getTitle(),"AskOmDch – Become a Selenium automation expert!");
        driver.findElement(By.xpath("//span[@class='onsale']"));
        Thread.sleep(3000);
        driver.quit();


    }




}
