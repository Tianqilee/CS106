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
public class ClubAnalysis {
	static double ratingOfChelsea = 0.0;
	static double ratingOfManchesterCity = 0.0;
	static double ratingOfManchesterUnited = 0.0;
	static double ratingOfArsenal = 0.0;
	static double ageOfChelsea = 0.0;
	static double ageOfManchesterCity = 0.0;
	static double ageOfManchesterUnited = 0.0;
	static double ageOfArsenal = 0.0;
	static double countOfChelsea = 0.0;
	static double countOfManchesterCity = 0.0;
	static double countOfManchesterUnited = 0.0;
	static double countOfArsenal = 0.0;
	

	/**
	 * @param args
	 */
	public int numLines() throws FileNotFoundException {
		int numbLines = 0;
		Scanner fileReader = new Scanner(new File("src/input2.txt"));
		while (fileReader.hasNextLine())
			;
		{
			fileReader.nextLine();
			numbLines++;
		}
		fileReader.close();
		String[] position = new String[numbLines];
		String[] clubName = new String[numbLines];
		double[] rating = new double[numbLines];
		String[] playerName = new String[numbLines];
		double[] age = new double[numbLines];
		int i = 0;
		fileReader = new Scanner(new File("src/input.txt"));
		while (fileReader.hasNext()) {
			position[i] = fileReader.next();
			clubName[i] = fileReader.next();
			if (clubName[i].equals("Manchester")) {
				clubName[i] = clubName[i] + "" + fileReader.next();
			}
			rating[i] = fileReader.nextDouble();
			playerName[i] = fileReader.next();
			age[i] = fileReader.nextDouble();
			i++;
		}
		fileReader.close();

		for (i = 0; i < numbLines; i++) {
			if (clubName[i].equals("Chelsea")) {
				ratingOfChelsea += rating[i];
				ageOfChelsea += age[i];
				countOfChelsea++;
			} else if (clubName[i].equals("ManchesterCity")) {
				ratingOfManchesterCity += rating[i];
				ageOfManchesterCity += age[i];
				countOfManchesterCity++;
			} else if (clubName[i].equals("ManchesterUnited")) {
				ratingOfManchesterUnited += rating[i];
				ageOfManchesterUnited += age[i];
				countOfManchesterUnited++;
			} else {
				ratingOfArsenal += rating[i];
				ageOfArsenal += age[i];
				countOfArsenal++;
			}
		double averageRatingC =ratingOfChelsea/countOfChelsea;
		double averageAgeC= ageOfChelsea/countOfChelsea;
		double averageRatingMC=ratingOfManchesterCity/countOfManchesterCity;
		double averageAgeMC=ratingOfManchesterCity/countOfManchesterCity;
		double averageRatingMU=ratingOfManchesterUnited/countOfManchesterUnited;
		double averageAgeMU=ratingOfManchesterUnited/countOfManchesterUnited;
		double averageRatingA=ratingOfManchesterCity/countOfManchesterCity;
		double averageAgeA=ratingOfArsenal/countOfArsenal;
       System.out.println("Average rating of Chelsea"+averageRatingC);
       System.out.println("Average age of Chelsea" +averageAgeC);
       System.out.println("Average rating of Manchester City" +averageRatingMC);
       System.out.println("Average age of Manchester City" + averageAgeMC);
       System.out.println("Average rating of Manchester United"+averageRatingMU);
       System.out.println("Average age of Machester United" +averageAgeMU);
       System.out.println("Average rating of Arsenal" +averageRatingA);
       System.out.println("Average age of Arsenal" + averageAgeA);
		}
		return i;
	}
}
