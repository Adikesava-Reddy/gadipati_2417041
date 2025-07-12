package javaintroduction;

import java.util.Scanner;

public class Studentresult {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		if(i>=35) {
			
			System.out.println("student pass");
			
		}
		
		else {
			System.out.println("student fail");
		}
		if(i==36 && i>70) {
			
			System.out.println("student secured third class");
		}
		if(i==71 && i<=85) {
			
			System.out.println("student secured second class");
		}
		if(i==85) {
			
		    System.out.println("student secured first class");
		}
		
			
		}
	}

	


