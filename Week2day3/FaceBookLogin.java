package Week2day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookLogin {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement username = driver.findElement (By.id("email"));
		username.sendKeys("testleaf.2023@gmail.com");
		WebElement Password = driver.findElement(By.name("pass"));
		Password.sendKeys("Tuna@321");
		driver.findElement(By.id("loginbutton")).click();
		String title = driver.getTitle();
		if(title.contains("Log in to Facebook "))
		{
			System.out.println("Title is present");
		}
		else
		{
			System.out.println("unable to see title");
		}
	}

}
