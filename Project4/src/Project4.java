/**
 * 
 */
import java.io.*;
import java.util.*;

/**
 * @author tli1
 * 
 */
public class Project4 {
	static double checking = 0.0;
	static double savings = 0.0;
	static double creditCard = 0.0;

	/**
	 * @param args
	 */
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner fileReader = new Scanner(new File("src/input.txt"));
		while (fileReader.hasNextLine()) {
			String line = fileReader.nextLine();

		}
		fileReader.close();
	}

	public static void process(String line) {
		Scanner input = new Scanner(line);
		input.next();
		String accountName = input.next();
		String accountType = input.next();
		if (accountName.equals("Checking") && accountType.equals("Withdrawal")) {
			checking -= input.nextDouble();
		} else if (accountName.equals("Checking")
				&& accountType.equals("Deposit")) {
			checking += input.nextDouble();
		} else if (accountName.equals("Checking")
				&& accountType.equals("Opening")) {
			checking += input.nextDouble();
		} else if (accountName.equals("Savings")
				&& accountType.equals("Wtihdrawal")) {
			savings -= input.nextDouble();
		} else if (accountName.equals("Savings")
				&& accountType.equals("Deposit")) {
			savings += input.nextDouble();
		} else if (accountName.equals("Savings")
				&& accountType.equals("Opening")) {
			savings += input.nextDouble();
		} else if (accountName.equals("Credit")
				&& accountType.equals("Wtihdrawal")) {
			creditCard -= input.nextDouble();
		} else if (accountName.equals("Credit")
				&& accountType.equals("Deposit")) {
			creditCard += input.nextDouble();
		} else {
			creditCard += input.nextDouble();

		}
	System.out.println("Total Checking ="+checking);
	System.out.println("Total Savings =" +savings);
	System.out.println("Total creaditCard=" +creditCard);
	}

}
