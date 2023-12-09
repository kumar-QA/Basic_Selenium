package locator_concept;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExampleForcssselector {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		//tag and id ---cssSelector
		driver.findElement(By.cssSelector("input#email")).sendKeys("abc@gmail.com");
		driver.findElement(By.cssSelector("input._9npi")).sendKeys("abc122");
		driver.findElement(By.cssSelector("button[type='submit']")).click();
	}

}
