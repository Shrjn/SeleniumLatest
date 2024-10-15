package A_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HandleDropdown {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");
        WebElement dropdown = driver.findElement(By.xpath("//select[@id='country']"));
        Select s = new Select(dropdown);
        Thread.sleep(2000);
        s.selectByIndex(5);
        Thread.sleep(2000);
        s.selectByValue("canada");
        Thread.sleep(2000);
        s.selectByVisibleText("United Kingdom");

        // Capture the number of options in the dropdown
        List<WebElement> options = s.getOptions();
        System.out.println("Number of dropdown options: " + options.size());
        // printing the options
        for(int i=0;i< options.size();i++)
        {
            System.out.println(options.get(i).getText());
        }

        // or use a enhanced for loop
        for(WebElement option: options)
        {
            System.out.println(option.getText());
        }
        driver.close();
    }
}

