package syncronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		
	WebDriver driver=new ChromeDriver();
	driver.get("https://the-internet.herokuapp.com/");
	driver.manage().window().maximize();
	driver.findElement(By.linkText("Dynamic Loading")).click();
	driver.findElement(By.partialLinkText("Example 2: ")).click();
	driver.findElement(By.tagName("button")).click();
	Thread.sleep(5000);//stop the execution flow
	String data=driver.findElement(By.xpath("(//h4)[2]")).getText();
	System.out.println(data);
	
	}
}
