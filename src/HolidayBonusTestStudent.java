/*
 * Class: CMSC203 CRN 30339
 * Instructor: Professor Grinberg
 * Description: Create a utility class that uses a two-dimensional ragged array 
 * of doubles that creates a Sales Report for Retail District #5. 
 * It will calculate holiday bonuses given an array of doubles and 
 * take the bonus amount to create a sales report and display holiday bonuses. 
 * Due: 04/15/2024
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming assignment independently.
*  I have not copied the code from a student or any source. 
*  I have not given my code to any student.
*  Print your Name here: Alivia Lee
*/

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class HolidayBonusTestStudent {
	private double[][] dataSet1 = { {7, 2, 9, 4},
									{5},
									{8, 1, 3},
									{11, 6, 7, 2} };

	private double[][] dataSet2 = { { -2.5, -5.3, 6.1},
									{ -4.4, 8.2},
									{  2.3, -7.5},
									{ -4.2, 7.3, -5.9, 2.6} };
	
	@Before
	public void setUp() throws Exception {
		
	}
	
	@After
	public void tearDown() throws Exception {
		
	}
	
	/**
	 * Test HolidayBonusTestStudentA method returns the bonuses of each element
	 * added in a single row of dataSet1
	 */
	@Test
	public void testCalculateHolidayBonusA() {
		try {
			double[] result = HolidayBonus.calculateHolidayBonus(dataSet1);
			assertEquals(14000.0, result[0], .001);
			assertEquals(1000.0, result[1], .001);
			assertEquals(4000.0, result[2], .001);
			assertEquals(13000.0, result[3], .001);
		} catch (Exception e) {
			fail("This should not have caused an Exception");
		}
	
	}
	
	/**
	 * Test CalculateTotalHolidayBonusA method returns the bonuses of all elements
	 * of dataSet1
	 */
	@Test
	public void testCalculateTotalHolidayBonusA() {
		assertEquals(32000.0, HolidayBonus.calculateTotalHolidayBonus(dataSet1), .001);
	}
	
	/**
	 * Test HolidayBonusTestStudentB method returns the bonuses of each element
	 * added in a single row of dataSet2
	 */
	@Test
	public void testCalculateHolidayBonusB() {
		try {
			double[] result = HolidayBonus.calculateHolidayBonus(dataSet2);
			assertEquals(5000.0, result[0], .001);
			assertEquals(5000.0, result[1], .001);
			assertEquals(5000.0, result[2], .001);
			assertEquals(7000.0, result[3], .001);
		} catch (Exception e) {
			fail("This should not have caused an Exception");
		}
		
	}
	
	/**
	 * Test CalculateTotalHolidayBonusB method returns the bonuses of all elements
	 * of dataSet2
	 */
	@Test
	public void testCalculateTotalHolidayBonusB() {
		assertEquals(22000.0, HolidayBonus.calculateTotalHolidayBonus(dataSet2), .001);
	}
	
}
