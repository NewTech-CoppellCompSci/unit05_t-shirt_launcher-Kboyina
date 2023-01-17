package labs;

import java.util.Scanner;

public class Lab01 {

	
	
	public static void main(String[] args) {
		
		problem1();
		problem2();
		problem3();
		problem4();
		
		
	}
	
	
	public static void problem1() {
		Scanner inKey = new Scanner(System.in);
		
		System.out.print("Enter a positive integer: ");
		int integer1 = inKey.nextInt();
		System.out.print("Enter another positive integer: ");
		int integer2 = inKey.nextInt();
		
		System.out.println(integer1 + "^"+ integer2 +" = " + Math.pow(integer1, integer2));
				
	}
	
	
	
	public static void problem2() {
Scanner inKey = new Scanner(System.in);
		
		System.out.print("Enter a positive number: ");
		int integer1 = inKey.nextInt();
				
		System.out.println("The square root of "+ integer1 +" is " + Math.sqrt(integer1));
	}
	
	
	
	public static void problem3() {
		Scanner inKey = new Scanner(System.in);
		
		System.out.print("Length of side A:");
		double integer1 = inKey.nextInt();
		System.out.print("Length of side B: ");
		double integer2 = inKey.nextInt();
		
		double A = Math.pow(integer1, 2);
		double B = Math.pow(integer2, 2);
		
		double Hypotenuse = A + B ;
		
		double hypotenuse = Math.sqrt(Hypotenuse);
		
		System.out.println("Hypotenuse = "+ hypotenuse);
				
	}
	
	
	
	public static void problem4() {
		
		int max = Integer.MIN_VALUE; //start as low as possible so it goes up from there
		int min = Integer.MAX_VALUE;
		int input = 0;
		
		Scanner inKey = new Scanner(System.in);
		
		boolean value = true;
		
		while (value)  {
			
			System.out.print("Enter an integer: ");
			input = inKey.nextInt();
			
			if (input != 0 ) {
//			System.out.print("Enter an integer: ");
//			input = inKey.nextInt();
			
			//compare current input with current max
			max = Math.max(max, input);
			min = Math.min(min,input);			
			}
			
			else {
				value = false;
				
				max = Math.max(max, input);
				min = Math.min(min,input);	
			}
		}
		
		System.out.println("Max = " + max);
		System.out.println("Min = " + min);
		
		
	}
	
	
	
}
