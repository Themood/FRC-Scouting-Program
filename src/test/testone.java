package test;

import java.util.Scanner;

import com.cpjd.main.TBA;
import com.cpjd.models.Team;
import com.cpjd.models.Event; 

public class testone {

	private static Scanner user_input;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        // Get everything set up
		        TBA.setID("Data Buckets", "Scouting app", "V.01");
		        TBA tba = new TBA();
		        user_input = new Scanner(System.in);
		    
		        
		        // Print some information
		     
		        //event info
		       System.out.println(Event.teams);
		        
		        
		        
		        
		        //team info
		        //int teamnumber;
		        //teamnumber = user_input.nextInt();
		        //figure out the input thing
		        Team team = tba.getTeam(118);
		        System.out.println(team.name);
		        System.out.println(team.team_number);
		        System.out.println(team.website);
		        System.out.println(team.locality);
		        System.out.println(team.region);
		        System.out.println(team.country_name);
		        System.out.println(team.location);
		        System.out.println(team.key);
		        System.out.println(team.nickname);
		        System.out.println(team.rookie_year);
		        System.out.println(team.motto);
		    }
	}
