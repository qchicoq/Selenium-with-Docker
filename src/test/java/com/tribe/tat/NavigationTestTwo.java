package com.tribe.tat;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class NavigationTestTwo
{

   @Test
    public void CanNavigateToSite(  )
    {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("http://google.com");
        Assert.assertTrue(driver.getTitle().toLowerCase().contains("google"));
        driver.quit();
    }
    @Test
    public void CanNavigateToSiteTwo(  )
    {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("http://google.com");
        Assert.assertTrue(driver.getTitle().toLowerCase().contains("google"));
        driver.quit();
    }
    @Test
    public void CanNavigateToSiteThree(  )
    {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("http://google.com");
        Assert.assertTrue(driver.getTitle().toLowerCase().contains("google"));
        driver.quit();
    }
    @Test
    public void CanNavigateToSiteFour(  )
    {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("http://google.com");
        Assert.assertTrue(driver.getTitle().toLowerCase().contains("google"));
        driver.quit();
    }

}
