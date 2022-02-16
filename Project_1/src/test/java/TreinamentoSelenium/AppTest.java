package TreinamentoSelenium;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

/**
 * Unit test for simple App.
 */
public class AppTest
{
    /**
     * Rigorous Test :-)
     */


    @Test
    public void helloWorld()
    {
        System.setProperty("webdriver.chrome.driver","C:\\Base2Camp\\Project_1\\src\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.navigate().to("http://google.com");

        Assert.assertEquals("Google", driver.getTitle());


        driver.quit();
    }

    @Test
    public void training(){

        System.setProperty("webdriver.chrome.driver","C:\\Base2Camp\\Project_1\\src\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //Navigating to url
        driver.navigate().to("https://wcaquino.me/cypress/componentes.html");

        //Should click button by id buttonSimple
        WebElement element_clique_me = driver.findElement(By.id("buttonSimple"));
        element_clique_me.click();

        //Should have value "Obrigado"
        Assert.assertEquals("Obrigado!", element_clique_me.getAttribute("value"));

        //Should click bytton by id buttonLazy
        WebElement element_clique_zzz = driver.findElement(By.id("buttonLazy"));
        element_clique_zzz.click();

        //Should wait it to change and assert
        Boolean wait = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.attributeToBe(element_clique_zzz, "value", "zZz ZzZ!"));

        //Should assert if last statement have changed correctly
        Assert.assertTrue(wait);

    }


}

