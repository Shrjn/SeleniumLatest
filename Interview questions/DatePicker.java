package A_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.time.Duration;

public class DatePicker {
    public static void main(String[] args) throws InterruptedException, AWTException {

        String year = "2024";
        String month = "May";
        String date = "23";
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://jqueryui.com/datepicker/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.switchTo().frame(0);
        driver.findElement(By.xpath("//input[@type='text']")).click();


    /*
        public static void main(String[] args)
        {
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10);


     */

    }
}
