package day37_Arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations_Practice {

    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>();
        students.add("Sayeem");
        students.add("Waqar");
        students.add("Beslan");
        students.add("Dawud");
        students.add("Ramazan");
        students.add("Mehary");

        // verify that the names: Ulku, Bursa are contained in students list.

        boolean r1 = students.containsAll(Arrays.asList("Ulku","Bursa","Muhtar" ));

        System.out.println(r1);

        System.out.println("===================================");

        ArrayList<String> group16 = new ArrayList<>();

        // add all student name in your group


        group16.addAll(Arrays.asList("Assylkhan", "Aigul", "Anton", "Berk", "Burak", "Mahmut"));

        // verify your mentor and one of your closest friend names are contained in the list
       boolean r3 =  group16.containsAll(Arrays.asList("Omer", "Assylkhan"));

        System.out.println(r3);

        System.out.println("==================================");

        ArrayList<String> employees = new ArrayList<>();

        employees.addAll(Arrays.asList("Ahmed","Ahmed","Muhtar","Virginia","Beslan","Ibrahim","Ahmed"));
        System.out.println(employees);

        employees.retainAll(Arrays.asList("Dawud"));
        System.out.println(employees);




    }


}
