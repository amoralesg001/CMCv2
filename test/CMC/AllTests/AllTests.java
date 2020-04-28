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
<<<<<<< HEAD
@SuiteClasses({UniversityControllerTest.class, DBControllerTest.class, UniversityTest.class, AccountTest.class, UserControllerTest.class, UserUITest.class, DriverTest.class})
=======
@SuiteClasses({UniversityControllerTest.class, DBControllerTest.class, UniversityTest.class, AccountTest.class, UserControllerTest.class})
>>>>>>> fefbdefedbf29d93414bd2a90895669881c69ebc
public class AllTests {

}
