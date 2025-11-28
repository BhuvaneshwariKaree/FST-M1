package activities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {

	public static void main(String[] args) {
		// Initialize web driver
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
		//Open the training support site. (https://training-support.net)
		driver.get("https://training-support.net/webelements/login-form");

		//	Print the title of the page
		System.out.println("Page Title is: " + driver.getTitle());

		 // Find the username field and enter the username
        driver.findElement(By.id("username")).sendKeys("admin");
        // Find the password field and enter the password
        driver.findElement(By.id("password")).sendKeys("password");
        // Find the login button and click it
        driver.findElement(By.cssSelector("button.svelte-1pdjkmx")).click();
        
        // Print the confirmation message
        String message = driver.findElement(By.tagName("h1")).getText();
        System.out.println(message);
                
		driver.quit();
				
	}

}
