package KiteTest;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.BaseClass;
import Pom_Design.Pom1;
import Pom_Design.Pom2;
import Pom_Design.Pom3;
import Utility.Utility1;

public class TestClass extends BaseClass {
	//Declare all useful members as global
	
	Pom1 login1;
	Pom2 login2;
	Pom3 home;
	
	@BeforeClass 
	public void openBrowsers() {
		initilizeBrowser();
		
		//create object
		login1=new Pom1(driver);
		login2=new Pom2(driver);
		home=new Pom3(driver);	
	}
	@BeforeMethod
	public void LOginToApp() throws Throwable {
		login1.enterUN(Utility1.getID(0, 0));
		System.out.println(Utility1.getID(0, 0));
	
	//password
		login1.PwdF(Utility1.getID(0, 1));
	
		//click 
		login1.clk2();
		
		//enterpin
		login2.pinF(Utility1.getID(0, 2));
	
	//click
		login2.cll();
	}
	@Test
	
	public void IdVerify() throws Throwable {
		Reporter.log("running verify user",true);
		
		String actID=home.verifyID();
		String expID=Utility1.getID(0, 0);
		
		Assert.assertEquals(actID, expID,"Both are differnt TC is Failed");
	}
	
	@AfterMethod
	public void LOgoutApp() {
		Reporter.log("logout App",true);
	}
	@AfterClass
	public void closeBrowser() {
		Reporter.log("Browser Close",true);
	}
	
	

}
