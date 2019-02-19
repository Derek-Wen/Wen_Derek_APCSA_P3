//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class RockPaperScissors
{
	private String playChoice;
	private String compChoice;

	public RockPaperScissors()
	{
		setPlayers("","");
	}

	public RockPaperScissors(String player)
	{
		setPlayers(player);
	}

	public void setPlayers(String player)
	{
		playChoice = player;
	}

	public String determineWinner()
	{
		if (playChoice.equals(compChoice)) {
			String winner = "!Draw Game!";
			return winner;
		}
		if (playChoice.equals("R") && compChoice.equals("P")) {
			String winner = "!Player wins";
		}
		String winner="";
		return winner;
	}

	public String toString()
	{
		String output="";
		return output;
	}
}