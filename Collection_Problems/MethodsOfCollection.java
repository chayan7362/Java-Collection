package Collection_Problems;

import java.util.ArrayList;

public class MethodsOfCollection {
    public static void main(String[] args) {
        ArrayList<Object> alist = new ArrayList<Object>();
        alist.add(1);
        alist.add("java");
        System.out.println(alist);
        alist.add(1,"hello");
        System.out.println(alist);

        ArrayList<Object> alist1 = new ArrayList<>();
        alist1.add(5);
        alist.add(7);
        System.out.println(alist1);
        alist1.add(alist);
        System.out.println(alist1);
        alist1.add(1,alist);
        System.out.println(alist1);
        alist1.remove(0);
        alist1.remove("hello");
        System.out.println(alist1);
        alist1.removeAll(alist1);
        alist1.clear();
        System.out.println(alist1);
        System.out.println(alist.contains("moblile"));
        System.out.println(alist1.containsAll(alist));

    }
}
