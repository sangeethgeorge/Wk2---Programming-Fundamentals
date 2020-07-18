package week2Lab;

import java.util.Scanner;
import java.util.Random;

public class UserNames {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("First Name:");
		String FirstName = scan.nextLine();
		System.out.println("Last Name:");
		String LastName = scan.nextLine();
		Random gen = new Random();
		int randnum = 10 + gen.nextInt(89);
		System.out.println("username:"+LastName.charAt(0)+LastName.charAt(1)+LastName.charAt(2)+LastName.charAt(3)+
		LastName.charAt(4)+FirstName.charAt(0)+randnum);
	}

}
