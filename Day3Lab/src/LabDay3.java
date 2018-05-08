import java.util.Scanner;
public class LabDay3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Enter first value: ");
		int numOne;
		numOne = scnr.nextInt();
		System.out.println("Enter second value: ");
		int numTwo; 
		numTwo = scnr.nextInt();
		
		System.out.println("Results:");
		System.out.println(numOne + "+" + numTwo + "=" + (numOne+numTwo));
		System.out.println(numOne + "-" + numTwo + "=" + (numOne-numTwo));
		System.out.println(numOne + "*" + numTwo + "=" + (numOne*numTwo));
		System.out.println(numOne + "/" + numTwo + "=" + (numOne/numTwo));
		scnr.close();
	}

}
