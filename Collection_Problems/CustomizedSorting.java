package Collection_Problems;

import java.util.Comparator;
import java.util.TreeSet;

class Customized2 implements Comparator<Integer>
{
    @Override
    public int compare(Integer o1, Integer o2)
    {
        return o2-o1;
    }
}
public class CustomizedSorting {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<Integer>();
        ts.add(19);
        ts.add(13);
        ts.add(10);
        ts.add(11);
        ts.add(70);
        ts.add(30);

        System.out.println(ts);

    }
}
