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
	double myVal = 200.0 ;
    System.out.println("Amount of beef:" + myVal + "g");
    Afat(myVal);
    Acholesterol(myVal);
    Aprotein(myVal);
    }
	//compute FAT
	public static void Afat(double myVal){
    double fat = myVal * 0.2;
    //print results
    System. out.println("Amount of fat:" + fat + "g");
    }
	public static void Acholesterol(double myVal){
	 //compute CHOLESTEROL 
    double cholesterol = myVal * 0.25;
    //print results
    System.out.println("Amount of cholesterol:" + cholesterol + "g");
	}
	public static void Aprotein(double myVal){
    //compute PROTEIN
    double protein = myVal * 0.44;
    //print results
    System.out.println("Amount of protein:" + protein +"g");
    //@see http://codingbat.com/doc/java-if-boolean-logic.html
    if (protein > 56) {
    //check for condition
    System.out.println("Sufficient for your body.");}
    else {
    //condition isn't met
    System.out.println("You should eat more!"); }	
    }
}
    
	
	
	
	
	
	
	
	
	

