package CMC.Search;


import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class DBControllerTest {

	@Before
	public void setUp() throws Exception {
		
	//setup for U2: Alex 
	boolean set1 = DBController.updateSavedUniversities("juser","blahblah");
	boolean set2 = DBController.updateSavedUniversities("juser","blahblah13");
	boolean set3 = DBController.updateSavedUniversities("juser","waer2");
	
	}

	@After
	public void tearDown() throws Exception {
		
	//tearDown for u2: Alex
	}

	@Test
	public void test() {
		//fail("Not yet implemented");
	}
	
	@Test
	public void testdbGetSavedUniversityList() {
	ArrayList<String> sizeA = new ArrayList<String>();
	sizeA.add("");
	sizeA.add("");
	sizeA.add("");
	sizeA.add("");
	Assert.assertEquals(sizeA.size()==3, DBController.dbGetSavedUniversityList("juser"));
	//Assert.assertEquals("userIsFound",PUT WHAT I EXPECT TO RETURN HERE, DBController)
		
	}
	
	@Test
	public void testDbSearchUniversity() {

	}

}
