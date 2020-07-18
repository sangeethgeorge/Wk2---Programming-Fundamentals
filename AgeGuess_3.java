package week2Lab;
import java.util.Scanner;
import java.util.Random;

public class AgeGuess_3 {

	public static void main(String[] args) {
		Random gen = new Random();
				int age = gen.nextInt(100);
		Scanner scan = new Scanner (System.in);
				System.out.println("Guess age:");
		 		int ageGuess = scan.nextInt();
		 if (ageGuess != age)
			 if(ageGuess < age)
				 System.out.println("older");
			 else
				 System.out.println("younger");
		 	System.out.println("You guessed wrong!");
		 		System.out.println("You Guessed:"+ ageGuess+" Actual Age:"+ age);
		  
		  }
	
		
		
	}