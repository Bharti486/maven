package mavenorange1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class launch {
	@Test
	public void m1() {
		String d= System.getProperty("user.dir")+"\\src\\test\\java\\chromedriver.exe";
		System.out.println(d);
		System.setProperty("webdriver.chrome.driver", d);
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}

	@AfterTest
	public void m2() {
		System.out.println("m2");
	}

}
