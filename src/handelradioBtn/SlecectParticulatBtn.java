package handelradioBtn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SlecectParticulatBtn {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		
	WebElement	MaleBtn=driver.findElement(By.id("radio1"));
	WebElement	FeMaleBtn=driver.findElement(By.id("radio2"));
	   MaleBtn.click();
	
	 if(MaleBtn.isSelected()) {
		 System.out.println("Male Btn is Selected");
	 }else {
		 System.out.println("FeMale Btn is Selected");
	 }
		
		
	}

}
