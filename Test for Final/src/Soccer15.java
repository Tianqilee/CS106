import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * A class to read files and use the ArrayList to store input variables.
 * 
 * @author Tianqi Li
 * 
 */
public class Soccer15 {

	public static int numberLines = 0;
	//A variable to track teams.
	public static ArrayList<TeamRoster> teams = new ArrayList<TeamRoster>();

	/**
	 * Main method.
	 * 
	 * @param args
	 *            Arguments passed to the program on the command-line.
	 * @param teamDefense     The defense value of team
	 * @param String          The name of team
	 * @param teamMiddle      The middle value of team
	 * @param teamAttack      The attack value of team
	 * @throws FileNotFoundException
	 */
	public static void main(String[] args) throws FileNotFoundException {
		init("src/input4.txt");
		UserPrompt soccer1 = new UserPrompt();
		soccer1.question1(teams);
	}

	/**
	 * A Method to read file and store inputs.
	 * 
	 * @param filepath The path to the file to load. 
	 * @throws FileNotFoundException      If the file is not found.
	 */
	public static void init(String filepath) throws FileNotFoundException {
		//Read the file
		Scanner fileReader = new Scanner(new File("src/input4.txt"));
		//Count the number of lines in the file.
		while (fileReader.hasNextLine()) {
			fileReader.nextLine();
			numberLines++;
		}
		fileReader.close();
         //Set variables for input file.
		String teamName;
		double teamAttack;
		double teamMiddle;
		double teamDefense;

		int i = 0;
		fileReader = new Scanner(new File("src/input4.txt"));
		//Loop through the file, line by line.
		while (fileReader.hasNext()) {
			teamName = fileReader.next();
			if (teamName.equals("Manchester")) {
				teamName = teamName + " " + fileReader.next();
			}

			teamAttack = fileReader.nextDouble();
			teamMiddle = fileReader.nextDouble();
			teamDefense = fileReader.nextDouble();
			//Add the given values to the list.
			teams.add(new TeamRoster(teamName, teamAttack, teamMiddle,
					teamDefense));

			i++;
		}
		fileReader.close();
        //Print the results.
		for (TeamRoster s : teams) {
			System.out.println(s);
		}
	}
}
