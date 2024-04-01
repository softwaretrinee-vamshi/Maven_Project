package package1;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test1 {

	@Test
	public void welcomeMsg() {
		Reporter.log("welcome inside testNG");
		System.out.println("Welcome inside Java");
	}
}
