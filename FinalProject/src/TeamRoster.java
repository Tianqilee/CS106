import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/**
 * A class to set variables for input file and check user's answer
 * @author Tianqi Li
 * 
 */
public class TeamRoster {

	// Set variables.
	public String name;
	public double attack;
	public double middle;
	public double defense;

	/**
	 * Constructor function. Sets initial values based on provided values.
	 * 
	 * @param teamName
	 *            The starting name
	 * @param teamAttack
	 *            The starting attack value
	 * @param teamMiddle
	 *            The starting middle value
	 * @param teamDefense
	 *            The starting defense value
	 */
	public TeamRoster(String teamName, double teamAttack, double teamMiddle,
			double teamDefense) {
		name = teamName;
		attack = teamAttack;
		middle = teamMiddle;
		defense = teamDefense;
	}

	/**
	 * The method to explore the constructor called value in the String form.
	 */
	public String toString() {
		return "Team name: " + name + " Attack: " + attack + " Middle: "
				+ middle + " Defense: " + defense;
	}

	/**
	 * A method to check the user's answer.
	 * 
	 * @param answer
	 *            The user's input.
	 * @param teams
	 *            The ArrayList object to store input variables.
	 * @return boolean true or false.
	 */
	public static boolean teamNameFound(String answer,
			ArrayList<TeamRoster> teams) {
		boolean found = false;
		// Loop through all teams in the ArrayList of whether the name was found
		// or not.
		for (int j = 0; j < Soccer15.numberLines; j++) {
			if (answer.equals(teams.get(j).name)) {
				found = true;
			}
		}
		return found;
	}
}
