package A_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;

public class AutoSuggestiveDropdown {

    public static void main(String[] args) throws InterruptedException, AWTException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.findElement(By.id("APjFqb")).sendKeys("Selenium");
        Thread.sleep(3000);
        List<WebElement> elementList = driver.findElements(By.xpath("//ul[@role='listbox']//li//div[@role='option']"));
        System.out.println(elementList.size());

        for(int i=0;i<elementList.size();i++)
        {
            System.out.println(elementList.get(i).getText());
            if(elementList.get(i).getText().equals("Selenium"))
            {
                elementList.get(i).click();
                break;
            }
          //  Robot robot = new Robot();
           // robot.keyPress(KeyEvent.VK_ENTER);
        }

/*
        for(WebElement element:elementList)
        {
            if(element.equals("Selenium interview"))
            {
                System.out.println(element.getText();
                element.click();
                break;

            }
            }


 */
        }

    }
