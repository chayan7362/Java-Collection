package Collection_Problems;

import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        pq.add(10);
        pq.add(20);
        pq.add(30);
        pq.add(40);
        pq.add(60);
        pq.add(50);
        pq.add(9);
        pq.add(2);

        while (pq.size()!=0) 
        {
            System.out.println(pq.poll());
        }

    }
}
