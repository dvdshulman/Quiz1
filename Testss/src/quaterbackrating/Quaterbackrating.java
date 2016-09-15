package quaterbackrating;

import java.util.Scanner;

public class Quaterbackrating {
		public int Touchdowns;
		public int Totalyards;
		public int Passattempts;
		public int Interceptions;
		public int Completions;

		Scanner stat_inputs = new Scanner( System.in );
				
		System.out.println("Number of Touchdowns : ");
		Touchdowns = input.next(); 

		System.out.println("Total Yards : ");
		Totalyards = input.nextInt(); 

		System.out.println("Pass Attempts : ");
		Passattempts = input.nextDouble(); 
		
		System.out.println("Completions : ");
		Completions = input.next(); 

		System.out.println("Interceptions : ");
		Interceptions = input.nextInt(); 
		
	public class Formula{
		public double Line1 = ((Completions/Passattempts)- 0.3) * 5;
		public double Line2 = ((Totalyards/Passattempts) - 3) * 0.25;
		public double Line3 = (Touchdowns/Passattempts) * 20;
		public double Line4 = 2.375 - ((Interceptions/Passattempts) * 25);
	}
	public class Answer{
		public double Solution = ((Line1 + Line2 + Line3 + Line4)/6) * 100;
	}
}

