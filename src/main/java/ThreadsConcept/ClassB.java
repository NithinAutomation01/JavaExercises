package ThreadsConcept;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ClassB implements Runnable{
	@Test
	public void run(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Music\\chromedriver.exe");
			 
			// Initialize browser
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			 
			// Open facebook
			driver.get("https://www.youtube.com/");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("executed youtube");
			
		
	}
}
