package A_Selenium;

    import org.openqa.selenium.*;
    import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.util.List;
    import java.util.concurrent.TimeUnit;

    public class OpenLinks {
/*
        public static void main(String[] args) {
            // Set the path to your WebDriver executable (e.g., ChromeDriver)
            System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

            // Initialize WebDriver (Chrome in this example)
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--start-maximized");
            WebDriver driver = new ChromeDriver(options);

            try {
                // Open the initial webpage
                driver.get("http://example.com"); // Replace with your target URL

                // Find all the link elements on the page
                List<WebElement> links = driver.findElements(By.tagName("a"));

                // Store the current window handle
                String mainWindowHandle = driver.getWindowHandle();

                // Open each link in a new tab
                for (WebElement link : links) {
                    String href = link.getAttribute("href");
                    if (href != null && !href.isEmpty()) {
                        // Open a new tab with the link
                        driver.executeScript("window.open(arguments[0], '_blank');", href);

                        // Optionally, wait for the new tab to load
                        TimeUnit.SECONDS.sleep(1);
                    }
                }

                // Switch back to the original tab if needed
                driver.switchTo().window(mainWindowHandle);

                // Optionally, wait to observe the results
                TimeUnit.SECONDS.sleep(10);

            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                // Close the WebDriver
                driver.quit();
            }

 */
        }
