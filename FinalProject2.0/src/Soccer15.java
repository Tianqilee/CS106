/**
 * 
 */

/**
 * @author tli1
 *
 */
public class Soccer15 {



	/**
	 * @param args
	 * @param teamDefense 
	 * @param String 
	 * @param teamMiddle 
	 * @param teamAttack 
	 */
	public static void main(String[] args, double teamDefense, String teamName, double teamMiddle, double teamAttack) {
		// TODO Auto-generated method stub
       TeamRoster soccer = new TeamRoster(teamName, teamAttack, teamMiddle,teamDefense);
      UserPrompt soccer1 = new UserPrompt();
      soccer1.question1(soccer);
	}

}
