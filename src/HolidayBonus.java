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

public class HolidayBonus {

	//Constants
	private static final double HIGHEST_BONUS = 5000.0;//Highest sale bonus set to 5000
	private static final double LOWEST_BONUS = 1000.0;//Lowest sale bonus set to 1000
	private static final double OTHER_BONUS = 2000.0;//neither low or high positive sales bonus set to 2000
	
	//Constructor
	
	/**
	 Empty Constructor
	 */
	public HolidayBonus() {
		
	}
	
	//Methods
	
	/**
	 *Method calculateHolidayBonus finds the total number of bonuses for a store 
	 *given whether they have the highest,lowest, regular, or negative sales.
	 *@param data is a 2-D array of doubles given
	 *@return the total holiday bonuses for a store as a double[]
	 */
	public static double[] calculateHolidayBonus(double[][] data) {
		
		double[] bonuses = new double[data.length];
		for (int row = 0; row < data.length; row++) {
			
			double bonus = 0.0;
					
				for (int col = 0; col < data[row].length; col++) {//reads through each sale for each store
					
					double sales = data[row][col];
					
					if (sales > 0) {// checks if the sale is not negative
						double highest = TwoDimRaggedArrayUtility.getHighestInColumn(data, col);
						double lowest = TwoDimRaggedArrayUtility.getLowestInColumn(data, col);
						//Checks if the sale is the highest, the least, or neither
						if (sales == highest) {
							
							bonus += HIGHEST_BONUS;
							
						}else if (sales == lowest) {
							
							bonus += LOWEST_BONUS;
							
						}else {
							
							bonus += OTHER_BONUS;
							
						}
						
					}
					
				}
				
				bonuses[row] = bonus;
			
		}
		
		return bonuses;
		
	}
	
	/**
	 *Method calculateTotalHolidayBonus finds the total 
	 *number of bonuses for all the stores
	 *@param data is a 2-D array of doubles given
	 *@return all the holiday bonuses added total for each store as a double
	 */
	public static double calculateTotalHolidayBonus(double[][] data) {
		
		double totalBonus = 0.0;
		double[] bonuses = calculateHolidayBonus(data);//calculates the bonuses for each store in array
		
		for (double bonus : bonuses) {//adds all those bonuses together in the array
			
			totalBonus += bonus;
			
		}
		
		return totalBonus;
		
	}
	
}
