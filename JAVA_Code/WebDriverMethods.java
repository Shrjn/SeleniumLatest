package A_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.function.Function;

public class WebDriverMethods {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/register");
        // isDisplayed()
        System.out.println(driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed());
        // isEnabled()
        System.out.println(driver.findElement(By.id("small-searchterms")).isEnabled());
        // isSelected()
        System.out.println(driver.findElement(By.xpath("//input[@type='checkbox']")).isSelected());
        System.out.println(driver.findElement(By.id("gender-male")).isSelected());
        driver.findElement(By.id("gender-male")).click();
        // Implicit Wait
        //   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4000));
        //   System.out.println(driver.findElement(By.id("gender-male")).isSelected());
        // Explicit Wait
       /* WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4000));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@data-val-required='First name is required.']"))).sendKeys("Sam");
        driver.findElement(By.xpath("//input[@data-val-required='Last name is required.']")).sendKeys("Jo");
        // Thread.sleep(1000);
        //  driver.quit();

        // fluent wait
       /Wait<WebDriver> mywait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofSeconds(30)).ignoring(NoSuchElementException.class);

        WebElement textusername = mywait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver webDriver) {
                return driver.findElement(By.xpath("//input[@id='Email']"));
            }
        });
        textusername.sendKeys("shruti@gmail.com");
        */
        //   driver.findElement(By.xpath("//input[@id='Email678']")).sendKeys("shru@gmail.com");
        driver.navigate().to("https://demo.nopcommerce.com/wishlist");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));

        driver.navigate().refresh();
        driver.navigate().back();


    }

}
