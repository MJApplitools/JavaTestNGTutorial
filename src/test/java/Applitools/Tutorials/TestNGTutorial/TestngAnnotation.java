package Applitools.Tutorials.TestNGTutorial;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestngAnnotation {
  @Test(enabled = false)
  public void testCase1() {
	  System.out.println("in test case 1"); 
  }
  @Test(enabled = false)
  public void testCase2() {
	  System.out.println("in test case 2"); 
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("before method"); 
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("after method"); 
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("before class"); 
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("after class"); 
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("before test"); 
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("after test"); 
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("before suite"); 
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("after suite"); 
  }

}
