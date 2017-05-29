package test;

import java.io.FileNotFoundException;
import java.util.Scanner;

import com.cpjd.main.Settings;
import com.cpjd.main.TBA;
import com.cpjd.models.Team;
import com.cpjd.models.Event;
import com.cpjd.models.Match;
import test.StatSettings;


public class testone {

	private static Scanner user_input;
	public static int teamNumber;
	//public static String eventcode;

	public static void main(String[] args) throws FileNotFoundException {
	

		// Get everything set up
		TBA.setID("Data Buckets", "Scouting app", "V.01");
		TBA tba = new TBA();
		user_input = new Scanner(System.in);
		boolean inputloop = true;
		Settings.GET_EVENT_MATCHES = true;
		Settings.GET_EVENT_ALLIANCES = true;
		Settings.FIND_TEAM_RANKINGS = true;
		while (inputloop = true) {
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
			} 
			else if (command.equalsIgnoreCase("Event")) {
				//eventcode = user_input.next();
				Event event = new TBA().getEvent(StatSettings.eventcode);
				for (int i = 0; i < StatSettings.numberofteams; i++) {
				System.out.println(event.teams[i].nickname+" Rank: "+event.teams[i].rank+" Score: "+event.teams[i].rankingScore);
				}
				//System.out.println(StatSettings.numberofteams);
				//System.out.println(StatSettings.eventcode);
				// System.out.println("WORK IN PROGRESS");
			}
			else {
				System.out.println("Unknown Command");
			}
		}
	}}
	

