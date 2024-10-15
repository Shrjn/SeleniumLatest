package A_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.Set;

public class LaunchTest {

    public static void main(String[] args) throws InterruptedException {
        //  System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHRUJAIN\\IdeaProjects\\Java1\\src\\main\\java\\Drivers\\chromedriver.exe");
        // Instantiate a ChromeDriver class.
        WebDriver driver = new ChromeDriver();
        // Maximize the browser
        driver.manage().window().maximize();
        // Launch Website
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        Thread.sleep(2000);
        // open another window
        driver.findElement(By.xpath("//a[contains(text(),'OrangeHRM, Inc')]")).click();
        // System.out.println(driver.getPageSource());
        //  Set<String> windowids = driver.getWindowHandles();
        //  System.out.println(windowids);


    }
}
