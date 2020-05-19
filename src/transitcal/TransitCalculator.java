package transitcal;

import java.util.*;

public class TransitCalculator {

	/* This is a project for Best Fare Calculator Question of Codecademy.
	 * For example, if I want to stay NYC for 5 days with 12 rides,
	 * The output should be like this:
	 * 
	 * 'You should get the Pay-per-Ride option at 2.75 per ride.'
	 * 
	 * So here is my solution. Hopefully it would be helpful for students who start to learn a programming. 
	 * Of course, someone might give better idea, so it's up to you whether you choose this or not.
	 * 
	 */ 
	
	
	static String [] options = new String[] {"Pay-per-Ride", "7-day Unlimited", "30-day Unlimited"};
	static double [] fares = new double[] {2.75,33.00,127.00};
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("How many days will you stay in NYC? : ");
		int day = scan.nextInt();
		System.out.print("How many times will you take a public transportation? : ");
		int ride = scan.nextInt();
		
		System.out.println(getBestFare(day,ride));
		
		
	}
	
	public static String getBestFare(int day, int ride) {
		
		int week = 1;
		int month = 1;
		
		if (day%7!=0 && day>7) {
			week = day/7 + 1;
		}
		if (day%30!=0 && day>30) {
			month = day/30 + 1;
		}
		
		if (payPerRide() <= unlimited7Price(week,ride) && payPerRide() <= unlimited30Price(month,ride)) {
			return "You should get the " + options[0] + " option at $"+ fares[0] +" per ride.";
		} else if (unlimited7Price(week,ride) <= payPerRide() && unlimited7Price(week,ride) <= unlimited30Price(month,ride)) {
			return "You should get the " + options[1]+ " option at $" + Math.round(unlimited7Price(week,ride)*100)/100.0 +" per ride.";
		} else {
			return "You should get the " + options[2]+ " option at $" + Math.round(unlimited30Price(month,ride)*100)/100.0+" per ride.";
		}
		
	}
	
	
	public static double unlimited7Price(int week, int rides) {
		
		
		return fares[1] * week / rides;
	}
	
	
	public static double unlimited30Price(int month, int rides) {
		
		
		return fares[2] * month / rides;
	}
	
	public static double payPerRide() {
		
		
		return fares[0];
	}
	
}