package CMC.AllTests;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import CMC.DriverTest;
import CMC.Search.DBControllerTest;
import CMC.University.UniversityControllerTest;
import CMC.University.UniversityTest;
import CMC.User.AccountTest;
import CMC.User.UserControllerTest;
import CMC.User.UserUITest;

@RunWith(Suite.class)
@SuiteClasses({UniversityControllerTest.class, DBControllerTest.class, UniversityTest.class, AccountTest.class, UserControllerTest.class, UserUITest.class, DriverTest.class})
public class AllTests {

}
