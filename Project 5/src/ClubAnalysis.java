import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @author Tianqi Li A class to analyze the data and print results.
 */
public class ClubAnalysis {
	// Set variables
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
	 * A method to read file and analyze data.
	 * 
	 * @param throws FileNotFoundException If the file is not found.
	 */
	public void analyze() throws FileNotFoundException {
		int numbLines = 0;
		// Open input file.
		Scanner fileReader = new Scanner(new File("src/input2.txt"));
		// Read each line of the file.
		while (fileReader.hasNextLine()) {
			fileReader.nextLine();
			numbLines++;
		}
		// Close input file.
		fileReader.close();
		// provision an array of ClubData objects to hold the values based on
		// the number of lines in the file.
		ClubData[] clubData = new ClubData[numbLines];
		// Populate the array from the file.
		int i = 0;
		fileReader = new Scanner(new File("src/input2.txt"));
		while (fileReader.hasNext()) {
			// Get the position.
			String position = fileReader.next();
			// Get the club name.
			String clubName = fileReader.next();
			// If the club name is Manchester, also add the next word.
			if (clubName.equals("Manchester")) {
				clubName = clubName + "" + fileReader.next();
			}
			// Get the rating.
			double rating = fileReader.nextDouble();
			// Get the player name.
			String playerName = fileReader.next();
			// Get the age.
			double age = fileReader.nextDouble();
			// Add a ClubData object to the array with the values we just
			// pulled.
			clubData[i] = new ClubData(position, clubName, rating, playerName,
					age);
			i++;
		}
		fileReader.close();
		// Clarify and calculate the values.
		for (i = 0; i< clubData.length; i++) {
			if (clubData[i].clubName.equals("Chelsea")) {
				ratingOfChelsea += clubData[i].rating;
				ageOfChelsea += clubData[i].age;
				countOfChelsea++;
			} else if (clubData[i].clubName.equals("ManchesterCity")) {
				ratingOfManchesterCity += clubData[i].rating;
				ageOfManchesterCity += clubData[i].age;
				countOfManchesterCity++;
			} else if (clubData[i].clubName.equals("ManchesterUnited")) {
				ratingOfManchesterUnited += clubData[i].rating;
				ageOfManchesterUnited += clubData[i].age;
				countOfManchesterUnited++;
			} else if (clubData[i].clubName.equals("Arsenal")) {
				ratingOfArsenal += clubData[i].rating;
				ageOfArsenal += clubData[i].age;
				countOfArsenal++;
			}
		}
		//Set formulas for variables
		float averageRatingC = (float) (ratingOfChelsea / countOfChelsea);
		float averageAgeC = (float) ( ageOfChelsea / countOfChelsea);
		float averageRatingMC = (float) (ratingOfManchesterCity / countOfManchesterCity);
		float averageAgeMC = (float) (ageOfManchesterCity / countOfManchesterCity);
		float averageRatingMU = (float) (ratingOfManchesterUnited
				/ countOfManchesterUnited);
		float averageAgeMU = (float) (ageOfManchesterUnited
				/ countOfManchesterUnited);
		float averageRatingA = (float) (ratingOfArsenal / countOfArsenal);
		float averageAgeA = (float) (ageOfArsenal / countOfArsenal);
		//Print results
		System.out.println("Average rating of Chelsea:" +" "+ averageRatingC);
		System.out.println("Average age of Chelsea:" + " " + averageAgeC);
		System.out.println("Average rating of Manchester City:" +" " 
				+ averageRatingMC);
		System.out.println("Average age of Manchester City:" + " " + averageAgeMC);
		System.out.println("Average rating of Manchester United:" + " " 
				+ averageRatingMU);
		System.out.println("Average age of Machester United:" + " " + averageAgeMU);
		System.out.println("Average rating of Arsenal:" + " " + averageRatingA);
		System.out.println("Average age of Arsenal:" + " " +averageAgeA);
	}
}
