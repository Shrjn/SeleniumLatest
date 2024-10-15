package A_Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HandleAlerts {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        // Normal alert with a OK Button
        driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
        Thread.sleep(1000);
        Alert myalert = driver.switchTo().alert();
        System.out.println(myalert.getText());
        myalert.accept();
        // driver.quit();

        // Alert with a OK and Cancel Button
        driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
        driver.switchTo().alert().accept();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
        driver.switchTo().alert().dismiss();

        // Prompt Alert with a input box
        driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        Alert myalert1 = driver.switchTo().alert();
        myalert1.sendKeys("Shruti Jain");
        myalert1.accept();


        // Handle Alert without using switchTo().alert() command - By Using explicit wait
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(1000));
        driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
        Alert myalert2 = wait.until(ExpectedConditions.alertIsPresent());
        myalert2.sendKeys("ALert in Selenium");
        myalert2.accept();

        // Handle Authenticated pop-up

        driver.close();
    }


}
