package Nested_if;

import java.util.Scanner;

public class Ass3Q14 {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in); 
		System.out.println("Enter Marks");
		int marks = sc.nextInt();
		if (marks>=80) {
			System.out.println("Enter Maths Score: ");
			int mathScore = sc.nextInt();
		if (mathScore >=75) {
			System.out.println("Eligible");
		}else {
		System.out.println("Not Eligible");
		}
		}else {
			System.out.println("Not Eligible due to Marks");
		}
		}	
		
	}


