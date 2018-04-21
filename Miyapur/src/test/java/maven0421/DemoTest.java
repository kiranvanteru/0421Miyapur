package maven0421;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class DemoTest {
  @Test
  public void f() {
	  
	  System.out.println("test execution");
	  System.out.println("new changes");
  }
  @BeforeTest
  public void beforeTest() {
	  
	  System.out.println("before test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("after test");
  }

}
