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
public class Question4 {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */

 public static void main(String[] args) throws FileNotFoundException {
 Scanner fileReader = new Scanner(new File("src/input3.txt"));
	           int numberLines = 0;
			 while (fileReader.hasNextLine()) {
					fileReader.nextLine();
				    
					numberLines++;
				}
			
				fileReader.close();

			
				fileReader = new Scanner(new File("src/input3.txt"));
				while (fileReader.hasNext()) {
         String line=fileReader.nextLine();

             if(line.contains("Nemo")||line.contains("nemo")||line.contains("NeMo")){
                 System.out.println("Found");}
        else if(line.contains("EOI")){
        	fileReader.close();
        }
             else{
            	 System.out.println("Missing");
             }
         }
     }
}   


     