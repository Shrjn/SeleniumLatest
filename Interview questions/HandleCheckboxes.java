package A_Selenium;

import com.google.common.annotations.VisibleForTesting;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.*;
import java.sql.SQLOutput;
import java.util.List;

public class HandleCheckboxes {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");
        // check single checkbox
        // driver.findElement(By.xpath("")).click();
        // check multiple checkoxes
        List<WebElement> Checkboxes = driver.
                findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
        //Checkboxes.get(4).click();

       //Using for loop
        for(int i=0; i<Checkboxes.size();i++)

        {
            Checkboxes.get(i).click();
        }

        /* // Using enhanced for loop
        for(WebElement Checkbox:Checkboxes)
        {
            Checkbox.click();
        }


        // Selecting last 3 checkboxes
        for (int i = 0; i < Checkboxes.size(); i++) {
            Checkboxes.get(1).click();
        }
        Thread.sleep(2000);
        // unselect the checkboxes
        for (int i = 0; i < Checkboxes.size(); i++) {
            if (Checkboxes.get(i).isSelected()) {
                Checkboxes.get(i).click();
            }
        }
        Thread.sleep(1000);
       // driver.quit();
        // Select radio button
       // driver.findElement(By.xpath("//input[@value='male']")).click();
       // driver.findElement(By.xpath("//input[@value='female']")).click();


        */
    }
}
