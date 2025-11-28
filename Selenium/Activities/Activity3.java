package activities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity3 {

	public static void main(String[] args) {
		// Initialize web driver
		WebDriver driver = new FirefoxDriver();
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
					
		//Open the training support site. (https://training-support.net)
		driver.get("https://training-support.net/webelements/login-form");

		//	Print the title of the page
		System.out.println("Page Title is: " + driver.getTitle());
		

		 // Find the username field and enter the username
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("admin");
        // Find the password field and enter the password
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("password");
        // Find the login button and click it
        driver.findElement(By.xpath("//button[text()='Submit']")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("h1.text-emerald-500")));
        
        // Print the confirmation message
        String message = driver.findElement(By.xpath("//h1[contains(text(), 'Success')]")).getText();
        System.out.println(message);
		
	//	driver.quit();
				
	}

}
