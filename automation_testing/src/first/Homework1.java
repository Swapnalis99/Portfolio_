package first;

import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {
		  int accountBalance;
		  System.out.println("enter  your  balance : ");
			
			Scanner sc =new Scanner (System.in);
			accountBalance =sc.nextInt();
	        // Check if the accountBalance is greater than 1000.0
	        if (accountBalance > 1000.0) {
	            // Block of code to execute if the condition is true
	            System.out.println("You have sufficient balance");
	        }

	        // Code outside the if block, always executed
	        System.out.println("Happy shopping");
	    }
	
	}


