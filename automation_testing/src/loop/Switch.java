package loop;
import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
int ch;
System.out.println("Enter the  no  for the day");
Scanner sc1= new Scanner(System.in);
ch= sc1.nextInt();
switch (ch) {
case 1:
    System.out.println("Monday");
    break;
  case 2:
    System.out.println("Tuesday");
    break;
  case 3:
    System.out.println("Wednesday");
    break;
  case 4:
    System.out.println("Thursday");
    break;
    default :
    	System.out.println ("Invalid choice");
}


	}

}
