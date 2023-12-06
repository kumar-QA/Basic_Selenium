package CountAllThewebElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountOfWebElements {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.mercurytravels.co.in/");
		driver.manage().window().maximize();

		//list of link
	List<WebElement> ele=driver.findElements(By.tagName("a"));	
	System.out.println("no of links in webpage ="+ele.size());
	
	  //list of dropdown
	
	ele=driver.findElements(By.tagName("select"));
	 System.out.println("no of dropdown in a webpage="+ele.size());
	 
	//list of images
	 ele=driver.findElements(By.tagName("img"));
	 System.out.println("no of iamges in a webpage="+ele.size());
	
	 //list of text box
	 ele=driver.findElements(By.xpath("//input[@type='text']"));
	 System.out.println("no of textbox in a webpage="+ele.size());
	
	 
	 
	 
	 
	 
		
		
		
	}

}
