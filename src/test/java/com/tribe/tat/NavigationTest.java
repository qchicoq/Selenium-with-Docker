package com.tribe.tat;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class NavigationTest
{


    @DataProvider(name = "getData")
    public Object [][] getData()
    {
        Object [][] data = new Object[][]{{"http://google.co.uk"}, {"http://google.ca"}};
        return data;
    }


   @Test(dataProvider = "getData")
    public void CanNavigateToSite ( String site )
    {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to(site);
        Assert.assertTrue(driver.getTitle().toLowerCase().contains("google"));
        driver.quit();
    }
    @Test(dataProvider = "getData")
    public void CanNavigateToSiteTwo( String site )
    {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to(site);
        Assert.assertTrue(driver.getTitle().toLowerCase().contains("google"));
        driver.quit();
    }
    @Test(dataProvider = "getData")
    public void CanNavigateToSiteThree( String site )
    {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to(site);
        Assert.assertTrue(driver.getTitle().toLowerCase().contains("google"));
        driver.quit();
    }
    @Test(dataProvider = "getData")
    public void CanNavigateToSiteFour( String site )
    {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to(site);
        Assert.assertTrue(driver.getTitle().toLowerCase().contains("google"));
        driver.quit();
    }

}
