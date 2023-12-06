package handelradioBtn;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextOfradioBtn {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
	List<WebElement>ele_list=driver.findElements(By.xpath("//input[@type='radio']"));//identifying all the radio btn

	for (int i = 0; i <ele_list.size(); i++) {
		
		String nameofRadioBtn=ele_list.get(i).getAttribute("value");
		
		
		System.out.println(" radio Btn name is : "+nameofRadioBtn);

	}
	
	System.out.println(driver.findElement(By.id("home")).getText());
		
	}

}
