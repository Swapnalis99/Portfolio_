package loop;

import java.util.Scanner;

public class Mutlid_array {

	public static void main(String[] args) {
	
		int  a[][]= new int[2]  [2];
		System.out.println("enter  the element  of  an   array");
		Scanner  sc1 =  new Scanner(System.in);
		
for  (int  i=0; i<2;  i++) {
	for (int j=0; j<2; j++) {
		
	a[i][j]=sc1.nextInt();
	System.out.println();
	
}

}

	}

}
