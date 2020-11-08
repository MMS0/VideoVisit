package MainMethod;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;

public class MainTest {

	public static void main(String[] args) {
		
		    List<String> file = new ArrayList<String>();
		    file.add("D:\\AUTOMATION\\WORKSPACE\\Video Visit\\videovisitTestNG.xml");
		    TestNG testNG = new TestNG();
		    testNG.setTestSuites(file);
		    testNG.run();
	}

}
