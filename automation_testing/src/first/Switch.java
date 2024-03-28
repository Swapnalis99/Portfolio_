package first;

import java.util.Scanner;

public class Switch {

	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter the value of a: ");
	        int a = scanner.nextInt();
	        
	        System.out.print("Enter the value of b: ");
	        int b = scanner.nextInt();
	        
	        System.out.println("Enter operation");
	        int operation = scanner.nextInt();
	        
	        switch(operation) {
	            case 1:
	                System.out.println("Addition Result: " + (a + b));
	                break;
	            case 2:
	                System.out.println("Subtraction Result: " + (a - b));
	                break;
	            case 3:
	                System.out.println("Multiplication Result: " + (a * b));
	                break;
	            default:
	                System.out.println("Invalid operation.");
	        }
	        
	      
	    }
	}