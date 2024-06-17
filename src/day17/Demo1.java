package day17;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo1 {
	
	@Test
	public void test() {
	
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.google.com");
	System.out.println(driver.getTitle());
	driver.quit();

}

}


