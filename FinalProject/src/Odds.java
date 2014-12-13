import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * 
 */

/**
 * A class to do the calculation and print the game results.
 * @author Tianqi Li
 *
 */
public class Odds {
	//Set variables.
	public static double successrate1;
	public static double successrate2;
	public static double drawrate;
	public static double total1;
	public static double total2;
	public static double odd1;
	public static double odd2;
	
	/**
	 * A method to calculate the success rate and odd.
	 * @param att1 The attack value for team1.
	 * @param mid1 The middle value for team1.
	 * @param def1 The defense value for team1.
	 * @param att2 The attack value for team2.
	 * @param mid2 The middle value for team2.
	 * @param def2 The defense value for team2.
	 */
	 public static void odd (double att1,double mid1, double def1, double att2, double mid2, double def2) {
		 total1= att1+mid1+def1;
		 total2=att2+mid2+def2;
		 drawrate=50-Math.abs(total1-total2);
		 successrate1= (100-drawrate)/2+(total1-total2);
		 successrate2= (100-drawrate)/2+(total2-total1);
		 odd1=(100/successrate1)*0.9;
		 odd2=(100/successrate2)*0.9;
		 //Print results.
		 System.out.println("Success rate for team1:  " + successrate1+"%");
		 System.out.println("Success rate for team2:  " + successrate2+"%");
		 System.out.println("Draw rate:  "+ drawrate+"%");
		 System.out.println("Odd for team1:  " + odd1);
		 System.out.println("Odd for team2:  "+odd2);
	// Declare a scanner to get user input.
		 Scanner console = new Scanner(System.in);
			
		
		}
	 /**
	  * A method to get the score.
	  * @param console The Scanner object to use for user input.
	  * @param teams The ArrayList object to store input variables.
	  */
	 public static void score(Scanner console, ArrayList<TeamRoster> teams){
		 Random rn = new Random();
	        double answer4 = Math.round(rn.nextInt(10)*successrate1*0.01);
	       
	        double answer5 =Math.round(rn.nextInt(10)*successrate2*0.01);
	        //Print results. 
	        System.out.println("Team1: " + answer4);
	        System.out.println("Team2: " + answer5);
	        //Call question4.
	        UserPrompt.question4(console,teams);
	 }

}
	 
