package labs;

import java.util.Scanner;

public class Lab02 {

	public static void main(String[] args) {

		problem1();
		problem2();
		problem3();
		problem4();

	}


	public static void problem1() {
		
		Scanner inKey = new Scanner(System.in);
		System.out.print("\nEnter a positive integer: ");
		int int1 = inKey.nextInt();
		System.out.print("Enter another positive integer: ");
		int int2 = inKey.nextInt();
		
		 if(int1>int2) {
			 int max = int1;
			 int min = int2;
			 
				for(int i = 0 ; i < 100; i++) {
					int x = (int) (Math.random() * (max - min + 1)) + min;
					
					System.out.println(x);
				}
		 }
		 
		 else {
			 int min = int1 ;
			 int max = int2;
			 
				for(int i = 0 ; i < 20; i++) {
					int x = (int) (Math.random() * (max - min + 1)) + min;
					
					System.out.println(x);	
				}
		 

		 }
		 
		 }
	


	public static void problem2() {
		
		Scanner inKey = new Scanner(System.in);
		System.out.print("\nEnter a radius: ");
		double int1 = inKey.nextDouble();
		System.out.print("Enter height: ");
		double int2 = inKey.nextDouble();
		
		double Pi = Math.PI ;
		double rad = Math.pow(int1, 2);
		double Pi_x_radius = Pi * rad ;		
		double math = Pi_x_radius * int2 ;
		
		System.out.println("cylinder’s volume:"+ math);
		
		
	}


	public static void problem3() {
		
		Scanner inKey = new Scanner(System.in);
		System.out.print("\nEnter x1: ");
		double x1 = inKey.nextDouble();
		System.out.print("Enter y1: ");
		double y1 = inKey.nextDouble();
		System.out.print("\nEnter x2: ");
		double x2 = inKey.nextDouble();
		System.out.print("Enter y2: ");
		double y2 = inKey.nextDouble();
		
		double bracket1 = x1-x2;
		double bracket2 = y1-y2;
		
		double bracket_power1= Math.pow(bracket1, 2);
		
		double bracket_power2= Math.pow(bracket2, 2);
		
		double The_power_of_bracket = bracket_power1+bracket_power2;
				
		double squareroot_of_bracket= Math.sqrt(The_power_of_bracket);
		
		System.out.println("Distance between points = " + squareroot_of_bracket);
	}

	
	
	public static void problem4() {
		
		Scanner inKey = new Scanner(System.in);
		System.out.print("\nEnter a-value: ");
		double a = inKey.nextDouble();
		System.out.print("Enter b-value: ");
		double b = inKey.nextDouble();
		System.out.print("Enter c-value: ");
		double c = inKey.nextDouble();
		
		//solve for x1
		
		double negitive_nancy = b * -1;
		double supersayan_nancy = Math.pow(b, 2);
		double nancyx4 = 4 * a * c ;
		double no_more_nancy = supersayan_nancy - nancyx4 ;
		double not_nancy = Math.sqrt(no_more_nancy);
		double this_little_nancy = negitive_nancy + not_nancy;
		double two_nancys = 2 * a ;
		double pull_the_lever_nancy = this_little_nancy / two_nancys ;
		
		System.out.println("x1 = " + pull_the_lever_nancy);

		
		
		//solve for x2
		
		double positive_percy = b * -1;
		double supersayan_percy = Math.pow(b, 2);
		double percyx4 = 4 * a * c ;
		double no_more_percy = supersayan_percy - percyx4 ;
		double not_percy = Math.sqrt(no_more_percy);
		double this_little_percy = positive_percy - not_percy;
		double two_percys = 2 * a ;
		double pull_the_lever_percy = this_little_percy / two_percys ;
		
		System.out.println("x2 = " + pull_the_lever_percy);

	}



}
