package CMC.AllTests;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import CMC.Search.DBControllerTest;
import CMC.University.UniversityControllerTest;

@RunWith(Suite.class)
@SuiteClasses({UniversityControllerTest.class, DBControllerTest.class})
public class AllTests {

}
