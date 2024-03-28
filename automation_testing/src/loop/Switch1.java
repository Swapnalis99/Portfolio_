package loop;

import java.util.Scanner;

public class Switch1 {

	public static void main(String[] args) {
	int per;
	System.out.println("enter  your  percentage  to get garde: ");
	Scanner sc1= new  Scanner(System.in);
per= sc1.nextInt();


  switch (per/10) {
  case 10:
  case 9:
  System.out.println("A+");
  break;
  
  case 8:
	  System.out.println("A");
	  break;
	  
  case  7:
	  System.out.println("B+");
	  break;
	  
  case  6:
	  System.out.println("B");
	  break;
	  
  case 5:
	  System.out.println("c+");
	  break;
	  
  case  4:  
	  System.out.println("c");
	  break;
	  
  case 3:
  case 2:
  case 1:
	  System.out.println("invalid  marks");
	  break;
	  
	  
	  
	  
  }
  
 
	}

}
