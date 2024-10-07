import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

        public static void main(String[] args) throws InterruptedException {
            //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
            // to see how IntelliJ IDEA suggests fixing it.
            System.out.println("Hello and welcome!");
            WebDriver driver = new ChromeDriver();
            driver.get("https://tutorialsninja.com/demo/");
            driver.manage().window().maximize();
            Thread.sleep(4000);
            driver.findElement(By.xpath("//a[text()='Desktops']")).click();
            driver.findElement(By.xpath("//a[text()='Mac (1)']")).click();
            driver.findElement(By.xpath("//span[text()='Add to Cart']")).click();
            //  driver.findElement(By.xpath("//button[@type='button']//span[@id='cart-total']")).click();

        }
    }
