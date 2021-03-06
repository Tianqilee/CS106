/**
 * 
 */
//Get the File operation.
import java.io.*;
//Get the Scanner.
import java.util.*;

/**
 * @author Tianqi Li A program to count the total balance for each
 *         account.
 */
public class Project4 {
	// Set three variables.
	static double checking = 0.0;
	static double savings = 0.0;
	static double creditCard = 0.0;

	/**
	 * The main method to open and close file and to print the results.
	 * 
	 * @param args
	 *            Arguments passed to the program.
	 * @throws FileNotFoundException
	 *             If the file is not found.
	 */
	public static void main(String[] args) throws FileNotFoundException {
		// Open input file for reading.
		Scanner fileReader = new Scanner(new File("src/input.txt"));
		// Read each line of the file.
		while (fileReader.hasNextLine()) {
			String line = fileReader.nextLine();
			process(line);
		}
		// Close the file.
		fileReader.close();
		// Create output file.
		File output = new File("src/output.txt");
		PrintStream fileWriter = new PrintStream(output);
		// Write the results in output.txt.
		fileWriter.println("Total Checking =" + checking + "\nTotal Savings ="
				+ savings + "\nTotal creaditCard=" + creditCard);
		// Close the file.
		fileWriter.close();
		// Print results.
		System.out.println("Total Checking =" + checking);
		System.out.println("Total Savings =" + savings);
		System.out.println("Total creaditCard=" + creditCard);

	}

	/**
	 * The method to process calculation.
	 * 
	 * @param line
	 *            a line of string
	 */
	public static void process(String line) {
		// Read the string line.
		Scanner input = new Scanner(line);
		input.next();
		// Get name of each account.
		String accountName = input.next();
		// Store the accountName as "CreditCard".
		if (accountName.equals("Credit")) {
			accountName = accountName + input.next();
		}
		// Get type of each account.
		String accountType = input.next();
		// Clarify and calculate the money in each account.
		if (accountName.equals("Checking") && accountType.equals("Withdrawal")) {
			checking -= input.nextDouble();
        } else if (accountName.equals("Checking")
				&& accountType.equals("Deposit")) {
			checking += input.nextDouble();
		} else if (accountName.equals("Checking")
				&& accountType.equals("Opening")) {
			// Skip the word "balance to get the number.
			input.next();
			checking += input.nextDouble();
		} else if (accountName.equals("Savings")
				&& accountType.equals("Wtihdrawal")) {
			savings -= input.nextDouble();
		} else if (accountName.equals("Savings")
				&& accountType.equals("Deposit")) {
			savings += input.nextDouble();
		} else if (accountName.equals("Savings")
				&& accountType.equals("Opening")) {
			// Skip the word"balance" to get the number.
			input.next();
			savings += input.nextDouble();
		} else if (accountName.equals("CreditCard")
				&& accountType.equals("Wtihdrawal")) {
			creditCard -= input.nextDouble();
		} else if (accountName.equals("CreditCard")
				&& accountType.equals("Deposit")) {
			creditCard += input.nextDouble();
		} else if (accountName.equals("CreditCard")
				&& accountType.equals("Opening")) {
			// Skip the word "balance" to get the number.
			input.next();
			creditCard += input.nextDouble();
		}

	}

}
