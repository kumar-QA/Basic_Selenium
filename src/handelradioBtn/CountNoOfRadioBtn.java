package handelradioBtn;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountNoOfRadioBtn {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		
	int noofradioBtn=driver.findElements(By.xpath("//input[@type='radio']")).size();
	System.out.println("no of radio btn in webpage =  "+noofradioBtn);	
	}

}
