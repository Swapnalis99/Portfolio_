package loop;
import java.util.Scanner;

public class Square {

	public static void main(String[] args) {
	
		 int n;
		 System.out.println("Enter the no: ");
		 Scanner sc=new Scanner (System.in);
		 int num= sc.nextInt();
		 System.out.println("The Table of "+num+" is : ");
		 
  for (  int i=1; i<=10;i++) 
  {
      n =i;
      
      int temp=num*n;
      
 System.out.println(temp);
	}
}
}