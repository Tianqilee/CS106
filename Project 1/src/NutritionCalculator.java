/**
 * 
 */

/**
 * @author tli1
 *
 */
public class NutritionCalculator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    double myVal = 110.0;
    System.out.println("Amount of beef:" + myVal + "g");
    double fat;
    double cholesterol;
    double protein;
    //compute FAT
    fat = myVal * 0.2;
    //print results
    System. out.println("Amount of fat:" + fat + "g");
    //compute CHOLESTEROL
    cholesterol = myVal * 0.25;
    //print results
    System.out.println("Amount of cholesterol:" + cholesterol + "g");
    //compute PROTEIN
    protein = myVal * 0.44;
    //print results
    System.out.println("Amount of protein:" + protein +"g");
    if (protein > 56) {
    System.out.println("Sufficient for your body.");}
    else {
    System.out.println("You should eat more!"); }	
    }
}
