package activities;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity21 {
    public static void main(String[] args) {
        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();
        // Create the Wait object
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Open the page
        driver.get("https://training-support.net/webelements/tabs");
        // Print the title of the page
        System.out.println("Page title: " + driver.getTitle());
       
        // Find button to open new tab
        driver.findElement(By.xpath("//button[text()='Open A New Tab']")).click();
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));
        
        // Print the handle of the parent window
        System.out.println("Current tab: " + driver.getWindowHandle());
        
        // Print all window handles
        System.out.println("All window handles: " + driver.getWindowHandles());
        

        // Switch focus to the latest tab
        for (String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);
        }

        // Wait for the new page to load
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(), 'Another One')]")));
        // Print the handle of the current tab
        System.out.println("Current tab: " + driver.getWindowHandle());
        // Print the title and heading of the new page
        System.out.println("New Page title: " + driver.getTitle());
        System.out.println("New Page message: " + driver.findElement(By.cssSelector("h2.text-gray-800")).getText());
        // Find and click the button on page to open another tab
        driver.findElement(By.xpath("//button[contains(text(), 'Another One')]")).click();

        // Close the browser
        driver.quit();
    }
}