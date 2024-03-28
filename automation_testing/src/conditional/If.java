package conditional;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {
		int age;
		System.out.println("enter  your  Age: ");
		
		Scanner sc =new Scanner (System.in);
		age =sc.nextInt();
		
		if(age>= 18) 
		{
			System.out.println("You  are an adult");
		}
		System.out.println("You are not eligible");
	}
}









