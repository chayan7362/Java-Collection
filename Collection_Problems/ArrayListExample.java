package Collection_Problems;

import java.util.ArrayList;

/**
 * ArrayListExample
 */
public class ArrayListExample {
    public static void main(String[] args) {
        // ArrayList Create 
        ArrayList<Object> alist= new ArrayList<Object>();
        // add elements to arrayList : use add(object 0) method
        alist.add(10);
        alist.add(20);
        alist.add(30);
        alist.add(50);
        alist.add(40);
        alist.add(null);
        alist.add("Hello");
        System.out.println("----Retrive 2nd element from ArrayList ------");
        System.out.println(alist.get(1));
        // retrive all element from array List
        for(int i =0;i<alist.size();i++)
        {
            System.out.println(alist.get(i));
        }
    }
    
}