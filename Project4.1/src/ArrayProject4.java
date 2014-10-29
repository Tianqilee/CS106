/**
 * 
 */
//Get the File operation.
import java.io.*;
//Get the Scanner.
import java.util.*;

/**
 * @author tli1
 * 
 */
public class ArrayProject4 {
	static double checking = 0.0;
	static double savings = 0.0;
	static double creditCard = 0.0;

	/**
	 * @param args
	 */
	public static void main(String[] args) throws FileNotFoundException {
		// Open input file for reading.
		Scanner fileReader = new Scanner(new File("src/input.txt"));
		// Count the number of the lines in the file.
		int numberLines = 0;
		// Read each line of the file.
		while (fileReader.hasNextLine()) {
			fileReader.nextLine();
			numberLines++;
		}
		fileReader.close();

		// Provision array to hold the values based on the number of the lines
		String[] dates = new String[numberLines];
		String[] accounts = new String[numberLines];
		String[] transactions = new String[numberLines];
		double[] amounts = new double[numberLines];
		int i = 0;
		fileReader = new Scanner(new File("src/input.txt"));
		while (fileReader.hasNext()) {

			dates[i] = fileReader.next();
			accounts[i] = fileReader.next();
			if (accounts[i].equals("Credit")) {
				accounts[i] = accounts[i] + "" + fileReader.next();
			}
			transactions[i] = fileReader.next();
			if (transactions[i].equals("Opening")) {
				transactions[i] = transactions[i] + "" + fileReader.next();
			}
			amounts[i] = fileReader.nextDouble();
			i++;
		}
	fileReader.close();
		
		for (i = 0; i < numberLines; i++) {
			if (accounts[i].equals("Checking")) {
				if (transactions[i].equals("Withdrawal")) {
					checking -= amounts[i];
				} else {
					checking += amounts[i];
				}
			} else if (accounts[i].equals("Savings")) {
				if (transactions[i].equals("Withdrawal")) {
					savings -= amounts[i];
				} else {
					savings += amounts[i];
				}
			} else {
				if (transactions[i].equals("Withdrawal")) {
					creditCard -= amounts[i];
				} else {
					creditCard += amounts[i];
				}
			}

		}
		System.out.println("Total Checking =" + checking);
		System.out.println("Total Savings =" + savings);
		System.out.println("Total creaditCard=" + creditCard);

	}
}
