import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Calculation {
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

	public static void main(String[] args) throws FileNotFoundException {
		// Open input file for reading.
		Scanner fileReader = new Scanner(new File("src/input4.txt"));
		while (fileReader.hasNextLine()) {
			fileReader.nextLine();
			numberLines++;
		}
		fileReader.close();

		// Provision array to hold the values based on the number of the lines
		name = new String[numberLines];
		attack = new double[numberLines];
		middle = new double[numberLines];
		defense = new double[numberLines];
		int i = 0;
		fileReader = new Scanner(new File("src/input4.txt"));
		while (fileReader.hasNext()) {

			name[i] = fileReader.next();
			if (name[i].equals("Manchester")) {
				name[i] = name[i] + " " + fileReader.next();
			}
			attack[i] = fileReader.nextDouble();
			middle[i] = fileReader.nextDouble();
			defense[i] = fileReader.nextDouble();
			i++;
		}
		fileReader.close();

		Scanner console = new Scanner(System.in);
		/* Call question 1 */
		question1(console, att1, mid1, def1);
	}

	public static void question1(Scanner console, double att, double mid,
			double def) {
		/* Ask the user the first question. */
		System.out.println("Question1:Which is the home team?");

		System.out.println("What is your answer?");
		// Record the answer to the string
		String answer1 = "";
		// While loop gives the user a hint to type the answer
		while (!answer1.equalsIgnoreCase("Manchester United")
				&& !answer1.equalsIgnoreCase("Chelsea")
				&& !answer1.equalsIgnoreCase("Manchester City")
				&& !answer1.equalsIgnoreCase("Arsenal")) {
			System.out
					.println("Enter 'Manchester United'or,'Chelsea' or,'Manchester City'or,'Arsenal'");
			answer1 = console.nextLine();
		}
		/* Parse the answer */
		for (int j = 0; j < numberLines; j++) {
			if (answer1.equals(name[j])) {
				att = attack[j];
				mid = middle[j];
				def = defense[j];
			}

		}
		att1 = att;
		mid1 = mid;
		def1 = def;

		System.out.println(att1 + "  " + mid1 + "  " + def1);
		question2(console, att2, mid2, def2);
	}

	public static void question2(Scanner console, double att, double mid,
			double def) {
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
				att = attack[j];
				mid = middle[j];
				def = defense[j];
			}

		}
		att2 = att;
		mid2 = mid;
		def2 = def;
		System.out.println(att2 + "  " + mid2 + "  " + def2);
		Odds.odd(att1, mid1, def1, att2, mid2, def2);
	}
}
