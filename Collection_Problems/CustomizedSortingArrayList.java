package Collection_Problems;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

/**
 * InnerCustomizedSortingArrayList
 */
class Customized implements Comparator<Integer>
{
    @Override
    public int compare(Integer o1, Integer o2)
    {
        return o2-o1;
    }
}
public class CustomizedSortingArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(45);
        al.add(5);
        al.add(48);
        al.add(54);
        al.add(100);
        al.add(65);
        al.add(55);
        al.add(15);
        al.add(13);
        System.out.println("Before Sorting :"+al);
        Collections.sort(al, new Customized());
        System.out.println("After Sorting "+al);

    }
}
