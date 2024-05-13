package Collection_Problems;

import java.util.Vector;

public class VectorList {
    public static void main(String[] args) {
        Vector<Object> vl = new Vector<Object>();
        vl.add(17);
        vl.add("chayan");
        vl.add(null);
        vl.add("hello");
        vl.add(null);
        vl.add(6);
        System.out.println(vl);
        vl.forEach(obj -> System.out.println(obj));
    }
}
