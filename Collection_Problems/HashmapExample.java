package Collection_Problems;

import java.util.HashMap;
import java.util.Set;

public class HashmapExample {
    private static final Integer[] Keys = null;

    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<Integer, String>();
        hm.put(1, "java");
        hm.put(2, "J2EE");
        hm.put(3, "SQL");
        hm.put(5, "Hibernate");
        hm.put(1, "Programming");
        hm.put(1, "Spring Boot");
        hm.put(null, "Aptitude");

        System.out.println(hm);
        System.out.println(hm.containsKey(5));
        System.out.println(hm.containsValue("java"));

        Set<Integer> Keys = hm.keySet();
        for(Integer Key: Keys)
        {
            System.out.println(Key+"="+hm.get(Key));
        }
    }
}
