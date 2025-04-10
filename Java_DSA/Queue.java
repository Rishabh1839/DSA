package Java_DSA;

import java.util.Queue;
import java.util.LinkedList;

// Queue = FIFO (First In First Out) data structure
// A collection designed for holding elements prior to processing Linear data structure
// add = enqueue, remove = dequeue

public class Queue {
    public static void main (String[] args){
    // Create a queue of strings
    Queue<String> queue = new LinkedList<String>();

    // Add elements to the queue
    queue.offer("Karen");
    queue.offer("Chad");
    queue.offer("Steve");
    queue.offer("Harold");

    //System.out.println(queue.isEmpty()); // Output: []
    System.out.println(queue.size()); // Output: 4
    System.out.println(queue.contains("Harold"));

    //System.out.println(queue.peek());
    //queue.poll(); // Remove the first element (Karen)
    //queue.poll();
    //queue.poll();
    //queue.poll();
    System.out.println(queue); // Output: [Karen, Chad, Steve, Harold]
    }
}