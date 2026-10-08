package Nested_if;

import java.util.Scanner;

public class Ass3Q15 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Age: ");
		int Age = sc.nextInt();
		if (Age>18) {
			System.out.println("Have Membership Card?");
			boolean card =sc.nextBoolean();
			if (card==true) {
				System.out.println("Entry Allowed");
			}else {
				System.out.println("Not Allowed");
			}
		}else {
			System.out.println("Entry not allowed due to Age Limit");
		}
		}
		
	}


