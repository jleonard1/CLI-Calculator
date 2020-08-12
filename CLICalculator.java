package wk3_hw;

import java.util.Scanner;

/*CLI Calculator - Part One
 * Authors : Juaniesha and Charu*/

public class CLICalculator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Welcome to the CLI Calculator");
		System.out.println("\nOperations: \n1:Addition \n2:Subtraction \n3:Multiplication \n4:Division");
		System.out.println("\nChoose your operation: ");
		int operation = input.nextInt();
		System.out.println("\nFirst Number: ");
		int number1 = input.nextInt();
		System.out.println("Second Number: ");
		int number2 = input.nextInt();
	
		int result;
		
		if(operation ==1) //addition
		{ 
			result = number1 + number2;
			System.out.println("Result: " +result);
		}
		else if(operation ==2) //subtraction
		{
			result = number1 - number2;
			System.out.println("Result: " +result);
		}
		else if (operation ==3) 
		{
			result = number1 * number2;
			System.out.println("Result: " +result);
		}
		
		else if (operation ==4){
			
			if(number2==0) {
				System.out.println("Result cannot be divided by 0");
			}
			else
			{
				result = number1/number2;
				System.out.println("Result: " +result);
			}
	}
		else
		{System.out.println("Please enter valid operation number.");
}
}
}
