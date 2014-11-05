/**
 * @author Tianqi Li A class to provide club data
 * 
 */
public class ClubData {
	// A variable to track the position.
	public String position;
	// A variable to track the club name.
	public String clubName;
	// A variable to track the rating.
	public double rating;
	// A variable to track the player name.
	public String playerName;
	// A variable to track the age
	public double age;

	/**
	 * Constructor function. Sets initial values based on provide values.
	 * 
	 * @param initPosition
	 *            The starting position.
	 * @param initClubName
	 *            The starting club name.
	 * @param initRating
	 *            The starting rating.
	 * @param initPlayerName
	 *            The starting player name.
	 * @param initAge
	 *            The starting age.
	 */
	public ClubData(String initPosition, String initClubName,
			double initRating, String initPlayerName, double initAge) {
		// Set variables.
		this.position = initPosition;
		this.clubName = initClubName;
		this.rating = initRating;
		this.playerName = initPlayerName;
		this.age = initAge;
	}

}
