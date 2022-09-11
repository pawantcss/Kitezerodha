package KiteTest;

import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.BaseClass;
import Pom_Design.Pom1;
import Pom_Design.Pom2;
import Pom_Design.Pom3;
import Utility.Utility1;

public class Test_Class extends BaseClass  {
	
	//declare all useful member globally
	
	Pom1 login1;
	Pom2 login2;
	Pom3 home;
	
	@BeforeClass
	public void openBrowser() {
		
		initilizeBrowser();
		
		//all objects of POM class
		login1=new Pom1(driver);
		login2=new Pom2(driver);
		home=new Pom3(driver);
	}
	@BeforeMethod
	public void loginToApp() throws Throwable {
		//enter un
		
		login1.enterUN(Utility1.getID(0, 0));
		
		//enter pwd
		login1.PwdF(Utility1.getID(0, 1));
		
		login1.clk2();
		
		//pin enter
		login2.pinF(Utility1.getID(0, 2));
		
		login2.cll();
	}
	@Test
	
	public void verifyuserID() {
		Reporter.log("running verify user",true);
		
		String 
	}

}
