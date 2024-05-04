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
import java.io.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TwoDimRaggedArrayUtilityTestStudent {

	//A set of data for the junit test
	private double[][] dataSet1 = { { 7, 2, 9, 4 },
									{ 5 },
									{ 8, 1, 3 },
									{ 11, 6, 7, 2 } };
	
	private String testFile = "dataSet2.txt";

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test testReadFile method tests whether the method readFile reads
	 * all of the information in a file correctly
	 */
	@Test
	public void testReadFile() {

		try {

			ClassLoader classLoader = getClass().getClassLoader();
			File file = new File(classLoader.getResource(testFile).getFile());
			double[][] data = TwoDimRaggedArrayUtility.readFile(file);
			assertArrayEquals(dataSet1, data);

		} catch (FileNotFoundException e) {

			fail("File not found.");

		}

	}

	/**
	 * Test testWriteToFile method tests whether the method writeToFile writes into
	 * all of the information in a file correctly
	 */
	@Test
	public void testWriteToFile() {
		
		try {
			
			TwoDimRaggedArrayUtility.writeToFile(dataSet1,  new File(testFile));
			double[][] dataCopy = TwoDimRaggedArrayUtility.readFile(new File(testFile));
			assertArrayEquals(dataSet1, dataCopy);
			
		}catch(FileNotFoundException e) {

			fail("File not found.");

		}
		
	}
	
	/**
	 * Test getTotal method tests the total of all the elements in the array.
	 */
	@Test
	public void testGetTotal() {
		
		assertEquals(65.0, TwoDimRaggedArrayUtility.getTotal(dataSet1), .001);
		
	}
	
	/**
	 * Test getAverage method tests the average of all the elements in the array.
	 */
	@Test
	public void testGetAverage() {
		
		assertEquals(65.0/12.0, TwoDimRaggedArrayUtility.getAverage(dataSet1), .001);
		
	}

	/**
	 * Test getRowTotal method Returns the total of all the elements of row 0. Row 0
	 * refers to the first row in the two dimensional array
	 */
	@Test
	public void testGetRowTotal() {
		
		assertEquals(22.0, TwoDimRaggedArrayUtility.getRowTotal(dataSet1, 0), .001);
		
	}
	
	/**
	 * Test getColumnTotal method Returns the total of all the elements of column 0. column 0
	 * refers to the first column in the two dimensional array
	 */
	@Test
	public void testGetColumnTotal() {
		
		assertEquals(31.0, TwoDimRaggedArrayUtility.getColumnTotal(dataSet1, 0), .001);
		
	}
	
	/**
	 * Test getHighestInRow method Returns the highest element of row 0. Row 0
	 * refers to the first row in the two dimensional array
	 */
	@Test
	public void testGetHighestInRow() {
		
		assertEquals(9.0, TwoDimRaggedArrayUtility.getHighestInRow(dataSet1, 0), .001);
		
	}
	
	/**
	 * Test getHighestInRowIndex method Returns the highest element's index of row 0. Row 0
	 * refers to the first row in the two dimensional array
	 */
	@Test
	public void testGetHighestInRowIndex() {
		
		assertEquals(2, TwoDimRaggedArrayUtility.getHighestInRowIndex(dataSet1, 0), .001);
		
	}
	
	/**
	 * Test getLowestInRow method Returns the lowest element of row 0. Row 0
	 * refers to the first row in the two dimensional array
	 */
	@Test
	public void testGetLowestInRow() {
		
		assertEquals(2.0, TwoDimRaggedArrayUtility.getLowestInRow(dataSet1, 0), .001);
		
	}
	
	/**
	 * Test getLowestInRowIndex method Returns the lowest element's index of row 0. Row 0
	 * refers to the first row in the two dimensional array
	 */
	@Test
	public void testGetLowestInRowIndex() {
		
		assertEquals(1, TwoDimRaggedArrayUtility.getLowestInRowIndex(dataSet1, 0), .001);
		
	}
	
	/**
	 * Test getHighestInColumn method Returns the highest element of column 0. Column 0
	 * refers to the first column in the two dimensional array
	 */
	@Test
	public void testGetHighestInColumn() {
		
		assertEquals(11.0, TwoDimRaggedArrayUtility.getHighestInColumn(dataSet1, 0), .001);
		
	}
	
	/**
	 * Test getHighestInColumnIndex method Returns the highest element's index of column 0. Column 0
	 * refers to the first column in the two dimensional array
	 */
	@Test
	public void testGetHighestInColumnIndex() {
		
		assertEquals(3, TwoDimRaggedArrayUtility.getHighestInColumnIndex(dataSet1, 0), .001);
		
	}
	
	/**
	 * Test getLowestInColumn method Returns the lowest element of column 0. Column 0
	 * refers to the first column in the two dimensional array
	 */
	@Test
	public void testGetLowestInColumn() {
		
		assertEquals(5.0, TwoDimRaggedArrayUtility.getLowestInColumn(dataSet1, 0), .001);
		
	}
	
	/**
	 * Test getLowestInColumnIndex method Returns the lowest element's index of column 0. Column 0
	 * refers to the first column in the two dimensional array
	 */
	@Test
	public void testGetLowestInColumnIndex() {
		
		assertEquals(1, TwoDimRaggedArrayUtility.getLowestInColumnIndex(dataSet1, 0), .001);
		
	}
	
	/**
	 * Test getHighestInArray method Returns the highest element of
	 * the array
	 */
	@Test
	public void testGetHighestInArray() {
		
		assertEquals(11.0, TwoDimRaggedArrayUtility.getHighestInArray(dataSet1), .001);
		
	}
	
	/**
	 * Test getLowestInArray method Returns the lowest element of
	 * the array
	 */
	@Test
	public void testGetLowestInArray() {
		
		assertEquals(1.0, TwoDimRaggedArrayUtility.getLowestInArray(dataSet1), .001);
		
	}
	
	
}
