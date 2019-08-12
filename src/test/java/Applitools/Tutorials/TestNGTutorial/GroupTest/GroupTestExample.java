package Applitools.Tutorials.TestNGTutorial.GroupTest;

import org.testng.annotations.Test;
import org.testng.Assert;

public class GroupTestExample {
	
	String message = ".com";
	MessageUtil mu = new MessageUtil(message); 
	
	@Test(groups = {"functest", "checkintest"})
	public void testPrintMessage() {
		System.out.println("testPrintMessage()"); 
		message = ".com";
		Assert.assertEquals(message, mu.printMessage()); 
	}
	
	@Test(groups = {"checkintest"})
	public void testSalutationMessage() {
		System.out.println("testSalutation()");
		message = "test" + ".com";
		Assert.assertEquals(message, mu.salutationMessage());
	}
	
	@Test(groups = {"functest"})
	public void testingExitMessage() {
		System.out.println("testExit()");
		message = "www." + "test" + ".com";
		Assert.assertEquals(message, mu.exitMessage());
	}
	
}
