import java.util.Scanner;
public class ObjectDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      Scanner scnr = new Scanner(System.in);

		int userDay;
		int userMonth;
		int userYear;
		

			Day newDay = new Day(); 
			
			System.out.println("Todays date: "+ newDay.getDayOfMonth() +"/"+ newDay.getMonth() +"/"+ newDay.getYear());
			
			System.out.println("Enter birth day: ");
	         userDay = scnr.nextInt();
			System.out.println("Enter birth month (#): ");
			userMonth = scnr.nextInt();
			System.out.println("Enter birth year: ");
			userYear = scnr.nextInt();
			
			Day Birthday = new Day(userYear, userMonth, userDay);

			int numberOfDays;
			numberOfDays = newDay.daysFrom(Birthday);
			System.out.println("Days you've been alive: " + numberOfDays);
			
			newDay.addDays(100);
			System.out.println("In 100 days the date will be: "+ newDay.getDayOfMonth() +"/"+ newDay.getMonth() +"/"+ newDay.getYear());
			
			scnr.close();
	}

}
