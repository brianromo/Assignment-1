/*
 * Author: Brian Banfield
 * Date: 1/13/2022
 * Program calculates income
 */

package cop2805;

public class Calculations {

	public static void main(String[] args) {
		System.out.println(" Sales            Income");
		for(double sA = 1000.0; sA <= 20000; sA += 1000) {
			double income = computeIncome(sA);

			System.out.printf("$%-15.2f $%7.2f\n", sA, income);
		}
//		double sA = 1000;
//		while(sA <= 20000) {
//			double income = computeIncome(sA);
//
//			System.out.printf("$%-15.2f $%7.2f\n", sA, income);	
//			
//			sA += 1000;
//		}
	}
	public static double computeIncome(double salesAmount) {
		double income = 0;
		if(salesAmount <= 5000) {
			income = salesAmount * 0.08 + 5000.00;
		}
		else if (salesAmount <= 10000) {
			income = 5000 * 0.08 + (salesAmount - 5000.00) * 0.10 + 5000;
		}
		else {
			income = 5000 * 0.08 + 5000.00 * 0.10 + (salesAmount - 10000) * 0.12 + 5000;
		}

		return income;
	}
}
