//Get the scanner to get user input.
import java.util.*;

/**
 * 
 */

/**
 * @author tli1
 * 
 */
public class CharacterTest {

	/**
	 * The main method
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int disruptive = 0;
		int incremental = 0;
		/* Declare a scanner to get user input. */
		Scanner console = new Scanner(System.in);
		 question1(console,disruptive,incremental);
		
	}
	public static void question1(Scanner console, int disruptive,
			int incremental) {
		System.out.println("question");
		System.out.println("A");
		System.out.println("B");
		System.out.println("What is your answer?");
		String answer1 = console.nextLine();
		if (answer1.equals("A")) {
			disruptive++;
		} else  {
			incremental++;
		}
		question2(console,disruptive,incremental);
	}
	public static void question2(Scanner console, int disruptive,
			int incremental) {
		System.out.println("question");
		System.out.println("A");
		System.out.println("B");
		System.out.println("What is your answer?");
		String answer1 = console.nextLine();
		if (answer1.equals("A")) {
			disruptive++;
		} else {
			incremental++;
		}
		question3(console,disruptive,incremental);
	}
	public static void question3(Scanner console, int disruptive,
			int incremental) {
		System.out.println("question");
		System.out.println("A");
		System.out.println("B");
		System.out.println("What is your answer?");
		String answer1 = console.nextLine();
		if (answer1.equals("A")) {
			disruptive++;
		} else {
			incremental++;
		}
		question4(console,disruptive,incremental);
	}	public static void question4(Scanner console, int disruptive,
			int incremental) {
		System.out.println("question");
		System.out.println("A");
		System.out.println("B");
		System.out.println("What is your answer?");
		String answer1 = console.nextLine();
		if (answer1.equals("A")) {
			disruptive++;
		} else {
			incremental++;
		}
		question5(console,disruptive,incremental);
	}	public static void question5(Scanner console, int disruptive,
			int incremental) {
		System.out.println("question");
		System.out.println("A");
		System.out.println("B");
		System.out.println("What is your answer?");
		String answer1 = console.nextLine();
		if (answer1.equals("A")) {
			disruptive++;
		} else {
			incremental++;
		}
		question6(console,disruptive,incremental);
	}	public static void question6(Scanner console, int disruptive,
			int incremental) {
		System.out.println("question");
		System.out.println("A");
		System.out.println("B");
		System.out.println("What is your answer?");
		String answer1 = console.nextLine();
		if (answer1.equals("A")) {
			disruptive++;
		} else {
			incremental++;
		}
		question7(console,disruptive,incremental);
	}	
	public static void question7(Scanner console, int disruptive,
			int incremental) {
		System.out.println("question");
		System.out.println("A");
		System.out.println("B");
		System.out.println("What is your answer?");
		String answer1 = console.nextLine();
		if (answer1.equals("A")) {
			disruptive++;
		} else  {
			incremental++;
		}
		 getResults(disruptive, incremental);
	}
public static void getResults(int disruptive, int incremental) {

		// Determine the user's matching character base on the criteria.
		if (disruptive > incremental && disruptive>=6) {
			System.out.print("You are A");
		} else if (disruptive > incremental && disruptive < 6) {
			System.out.println("You are B");
		} else if (incremental < disruptive && incremental >=6){
			System.out.println("You are C");
		}else if (incremental < disruptive && incremental <6){
			System.out.println("You are D");
		}
	}
}