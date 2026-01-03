package collectionspackage;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionsClass {
    public static void main(String[] args) {

        // Created non-generic ArrayList
        ArrayList arryLst01 = new ArrayList();
        arryLst01.add("Bettin");
        arryLst01.add("Australia");
        arryLst01.add(35);
        System.out.println(arryLst01);

        // Generic ArrayList
        ArrayList arryLst02 = new ArrayList<String>();
        arryLst02.add("Hervey Bay");
        arryLst02.add("Bundaberg");

        // Add, remove methods in ArrayList
        arryLst02.addFirst("Home");
        System.out.println(arryLst02);
        arryLst02.remove(1);
        System.out.println(arryLst02);
        arryLst02.remove("Home");
        System.out.println(arryLst02);

        ArrayList arryLst03 = new ArrayList<String>();
        arryLst03.add("Cherry");
        arryLst03.add("Macadamia");
        arryLst03.add("Orange");
        arryLst03.addFirst("Mango");
        System.out.println(arryLst03);

        //Add elements of an Arraylist to another ArrayList
        arryLst02.addAll(arryLst03);
        System.out.println(arryLst02);

        //Get element at index
        System.out.println(arryLst02.get(4));
        //get size of the ArrayList
        System.out.println(arryLst02.size());

        //Check if the ArrayList contains
        System.out.println(arryLst02.contains("Cherry"));
        System.out.println(arryLst02.contains("cherry"));

        //Iterator
        Iterator itrtr01 = arryLst02.iterator();
        while (itrtr01.hasNext()){
            System.out.println(itrtr01.next());
        }

        // In Iterator 'remove' removes only the last element of the list
        itrtr01.remove();
        System.out.println(arryLst02);

    }
}
