
package project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ProjectActivity3 {

    WebDriver driver;

    @BeforeClass
    public void setUp() {
        // Set path to chromedriver if needed
        // System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://alchemy.hguy.co/crm");
    }

    @Test
    public void printFooterText() {
        // Locate the first copyright footer text
        WebElement footerText = driver.findElement(By.xpath("//*[contains(text(), '© Supercharged by SuiteCRM')]"));

        // Print the text to console
        System.out.println("Footer Text: " + footerText.getText());
    }

    @AfterClass
    public void tearDown() {
        // Close the browser
        driver.quit();
    }
}
