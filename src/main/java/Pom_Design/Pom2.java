package Pom_Design;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom2 {
	
	//Declaration 
	@FindBy (xpath = "//input[@id='pin']") private WebElement pin;
	@FindBy (xpath = "//button[@class='button-orange wide']") private WebElement clk3;
	
	//Initiation
	public Pom2(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Utilization
	public void pinF(String kk) {
		pin.sendKeys(kk);
		
	}
	public void cll() {
		clk3.click();
	}
	
}
