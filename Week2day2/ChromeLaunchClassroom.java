package Week2day2;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeLaunchClassroom {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.close();
	}
	
}
	