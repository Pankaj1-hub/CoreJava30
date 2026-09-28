package Conditional_if_else;

import java.util.Scanner;

public class Q8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Age :");
		int a=sc.nextInt();
		if (a>=18) {
			System.out.println("Allowed to Drive");
		}
		else
			System.out.println("Not Allowed");
			
		
	}

}
