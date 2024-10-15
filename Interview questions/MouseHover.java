package ActionClass;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.time.Duration;

public class MouseHover {
    public static void main(String[] args) throws InterruptedException, AWTException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo-opencart.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        WebElement desktop = driver.findElement(By.linkText("Desktops"));
        WebElement mac = driver.findElement(By.xpath("//a[text()='Mac (2)']"));
        Actions a = new Actions(driver);
        a.moveToElement(desktop).moveToElement(mac).click().build().perform();
        Thread.sleep(1000);
      //  driver.quit();

       // TakesScreenshot ts = ;
        File sourceFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        File targetFile = new File("");
        sourceFile.renameTo(targetFile);







/*
      //  WebDriver driver = new ChromeDriver();
     //   driver.findElement(By.xpath('f')).sendKeys();

       // driver.manage().window.maximize();
        //WebElement dropdown = driver.findElement(By.xpath(""));
        Select s = new Select();
        //s.selectByVisibleText(dropdown);
      //  s.selectByIndex();
      //  s.selectByValue();

        WebElement m = driver.findElement(By.xpath(""));
        Actions a1 = new Actions(driver);
        a1.moveToElement(m).build().perform();
        a1.dragAndDrop(m,r).perform();
        a1.click();





 */


    }
}
