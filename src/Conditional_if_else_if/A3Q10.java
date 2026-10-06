package Conditional_if_else_if;

import java.util.Scanner;

public class A3Q10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the Temp");
		int Temperature=sc.nextInt();
		if (Temperature>30) {
			System.out.println("Hot");
		}else if (Temperature>20){
			System.out.println("Warm");
		}else if (Temperature>10) {
			System.out.println("Cold");
		}else {
			System.out.println("Very Cold");
		}
		

	}

}
