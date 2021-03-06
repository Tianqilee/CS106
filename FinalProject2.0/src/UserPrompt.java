import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class UserPrompt {
	public static int numberLines = 0;
	public static double[] attack;
	public static String[] name;
	public static double[] middle;
	public static double[] defense;
	public static double att1;
	public static double mid1;
	public static double def1;
	public static double att2;
	public static double mid2;
	public static double def2;
	public static Scanner console = new Scanner(System.in);
   TeamRoster teams= new TeamRoster("src/input4.txt");
	public static void question1(TeamRoster soccer) {
		/* Ask the user the first question. */
		System.out.println("Question1:Which is the home team?");

		System.out.println("What is your answer?");
		// Record the answer to the string
		String answer1 = "";
		// While loop gives the user a hint to type the answer
		while (!answer1.equalsIgnoreCase(teamRoster.teams[].name){
			System.out
					.println("Enter 'Manchester United'or,'Chelsea' or,'Manchester City'or,'Arsenal'");
			answer1 = console.nextLine();
		}
		/* Parse the answer */
		for (int j = 0; j < numberLines; j++) {
			if (answer1.equals( teams.get(j).teamName)) {
				att1 = attack[j];
				mid1 = middle[j];
				def1 = defense[j];
			}

		}
		

		System.out.println(att1 + "  " + mid1 + "  " + def1);
		question2();
	}

	public static void question2() {
		// Ask the user the second question.
		System.out.println("Question2:which is the away team?");
		System.out.println("What is your answer?");
		// Record the answer to the string
		String answer2 = "";
		// While loop gives the user a hint to type the answer
		while (!answer2.equalsIgnoreCase("Manchester United")
				&& !answer2.equalsIgnoreCase("Chelsea")
				&& !answer2.equalsIgnoreCase("Manchester City")
				&& !answer2.equalsIgnoreCase("Arsenal")) {
			System.out
					.println("Enter 'Manchester United'or,'Chelsea' or,'Manchester City'or,'Arsenal'");
			answer2 = console.nextLine();
		}

		// Parse the answer
		for (int j = 0; j < numberLines; j++) {
			if (answer2.equals(name[j])) {
				att2 = attack[j];
				mid2 = middle[j];
				def2 = defense[j];
			}

		}
		
		System.out.println(att2 + "  " + mid2 + "  " + def2);
		Odds.odd(att1, mid1, def1, att2, mid2, def2);
	}
}
