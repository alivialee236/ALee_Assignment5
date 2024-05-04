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
import java.io.*;
import java.util.Scanner;

public class TwoDimRaggedArrayUtility {

	//Constructor
	
	/**
	 Empty Constructor
	 */
	public TwoDimRaggedArrayUtility() {
		
	}
	
	//Methods
	
	/**
	 *Method readFile reads the file and returns all the values in a ragged double array
	 *@param file is the File to read from
	 *@return raggedArray with all the info from the file
	 *@throws FileNotFoundException when the file is not found
	 */
	public static double[][] readFile(File file) throws FileNotFoundException{
		Scanner keyboard = new Scanner(file);
		int rows = 0;
		int cols = 0;
		
		while (keyboard.hasNextLine()) {
			
			String[] rowVals = keyboard.nextLine().trim().split(" ");
			rows++;
			if (rowVals.length > cols) {
				
				cols = rowVals.length;
				
			}
		}
		
		keyboard.close();
		double[][] raggedArray = new double[rows][];
		keyboard = new Scanner(file);
		
		for (int i = 0; i < rows; i++) {
			
			String[] rowVals = keyboard.nextLine().trim().split(" ");
			raggedArray[i] = new double [rowVals.length];
			
			for (int j = 0; j < rowVals.length; j++) {
				
				raggedArray[i][j] = Double.parseDouble((rowVals[j]));
				
			}
			
		}
		keyboard.close();
		return raggedArray;
		
	}
	
	/**
	 *Method writeToFile writes to the file a ragged array of doubles
	 *@param data is a 2-D ragged array of doubles
	 *@param outputFile is the File that is written into
	 *@throws FileNotFoundException when the file is not found
	 */
	public static void writeToFile(double[][] data, File outputFile) throws FileNotFoundException{
		
		PrintWriter writer = new PrintWriter(outputFile);
		
		for (double [] row : data) {
			
			for (double val : row) {
				
				writer.print(val + " ");
				
			}
			
			writer.println();
			
		}
		
		writer.close();
		
	}
	
	/**
	 *Method getTotal finds the total of all elements in the array
	 *@param data is a 2-D array of doubles given
	 *@return the total of the elements as a double
	 */
	public static double getTotal(double[][] data) {
		
		double total = 0.0;
		for (double[] row : data) {
			
			for (double val : row) {
				
				total += val;
				
			}
			
		}
		
		return total;
		
	}
	
	/**
	 *Method getAverage finds the average of all the elements in the array
	 *@param data is a 2-D array of doubles given
	 *@return the average of all the elements as a double
	 */
	public static double getAverage(double[][] data) {
		
		double total = getTotal(data);
		int count = 0;
		
		for (double[] row : data) {
			
			count += row.length;
			
		}
		
		return (total / count);
		
	}
	
	/**
	 *Method getRowTotal finds the total of all the elements in a row
	 *@param data is a 2-D array of doubles given
	 *@param row is the row number. 0 is the first row of the array
	 *@return total of all elements in the row as a double
	 */
	public static double getRowTotal(double[][] data, int row) {
		
		double total = 0.0;
		if (row >= 0 && row < data.length) {
			
			for (double val : data[row]) {
				
				total += val;
				
			}
			
		}
		
		return total;
	}
	
	/**
	 *Method getColumnTotal finds the total of all the elements in a column
	 *@param data is a 2-D array of doubles given
	 *@param col is the column number. 0 is the first column of the array
	 *@return total of all elements in the column as a double
	 */
	public static double getColumnTotal(double[][] data, int col) {
		
		double total = 0.0;
		for (double[] row : data) {
			
			if (col >= 0 && col < row.length) {
				
				total += row[col];
				
			}
			
		}
		
		return total;
		
	}
	
	/**
	 *Method getHighestInRow finds the highest element in a row
	 *@param data is a 2-D array of doubles given
	 *@param row is the row number. 0 is the first row of the array
	 *@return highest element in the row as a double
	 */
	public static double getHighestInRow(double[][] data, int row) {
		
		double highest = Double.MIN_VALUE;
		
		if (row >= 0 && row < data.length) {
			
			for (double val : data[row]) {
				
				if (val > highest) {
					
					highest = val;
					
				}
				
			}
			
		}
		
		return highest;
		
	}
	
	/**
	 *Method getHighestInRowIndex finds the highest element in a row's index
	 *@param data is a 2-D array of doubles given
	 *@param row is the row number. 0 is the first row of the array
	 *@return highest element's index in the row as a double
	 */
	public static int getHighestInRowIndex(double[][] data, int row) {
		
		int index = 0;
		double highest = Double.MIN_VALUE;
		if (row >= 0 && row < data.length) {
			
			for (int i = 0; i < data[row].length; i++) {
				
				if (data[row][i] > highest) {
					
					highest = data[row][i];
					index = i;
					
				}
				
			}
			
		}
		
		return index;
		
	}
	
