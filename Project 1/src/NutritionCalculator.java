/**
 * 
 */

/**
 * @author tli1
 *
 */
import java.util.*; // for Scanner

public class NutritionCalculator {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner console = new Scanner(System.in);
		double myVal = console.nextDouble();
		System.out.println("Amount of beef:" + myVal + "g");
		System.out.println("Amount of fat:" + Afat(myVal) + "g");
		System.out
				.println("Amount of cholesterol:" + Acholesterol(myVal) + "g");
		System.out.println("Amount of protein:" + Aprotein(myVal) + "g");
		if (Aprotein(myVal) > 56) {
			System.out.println("Sufficient for your body.");
		} else {
			System.out.println("You should eat more!");
		}
		Afat(myVal);
		Acholesterol(myVal);
		Aprotein(myVal);
	}

	// compute FAT
	public static double Afat(double myVal) {
		double fat = myVal * 0.2;
		return fat;
	}

	public static double Acholesterol(double myVal) {
		// compute CHOLESTEROL
		double cholesterol = myVal * 0.25;
		return cholesterol;
	}

	public static double Aprotein(double myVal) {
		// compute PROTEIN
		double protein = myVal * 0.44;
	
			return protein;
		}

	}

    
	
	
	
	
	
	
	
	
	



