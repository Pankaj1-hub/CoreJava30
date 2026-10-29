package conditional_switch_case;

import java.util.Scanner;

public class A3Q19 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int a= sc.nextInt();
		int b=sc.nextInt();
		char op=sc.next().charAt(0);
		switch (op) {
		case '+':
			System.out.println(a+b);break;
		case '-':
			System.out.println(a-b);break;
		case '*':
			System.out.println(a*b);break;
		case '/':
			System.out.println(a/b);
			break;
			default:
				System.out.println("Invalid");
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
