package rahulshettyinterviewquestions;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		
		
		
//		String a = "KATIMI";
//		String reverse ="";
//		char r;
//		for(int i=0; i<a.length(); i++) {
//			r=a.charAt(i);
//			System.out.println(r);
//			reverse = r+reverse;
//			System.out.println(reverse);
//		}
//		System.out.println(reverse);
		
		
//		String B = "AMMADI";
//		String D ="";
//		char G;
//		for(int i=0; i<B.length(); i++) {
//			G=B.charAt(i);
//			D=G+D;
//		}
//		System.out.println(D);
		
		String name = "adikesava reddy";
		String reverse = "";
		char L;
		for(int i=0; i<name.length(); i++) {
			L=name.charAt(i);
			reverse = L+reverse;
			System.out.println(reverse);
		}

	}

}
