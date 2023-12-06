package automationFramework;
import java.time.Clock;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class NavigateToLancomeWebsite {

    public static void main(String[] args) {
        // Set the path to your ChromeDriver executable
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        // Create a new instance of the ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to the Lancome website
        driver.get("https://www.lancome-usa.com");

        // Optional: Maximize the browser window
        driver.manage().window().maximize();

        // Optional: Add a delay to see the webpage (you might want to remove this in a real script)
        try {
            Thread.sleep(4000); // Sleep for 3 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Perform other actions on the webpage using WebElement commands as needed
        // For example, you can find an element by its ID and click on it
        WebDriverWait wait = new WebDriverWait(driver,  Duration.ofSeconds(10));

        WebElement logoElement = driver.findElement(By.xpath("/html/body/div[10]/header/div[1]/div[3]/div[1]/div[1]/a/img[3]"));
//        logoElement.click();
       // WebElement logoElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.className("c-logo__image m-light m-hide-on-sticky-for-large")));
        System.out.println( logoElement.isDisplayed());

        
        //WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[10]/header/div[1]/div[3]/div[1]/div[1]/a/img[3]")));

        //WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a[class='c-user__link m-login']")));
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a.c-user__link.m-login")));

      //  System.out.println( element.isDisplayed());
        System.out.println( element.getAttribute("class"));
        element.click();


        
        // Close the browser
        //driver.quit();
    }
}
