import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author tli1
 *
 */
public class TeamRoster {
//	public String name;
//	public double attack;
//	public double middle;
//	public double defense;
	public static TeamRoster[] teams = null;

	
	public static int numberLines = 0;
	
	public TeamRoster(String teamName, double teamAttack, double teamMiddle, double teamDefense){
//		name = teamName;
//		attack = teamAttack;
//		middle=teamMiddle;
//		defense=teamDefense;
		
	}

	public TeamRoster(String string) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws FileNotFoundException {
		// Open input file for reading.
		Scanner fileReader = new Scanner(new File("src/input4.txt"));
		while (fileReader.hasNextLine()) {
			fileReader.nextLine();
			numberLines++;
		}
		fileReader.close();
		
		String teamName;
		double teamAttack; 
		double teamMiddle; 
		double teamDefense;
		
		int i = 0;
		fileReader = new Scanner(new File("src/input4.txt"));
		while (fileReader.hasNext()) {
			teamName = fileReader.next();
			if (teamName.equals("Manchester")) {
				teamName = teamName + " " + fileReader.next();
			}
			
			teamAttack = fileReader.nextDouble();
			teamMiddle = fileReader.nextDouble();
			teamDefense = fileReader.nextDouble();
			//System.out.println("" + teamName+ teamAttack +teamMiddle +teamDefense);
			//TeamRoster team  = ;
			teams[i] = new TeamRoster(teamName, teamAttack, teamMiddle, teamDefense);
			
			i++;
		}
		fileReader.close();
		System.out.println(teams);
	}
	
	//public String toString(){
		//return ("Team name: " + teamName + " attack: " + teamAttack + " middle: "+ teamMiddle + " defense: " + teamDefense);
	//}
	
}
