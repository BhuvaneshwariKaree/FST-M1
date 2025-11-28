package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity1 {

	public static void main(String[] args) {
		// Initialize web driver
		WebDriver driver = new FirefoxDriver();
				
		//Open the training support site. (https://training-support.net)
		driver.get("https://training-support.net");

		//	Print the title of the page
		System.out.println("Page Title is: " + driver.getTitle());
		
		//	Click the about us button
		driver.findElement(By.linkText("About Us")).click();
		//	Print the title of the new page
		System.out.println("Title of New Page is: " + driver.getTitle());
						
		driver.quit();
				
	}

}
