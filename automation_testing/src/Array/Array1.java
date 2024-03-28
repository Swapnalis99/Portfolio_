package Array;

import java.util.ArrayList;

public class Array1 {
    public static void main(String[] args) {
        ArrayList<String> empNames = new ArrayList<String>();

        empNames.add("Ajay");
        empNames.add("Ram");
        empNames.add("Atul");
        empNames.add("Radha");
        empNames.add("Vishnu");
        empNames.add("Ronak");
        empNames.add("Ajit");

        System.out.println("ArrayList elements: ");
        for (int i=0;  i<empNames.size();  i++) {
            System.out.println(empNames.get(i));
        }
    }
}


