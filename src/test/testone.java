package test;

import java.io.FileNotFoundException;
import java.util.Scanner;

import com.cpjd.main.Settings;
import com.cpjd.main.TBA;
import com.cpjd.models.Team;
import com.cpjd.models.Event;
import com.cpjd.models.Match;

public class testone {

	private static Scanner user_input;
	public static int teamNumber;
	public static String eventinput;

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		// Get everything set up
		TBA.setID("Data Buckets", "Scouting app", "V.01");
		TBA tba = new TBA();
		user_input = new Scanner(System.in);
		boolean inputloop = true;
		Settings.GET_EVENT_MATCHES = true;
		Settings.GET_EVENT_ALLIANCES = true;
		while (inputloop = true) {
			// Print some information

			// event info
			// System.out.println(Event.teams);

			String command = user_input.next();
			if (command.equalsIgnoreCase("Team")) {

				teamNumber = user_input.nextInt();
				
				
				Team team = tba.getTeam(teamNumber);
				System.out.println(team.team_number);
				System.out.println(team.website);
				System.out.println(team.location);
				System.out.println(team.key);
				System.out.println(team.nickname);
				System.out.println(team.rookie_year);
				System.out.println(team.motto);
			} else if (command.equalsIgnoreCase("Event")) {
				eventinput = user_input.next();
				Event event = new TBA().getEvent(eventinput);
				System.out.println(event.start_date);

				// System.out.println("WORK IN PROGRESS");
			}

			else {
				System.out.println("Unknown Command");
			}
		}
	}
}
