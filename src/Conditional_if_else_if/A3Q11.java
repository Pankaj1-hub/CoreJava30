package Conditional_if_else_if;

import java.util.Scanner;

public class A3Q11 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter Three Numbers");
		int Num1=sc.nextInt();
		int Num2=sc.nextInt();
		int Num3=sc.nextInt();
		if (Num1 >Num2 && Num1> Num3) {
			System.out.println("Num1");
		}else if (Num2 >Num1 && Num2 > Num3) {
			System.out.println("Num2");
		}else {
			System.out.println("Num3");
		}
	}

}
