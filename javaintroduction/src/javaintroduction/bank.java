package javaintroduction;

import java.util.Scanner;

public class bank {

	public static void main(String[] args) {
		
         Scanner sc = new Scanner(System.in);
         
         System.out.println("what is your name");
         String name = sc.nextLine();
         System.out.println("hey how are you");
         String status = sc.nextLine();
         System.out.println("what is your age");
         int age = sc.nextInt();
         System.out.println("what is your gender");
         boolean gender = sc.nextBoolean();
         System.out.println("thank you for the information");
         sc.close();
         
	}
	}

