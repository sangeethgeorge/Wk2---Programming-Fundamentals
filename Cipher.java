//************************************************************************************************************************************
// Cipher.java				Author : Sangeeth George
//
// Demonstrates the process of encoding numbers.
//************************************************************************************************************************************

package week2Lab;

import java.util.Scanner;
import java.util.Random;

public class Cipher 
{
	//--------------------------------------------------------------------------------------------------------------------
	// Encodes the sum of 5 numbers using the Caesar code concept.
	//--------------------------------------------------------------------------------------------------------------------
	public static void main(String[] args) 
	{
		System.out.println("Programming Fundamentals");
		System.out.println("NAME: Sangeeth George");
		System.out.println("PROGRAMMING ASSIGNMENT 1"+"\n"+"\n");
		System.out.println("Welcome to the Cipher program.");
		
		int Min = 0;	// minimum user input value.
		int Max = 19;	// maximum user input value .
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter 5 numbers between 0 and 19");
		int one = scan.nextInt();		
		System.out.println("1st number: "+one);	
		
		if (one > Max || one < Min)    //Sets argument to terminate program if integer is outside range of min. and max. values.
		{System.out.println("Please read directions and try again!");
	    System.exit(0);}
			
		int two = scan.nextInt();
		System.out.println("2nd number: "+two);
		
		if (two > Max || two < Min)    //Sets argument to terminate program if integer is outside range of min. and max. values.
		{System.out.println("Please read directions and try again!");
	    System.exit(0);}
			
		int three = scan.nextInt();
		System.out.println("3rd number: "+three);
		
		if (three > Max || three < Min)    //Sets argument to terminate program if integer is outside range of min. and max. values.
		{System.out.println("Please read directions and try again!");
	    System.exit(0);}
			
		int four = scan.nextInt();
		System.out.println("4th number: "+four);
		
		if (four > Max || four < Min)    //Sets argument to terminate program if integer is outside range of min. and max. values.
		{System.out.println("Please read directions and try again!");
	    System.exit(0);}
			
		int five = scan.nextInt();
		System.out.println("5th number: "+five+"\n"+"\n");
		
		if (five > Max || five < Min)     //Sets argument to terminate program if integer is outside range of min. and max. values.
		{System.out.println("Please read directions and try again!");
	    System.exit(0);}			
				
		
		int Total = one+two+three+four+five;	// Sum of the 5 integers that were inputted above.
		System.out.println("Total ="+" "+Total);
		
		Random gen = new Random();
		int Randnum = gen.nextInt(10);		// generates a random number ranging from 0-9.
		System.out.println("Your random key is "+Randnum);
		
		int FirstDigit = Total/10;		// Extracts the first digit of the Total.
		int Encode1 = (FirstDigit+Randnum)%10;		//Encodes the first digit of the Total.
		
		int SecondDigit = Total%10;		//Extracts the second digit of the Total.
		int Encode2 = (SecondDigit+Randnum)%10;		//Encodes the second digit of the Total.
		System.out.println("Your encoded number is "+Encode1+Encode2);
		
		
	}

}



