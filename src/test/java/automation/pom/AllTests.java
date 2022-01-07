package automation.pom;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ createUserTest.class, loginUserTest.class })
public class AllTests {

}