	/**
	 *Method getLowestInRow finds the lowest element in a row
	 *@param data is a 2-D array of doubles given
	 *@param row is the row number. 0 is the first row of the array
	 *@return lowest element in the row as a double
	 */
	public static double getLowestInRow(double[][] data, int row) {
		
		double lowest = Double.MAX_VALUE;
		
		if ( row >= 0 && row < data.length) {
			
			for (double val : data[row]) {
				
				if (val < lowest) {
					
					lowest = val;
					
				}
				
			}
			
		}
		
		return lowest;
		
	}
	
	/**
	 *Method getLowestInRowIndex finds the lowest element in a row's index
	 *@param data is a 2-D array of doubles given
	 *@param row is the row number. 0 is the first row of the array
	 *@return lowest element's index in the row as a double
	 */
	public static int getLowestInRowIndex(double[][] data, int row) {
		
		int index = 0;
		double lowest = Double.MAX_VALUE;
		if (row >= 0 && row < data.length) {
			
			for (int i = 0; i < data[row].length; i++) {
				
				if (data[row][i] < lowest) {
					
					lowest = data[row][i];
					index = i;
					
				}
				
			}
			
		}
		
		return index;
		
	}
	
	/**
	 *Method getHighestInColumn finds the highest element in a column
	 *@param data is a 2-D array of doubles given
	 *@param col is the column number. 0 is the first column of the array
	 *@return highest element in the column as a double
	 */
	public static double getHighestInColumn(double[][] data, int col) {
		
		double highest = Double.MIN_VALUE;
		
		for (double[] row : data) {
		
			if (col >= 0 && col < row.length) {
				
				if (row[col] > highest) {
					
					highest = row[col];
					
				}
				
			}
			
		}
		
		return highest;
		
	}
	
	/**
	 *Method getHighestInColumnIndex finds the highest element in a column's index
	 *@param data is a 2-D array of doubles given
	 *@param col is the column number. 0 is the first column of the array
	 *@return highest element's index in the column as a double
	 */
	public static int getHighestInColumnIndex(double[][] data, int col) {
		
		int index = 0;
		double highest = Double.MIN_VALUE;
		
		for (int i = 0; i < data.length; i++) {
			
			if (col >= 0 && col < data[i].length && data[i][col] > highest) {
				
				highest = data[i][col];
				index = i;
				
			}
			
		}
	
		
		return index;
		
	}
	
	/**
	 *Method getLowestInColumn finds the lowest element in a column
	 *@param data is a 2-D array of doubles given
	 *@param col is the column number. 0 is the first column of the array
	 *@return lowest element in the column as a double
	 */
	public static double getLowestInColumn(double[][] data, int col) {
		
		double lowest = Double.MAX_VALUE;
		
		for (double[] row : data) {
			
			if (col >= 0 && col < row.length) {
				
				if (row[col] < lowest) {
					
					lowest = row[col];
					
				}
				
			}
			
		}
		
		return lowest;
		
	}
	
	/**
	 *Method getLowestInColumnIndex finds the lowest element's index in a column
	 *@param data is a 2-D array of doubles given
	 *@param col is the column number. 0 is the first column of the array
	 *@return lowest element's index in the column as a double
	 */
	public static int getLowestInColumnIndex(double[][] data, int col) {
		
		int index = 0;
		double lowest = Double.MAX_VALUE;
		for (int i = 0; i < data.length; i++) {
			
			if (col >= 0 && col < data[i].length && data[i][col] < lowest) {
				
				lowest = data[i][col];
				index = i;
				
			}
			
		}
		
		return index;
		
	}
	
	/**
	 *Method getHighestInArray finds the highest element in the array
	 *@param data is a 2-D array of doubles given
	 *@return highest element in the array as a double
	 */
	public static double getHighestInArray(double[][] data) {
		
		double highest = Double.MIN_VALUE;
		for (int i = 0; i < data.length; i++) {
			
			for (int j = 0; j < data[i].length; j++) {
				
				if (data[i][j] > highest) {
					
					highest = data[i][j];
					
				}
				
			}
			
		}
		
		return highest;
		
	}
	
	/**
	 *Method getLowestInArray finds the lowest element in the array
	 *@param data is a 2-D array of doubles given
	 *@return lowest element in the array as a double
	 */
	public static double getLowestInArray(double[][] data) {
		
		double lowest = Double.MAX_VALUE;
		for (int i = 0; i < data.length; i++) {
			
			for (int j = 0; j < data[i].length; j++) {
				
				if (data[i][j] < lowest) {
					
					lowest = data[i][j];
					
				}
				
			}
			
		}
		
		return lowest;
		
	}
	
}
