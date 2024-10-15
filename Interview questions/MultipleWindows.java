package A_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class MultipleWindows {

    public static void main(String []args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/browser-windows");

        // Handling mulitple windows
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@id = 'windowButton']")).click();
        Set<String> windowID = driver.getWindowHandles();

        List<String> windowList = new ArrayList(windowID);

        String parent_window = windowList.get(0);
        String child_window = windowList.get(1);

        driver.switchTo().window(child_window);
        driver.manage().window().maximize();

        driver.switchTo().window(parent_window);
        System.out.println("Parent Window");
        driver.quit();

    }
}
