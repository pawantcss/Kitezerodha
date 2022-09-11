package Base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
	public WebDriver driver;
	public void initilizeBrowser() {
		System.setProperty("webdriver.chrome.driver" , "C:\\Users\\user\\Downloads\\new Chrome\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
	
	driver.get("https://kite.zerodha.com/");
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(29));
		System.out.println("Hi")
	}
    }
