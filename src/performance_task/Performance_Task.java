package performance_task;

import java.util.Scanner;

public class Performance_Task {

	public static void main(String[] args) {
		
		Scanner inKey = new Scanner(System.in);
		System.out.print("\nEnter launch velocity (m/s) >>> ");
		double a = inKey.nextDouble();
		System.out.print("Enter launch angle (degrees) >>> ");
		double b = inKey.nextDouble();
		
		System.out.println("Projectile's Path: \n");
		
		boolean ground = true;
		while(ground) {
			
		for(int i= 0; i <= 60; i++ ) {
				
			//do {
				double cos = Math.cos(Math.toRadians(b));
				double sin = Math.sin(Math.toRadians(b));
				
				double xPosition = cos * i * a;
				double yPosition = sin * i * a - 0.5 * 9.8 * Math.pow(i, 2);
                
				 if (yPosition >= 0) {
					 
				 System.out.println("Time: "+i+"s");
				 System.out.println("x-pos: "+xPosition+"m");
				 System.out.println("y-pos: "+yPosition+"m\n");

					 
				 }
				 else if (yPosition <=0) {
					 
					 System.out.println("Time: "+i+"s");
					 System.out.println("x-pos: "+xPosition+"m");
					 System.out.println("y-pos: 0m\n");
					 
					 ground = false ;
					 
					 break;
				 }
				 
			}//while (ground);
		}

		
		
		
		
		
	}
	
}
