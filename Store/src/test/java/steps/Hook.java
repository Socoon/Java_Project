package steps;
import io.cucumber.java.Before;
import io.cucumber.java.After;
import test_Cases.TestBase;
public class Hook {
	TestBase testBaseobject = new TestBase();
	@Before
	public void setUp(){
		testBaseobject.startBrowser();
	}
	@After
	public void tearDown(){
		testBaseobject.closeBroswer();
	}
}
