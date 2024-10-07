import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GradeBookTester {
	private GradeBook gradeBook1;
	private GradeBook gradeBook2;

	@Before
	public void setUp() throws Exception {
		gradeBook1 = new GradeBook(5);
		gradeBook2 = new GradeBook(5);
		
		gradeBook1.addScore(70.0);
		gradeBook1.addScore(80.0);
		
		gradeBook2.addScore(95.0);
		gradeBook2.addScore(75.0);
	}

	@After
	public void tearDown() throws Exception {
		gradeBook1 = null;
		gradeBook2 = null;
	}

	@Test
	public void testGetScoreSize() {

	}

	@Test
	public void testAddScore() {
		assertEquals("70.0 80.0", gradeBook1.toString());
		assertEquals("95.0 75.0", gradeBook2.toString());
		
		assertEquals(2, gradeBook1.getScoreSize());
		assertEquals(2, gradeBook2.getScoreSize());
	}

	@Test
	public void testSum() {
		assertEquals(150.0, gradeBook1.sum(), 0.001);
		assertEquals(170.0, gradeBook2.sum(), 0.001);
	}

	@Test
	public void testMinimum() {
		assertEquals(70.0, gradeBook1.minimum(), 0.001);
		assertEquals(75.0,gradeBook2.minimum(), 0.001);
		
	}

	@Test
	public void testFinalScore() {
		assertEquals(80.0, gradeBook1.finalScore(), 0.001);
		assertEquals(95.0, gradeBook2.finalScore(), 0.001);
	}

	@Test
	public void testToString() {
		String expectedOp1 = "70.0 80.0";
		String expectedOp2 = "95.0 80.0";
		
		assertTrue("GradeBook1 toString output does not match the expected.", gradeBook1.toString().equals(expectedOp1));
		assertTrue("GradeBook2 toString output does not match the expected.", gradeBook2.toString().equals(expectedOp2));
	}

}
