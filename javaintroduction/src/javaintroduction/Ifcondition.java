package javaintroduction;

import java.util.Scanner;

public class Ifcondition {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
		if (i<35) {
			System.out.println("student fail");
			}
		else 
		if(i==35) {
			
			System.out.println("student pass");
		}
		else 
		if(i>35 && i<=70)
		{
			System.out.println("student secured third class");
		}
		else
			if(i>70 && i<=85) {
				System.err.println("student secured second class");
			}
			else
				if(i>85) {
					System.out.println("student secured first class");
				}
		}
	
		}
			


