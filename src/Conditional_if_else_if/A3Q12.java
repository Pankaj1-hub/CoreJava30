package Conditional_if_else_if;

import java.util.Scanner;

public class A3Q12 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter Number");
		int a=sc.nextInt();
		if (a>0) {
			System.out.println("Positive");
		}else if (a<0) {
			System.out.println("Negative");
		}else {
			System.out.println("Zero");
		}

	}

}
