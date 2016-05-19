package Oppgave4;

import java.util.*;

public class ArrayListExample {

    public static void main(String args[]) {

        //creating a empty arraylist
        ArrayList<Double> array = new ArrayList<>();

        //add a item to the end of the list
        array.add(2.5);

        //add a item to the start of the list
        array.add(0, 2.0);

        //displaying current arraylist
        System.out.println("Current arraylist: " + array);

        //getting the size of the list
        int size = array.size();
        System.out.println("The size of the list is: " + size);

        //removing the last added item
        array.remove(1);

        //checking if a item is included in the arraylist
        boolean itemtest = array.contains(2.0);
        System.out.println("Checking if the arraylist contains the object 2.0: " + itemtest);

        //getting the item from a specific index
        double item = array.get(0);
        System.out.println("The item at index 0 is: " + item);

    }
}
