package Pom_Design;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom3 {
	//Declaration
	
	@FindBy (xpath = "//span[text()='DPG458']") private WebElement verify;
	
	//initiation
	public Pom3(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Utilization
	public String verifyID() {
		
		String actID=verify.getText();
		return actID;
		
	}
	
	

}
