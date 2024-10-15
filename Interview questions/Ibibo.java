package A_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.*;
import java.time.Duration;
import java.util.List;

public class Ibibo {

    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.goibibo.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.findElement(By.xpath("//span[@class='logSprite icClose']")).click();
       // driver.findElement(By.xpath("//div[@class='sc-12foipm-22 kGtxGm']//p[text()='Enter city or airport']")).sendKeys("Raipur");
        //driver.findElement(By.xpath("//div[text()='Senior Citizen']")).click();
      //  System.out.println(driver.findElement(By.xpath("//div[text()='Senior Citizen']")).isSelected());
        Thread.sleep(2000);
        List<WebElement> Checkbox = driver.findElements(By.xpath("//*[@class='sc-12foipm-91 biWUTl']"));
        Checkbox.get(1).click();
        /*
        for(int i=0;i<= Checkbox.size();i++)

        {
            Checkbox.get(0).click();
        }


         */
        Thread.sleep(5000);
        driver.quit();







    }


}
