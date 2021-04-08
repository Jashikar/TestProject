package demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

class TestCase {

	@BeforeClass
	public static void beforeclass() 
	{
		System.out.println("Before Class");
	}
	
	@Before
	public void beforetestcase() 
	{
		System.out.println("Before Test Case");
	}
	
	@Test
	public void test() 
	{
		assertEquals(4, FindResult.FindMaximum(new int[] {1,2,3,4}));
		assertEquals(-1, FindResult.FindMaximum(new int[] {-1,-2,-3,0}));
		assertEquals(0, FindResult.FindMaximum(new int[] {1,2,3,4}));
		
		assertTrue(FindResult.isEvenNum(2));
		assertTrue(FindResult.isEvenNum(4));
		assertTrue(FindResult.isEvenNum(3));
		
		assertFalse(FindResult.isEvenNum(3));
		assertFalse(FindResult.isEvenNum(4));
	}
	
	@After
	public void aftertestcase() 
	{
		System.out.println("After Test Case");
	}
	
	@AfterClass
	public static void afterclass() 
	{
		System.out.println("After Class");
	}
}
