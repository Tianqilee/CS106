import java.util.Random;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author tli1
 *
 */
public class Odds {
	public static double successrate1;
	public static double successrate2;
	public static double drawrate;
	public static double total1;
	public static double total2;
	public static double odd1;
	public static double odd2;
	
	
	 public static void odd (double att1,double mid1, double def1, double att2, double mid2, double def2) {
		 total1= att1+mid1+def1;
		 total2=att2+mid2+def2;
		 drawrate=50-Math.abs(total1-total2);
		 successrate1= (100-drawrate)/2+(total1-total2);
		 successrate2= (100-drawrate)/2+(total2-total1);
		 odd1=(100/successrate1)*0.9;
		 odd2=(100/successrate2)*0.9;
		 System.out.println(successrate1+"%");
		 System.out.println(successrate2+"%");
		 System.out.println(drawrate+"%");
		 System.out.println(odd1);
		 System.out.println(odd2);
		 Scanner console = new Scanner(System.in);
		 question3(console);
		 
}
	 public static void question3(Scanner console) {
		 System.out.println("Enter 'Start' to start the game.");
		 String answer3 = "";
			// While loop gives the user a hint to type the answer
			while (!answer3.equalsIgnoreCase("Start")) {
				System.out.println("Enter 'Start'.");
				answer3 = console.nextLine();
			}
			Random rn = new Random();
		        double answer4 = Math.round(rn.nextInt(10)*successrate1*0.01);
		        System.out.println(answer4);
		        double answer5 =Math.round(rn.nextInt(10)*successrate2*0.01);
		        System.out.println(answer5);
		        question4(console);
		    }
	 public static void question4(Scanner console) {
		 System.out.println("Enter 'Start' to start the game.");
		 String answer6= "";
			// While loop gives the user a hint to type the answer
			while (!answer6.equalsIgnoreCase("Start")) {
				System.out.println("Enter 'Start'.");
				answer6 = console.nextLine();
			}
			Random rn = new Random();
		        double answer7 = Math.round(rn.nextInt(10)*successrate1*0.01);
		        System.out.println(answer7);
		        double answer8 =Math.round(rn.nextInt(10)*successrate2*0.01);
		        System.out.println(answer8);
}
}