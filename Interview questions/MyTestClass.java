package TestNGVideos;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class MyTestClass {
    @Test
    void LaunchBrowser() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        // Maximize the browser
        driver.manage().window().maximize();
        // Launch Website
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[contains(text(),'OrangeHRM, Inc')]")).click();
        driver.quit();
    }
}


    /*
    @Test(priority = 1)
     void testMethod() {
        System.out.println("Shruti Jain");
    }
    @Test(priority = 2)
     void testMethod1() {
        System.out.println("Shreyansh Jain");

    }
    @Test
     void testMethod2() {
        System.out.println("Nidhi Jain");


    }
    @Test
     void testMethod3() {
        int a = 1;
        int num = a/2;

        System.out.println(+num);

    }

     */
