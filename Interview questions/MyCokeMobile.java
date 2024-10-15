package TestNGVideos;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v121.browser.model.WindowState;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.time.Duration;
import java.util.concurrent.ThreadFactory;


public class MyCokeMobile {

    @Test
    void Login() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://nasales--nab2buat.sandbox.my.site.com/myCokeCentral/ccrz__CCPage?pageKey=LandingPage");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(By.xpath("//div[text()='Login']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='signInName']")).sendKeys("shrutishared@yopmail.com");
        driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("myCoke$77");
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,500)","");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@id='next' and @type='submit']")).click();
        WebElement dropdown = driver.findElement(By.xpath("//div[text()='Orders']"));
        dropdown.click();
        driver.findElement(By.xpath("//a[text()='Shop Products']")).click();
        driver.findElement(By.xpath("//div[@id='cartval']")).click();
        Thread.sleep(3000);
        WebElement text = driver.findElement(By.xpath("//div[text()='Help']"));
        text.isDisplayed();
        driver.findElement(By.xpath("//div[contains(text(),'shruti')]")).click();



    }

    /*
    @Test
    void AddProducts()
    {

    }

    @Test
    void Logout()
    {

    }

     */

}
