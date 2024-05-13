package Collection_Problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * InnerCustomizedSortingArrayList1
 */
class Customized1 implements Comparator<String>
{
    @Override
    public int compare(String o1, String o2)
    {
        return o2.length()-o1.length();
    }   
}

public class CustomizedSortingArrayList1 {
    public static void main(String[] args) 
    {
        ArrayList<String> al = new ArrayList<String>(); 
        al.add("aaa");
        al.add("dd");
        al.add("abcd");
        al.add("bbd");
        al.add("bbbb");
        al.add("ccc");
        System.out.println("Before sorting = "+al);
        Collections.sort(al, new Customized1());
        System.out.println("After Sorting = "+al);
    }
}
