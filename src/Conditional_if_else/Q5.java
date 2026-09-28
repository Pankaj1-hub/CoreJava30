package Conditional_if_else;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the value of A and B :");
		int a=sc.nextInt();
		int b=sc.nextInt();
		if (a>b) {
			System.out.println(a+ " is largest");
		}
		else {
			System.out.println(b+ " is largest");
		}
	}

}
