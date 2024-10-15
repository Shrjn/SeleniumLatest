package A_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrame {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://ui.vision/demo/webtest/frames/");
        driver.manage().window().maximize();
        // frame1
        WebElement frame1 = driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
        driver.switchTo().frame(frame1);
        driver.findElement(By.name("mytext1")).sendKeys("Shruti Jain");

        // go back to page
        driver.switchTo().defaultContent();
        // frame2
        WebElement frame2 = driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
        driver.switchTo().frame(frame2);
        Thread.sleep(1000);
        driver.findElement(By.name("mytext2")).sendKeys("Shruti Jain");
        // go back to page
        driver.switchTo().defaultContent();
        // frame3
        WebElement frame3 = driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
        driver.switchTo().frame(frame3);
        Thread.sleep(1000);
        driver.findElement(By.name("mytext3")).sendKeys("Shruti Jain");
        //Handling inner frame / iframe -  here when inside frame3 -- we can interact with inner iframe
        driver.findElement(By.xpath("")).click();
        driver.switchTo().defaultContent();

    }
}
