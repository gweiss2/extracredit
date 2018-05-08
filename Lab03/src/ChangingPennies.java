/**
 * @version February 22, 2018
 * @author Gavi Weiss
 * Lab 3 CSC 130 C
 */
import java.util.Scanner;
public class ChangingPennies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scnr = new Scanner(System.in);

			int numPennies;
			    double numDollars;
			    
			    
			      int numQuarter;
			      int numDime;
			      int numNickel;
			      int numPenny;
			    
			      System.out.println("Pennies: ");
			      numPennies = scnr.nextInt();
			      
			      numDollars = (double) (numPennies*.01); 
			      System.out.println("Dollars: $"+ numDollars);
			      
			      numQuarter = (numPennies/ 25);
			    		  System.out.println(numQuarter + " quarters");
			    		  
			    	numDime = ((numPennies% 25) / 10);
			    	System.out.println(numDime +" dimes");
			    	
			    	numNickel = ((((numPennies% 25) %10)/5));
			    	System.out.println(numNickel + " nickels");
			    	
			    	numPenny = (((((numPennies%25)%10)%5)/1));
			    	System.out.println(numPenny + " pennies ");
			    	
			    	double numQuarterDimes;
			   
					numQuarterDimes = ((numQuarter*.25)+(numDime*.10));
			    	System.out.println("Counting only quarters and dimes, you have $" + numQuarterDimes);
			    	
			    	scnr.close();
			    	
			    	// Part 3.5 Challenge //
			    	System.out.println("We can make 0 with four fours: (4 + 4 - 4 - 4) = " + (4 + 4 - 4 - 4));	
			    	System.out.println("We can make 1 with four fours: (4 % 4 + 4 / 4) = " + (4 % 4 + 4 / 4));
			    	System.out.println("We can make 2 with four fours: ((4 * 4)/(4 + 4)) = " + ((4 * 4)/ (4 + 4)));	
			    	System.out.println("We can make 3 with four fours: ((4 * 4 - 4) / 4)) = " + ((4 * 4 - 4) / 4));
			    	System.out.println("We can make 4 with four fours: ((4*(4-4))+4) = " + ((4*(4-4))+4));

 
	    	
	    	
	    	
	      
	      
	      
	      
	      
	}

}
