package Nested_if;

import java.util.Scanner;

public class Ass3Q13 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number: ");
		int a = sc.nextInt();
		if (a>0) {
			System.out.println("Positive");
			if(a%2==0) {
				System.out.println("Even");
			}else {
				System.out.println("Odd");
			}
		}else {
			System.out.println("Negative");
		}
	}

}
