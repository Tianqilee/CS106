import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * A class to ask user the question and run the soccer game simulator.
 * 
 * @author Tianqi Li
 * 
 */
public class UserPrompt {
	// Set variables.
	public static double att1;
	public static double mid1;
	public static double def1;
	public static double att2;
	public static double mid2;
	public static double def2;
	// Declare a scanner to get user input.
	public static Scanner console = new Scanner(System.in);

	/**
	 * A method to ask the first question and print the values for team1.
	 * 
	 * @param teams
	 *            The ArrayList object to store input variables.
	 */
	public static void question1(ArrayList<TeamRoster> teams) {
		// Ask the user the first question.
		System.out.println("Question1:Which is the home team?");

		// Record the answer to the string.
		String answer1 = "";
		// While loop gives the user a hint to type the answer.
		while (!TeamRoster.teamNameFound(answer1, teams)) {
			System.out
					.println("Enter 'Manchester United'or,'Chelsea' or,'Manchester City'or,'Arsenal'");
			answer1 = console.nextLine();
		}
		// Parse the answer and get the values.
		for (int j = 0; j < Soccer15.numberLines; j++) {
			if (answer1.equals(teams.get(j).name)) {
				att1 = teams.get(j).attack;
				mid1 = teams.get(j).middle;
				def1 = teams.get(j).defense;
			}

		}

		// Print the data for team1.
		System.out.println("Attack: " + att1 + "  " + "Middle: " + mid1 + "  "
				+ "Defense: " + def1);
		// Call question2.
		question2(teams);
	}

	/**
	 * A method to ask the second question and print values for team2.
	 * 
	 * @param teams
	 *            The ArrayList object to store input variables.
	 */
	public static void question2(ArrayList<TeamRoster> teams) {
		// Ask the user the second question.
		System.out.println("Question2:which is the away team?");

		// Record the answer to the string.
		String answer2 = "";
		// While loop gives the user a hint to type the answer.
		while (!TeamRoster.teamNameFound(answer2, teams)) {
			System.out
					.println("Enter 'Manchester United'or,'Chelsea' or,'Manchester City'or,'Arsenal'");
			answer2 = console.nextLine();
		}
		// Parse the answer and get the values.
		for (int j = 0; j < Soccer15.numberLines; j++) {
			if (answer2.equals(teams.get(j).name)) {
				att2 = teams.get(j).attack;
				mid2 = teams.get(j).middle;
				def2 = teams.get(j).defense;
			}

		}
		// Print the data for team2.
		System.out.println("Attack: " + att2 + "  " + "Middle: " + mid2 + "  "
				+ "Defense:" + def2);
		// Call the method for calculation.
		Odds.odd(att1, mid1, def1, att2, mid2, def2);
		// Call question3.
		question3(console, teams);
	}

	/**
	 * A method to ask the third question and start the game.
	 * 
	 * @param console
	 *            The Scanner object to use for user input
	 * @param teams
	 *            The ArrayList object to store input variables
	 */
	public static void question3(Scanner console, ArrayList<TeamRoster> teams) {
		// Ask the user the third question.
		System.out.println("Enter 'Start' to start the game.");
		// Record the answer to the string.
		String answer3 = "";
		// While loop gives the user a hint to type the answer.
		while (!answer3.equalsIgnoreCase("Start")) {
			System.out.println("Enter 'Start'.");
			answer3 = console.nextLine();

		}
		// Call the method for the score.
		Odds.score(console, teams);
	}

	/**
	 * A method to ask the fourth question and provide options for user to
	 * choose.
	 * 
	 * @param console
	 *            The Scanner object to use for user input.
	 * @param teams
	 *            The ArrayList object to store input variables.
	 */
	public static void question4(Scanner console, ArrayList<TeamRoster> teams) {
		// Ask the fourth question.
		System.out
				.println("Choose 'A' to restart or choose 'B' to select team or Choose 'C' to end the game");
		String answer6 = "";
		// While loop gives the user a hint to type the answer.
		while (!answer6.equalsIgnoreCase("A")
				&& (!answer6.equalsIgnoreCase("B") && (!answer6
						.equalsIgnoreCase("C")))) {
			System.out.println("Enter 'A','B' or 'C'.");
			answer6 = console.nextLine();
			// Parse the answer.
			if (answer6.equals("A")) {
				// Call back question3
				UserPrompt.question3(console, teams);
			} else if (answer6.equals("B")) {
				// Call back question1
				UserPrompt.question1(teams);
			} else if (answer6.equals("C")) {
				System.out.println("The game is over.");
				// End the program.
				break;

			}
		}
	}
}
