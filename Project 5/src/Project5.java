import java.io.FileNotFoundException;

/**
 * @author Tianqi Li A class containing a program to parse soccer team data and
 *         perform reporting
 */
public class Project5 {

	/**
	 * Main method. Responsible for primary controller routing.
	 * 
	 * @param args
	 *            Arguments passed to the program.
	 * @throws FileNotFoundException
	 *             If file is not found.
	 */
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		ClubAnalysis soccer = new ClubAnalysis();
		soccer.analyze();
	}

}
