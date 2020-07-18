
//AgeGuess_2.java
package week2Lab;
//Importing packages
import java.util.Scanner;
import java.util.Random;
//Specifying Program
public class AgeGuess_2 {
//Asks for age and generates a random age
	public static void main(String[] args) {
		Random gen = new Random();
				int age = gen.nextInt(100);
		Scanner scan = new Scanner (System.in);
				System.out.println("Guess age:");
		 		int ageGuess = scan.nextInt();
		 		System.out.println("You Guessed:"+ ageGuess+" Actual Age:"+ age);
		  
		  }
	
		
		
	}

