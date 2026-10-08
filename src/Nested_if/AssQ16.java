package Nested_if;

import java.util.Scanner;

public class AssQ16 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Username");
		String username = sc.next();
		if (username.equals("admin")) {
			System.out.println("Enter Password :");
			String password= sc.next();
			if (password.equals("1234")) {
				System.out.println("Login Successful");
			}else {
				System.out.println("Invalid Credentials");
			}
		}else {
			System.out.println("Invalid username");
		}
		}

	}

