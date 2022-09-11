package Pom_Design;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom1 {
	
	//Declaration
	@FindBy (xpath = "//input[@id='userid']") private WebElement un;
	@FindBy (xpath = "//input[@id='password']") private WebElement pwd;
	@FindBy (xpath = "//button[@class='button-orange wide']") private WebElement clk;
	
	
	//initiation
	public Pom1(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Utilization
	public void enterUN(String login) {
		un.sendKeys(login);
	}
	
	public void PwdF(String pwdd) {
		pwd.sendKeys(pwdd);
		
	}
     public void clk2() {
    	 clk.click();
     }


}
