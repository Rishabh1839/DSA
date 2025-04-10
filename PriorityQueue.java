import java.util.*;

// Priority Queue = a FIFO data structure that serves elements 
// in the order of their priority. The element with the highest
// priority is served before other elements with lower priority.
public class PriorityQueue {
    public static void main(String args[])
    {
        Queue<Double> queue = new LinkedList<>();

        queue.offer(3.0);
        queue.offer(2.5);
        queue.offer(4.0);
        queue.offer(1.5);
        queue.offer(2.0);

        while(!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }

}