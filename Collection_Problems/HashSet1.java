package Collection_Problems;

import java.util.HashSet;

public class HashSet1 {
    public static void main(String[] args) {
        HashSet<Integer> hl = new HashSet<Integer>();
        hl.add(10);
        hl.add(20);
        hl.add(40);
        hl.add(30);
        hl.add(60);
        hl.add(50);
        hl.add(70);
       System.out.println(hl);
       hl.forEach(obj -> System.out.println(obj));
    }
}