package Collection_Problems;

import java.util.TreeSet;

public class TreeSetExample {
     public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<Integer>();
        ts.add(10);
        ts.add(19);
        ts.add(13);
        ts.add(20);
        ts.add(10);
        ts.add(50);
        ts.add(60);
        ts.add(10);
        ts.add(24);

        System.out.println(ts.pollFirst());
        System.out.println(ts.first());
        System.out.println(ts.last());
        System.out.println(ts);

     }
}
