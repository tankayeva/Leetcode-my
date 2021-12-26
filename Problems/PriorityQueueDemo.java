import java.util.*;
import java.io.*;

public class PriorityQueueDemo {

    public static void main(String args[])
    {
        PriorityQueue<Integer> queue = new PriorityQueue<>((a, b) -> b - a);

        queue.add(2);
        queue.add(3);
        queue.add(8);

        // queue.peek() now finds the maximum element in the queue.
        System.out.println(queue.peek()); // prints 8.

        queue.poll();                     // queue.poll() also removes the maximum element now.
        System.out.println(queue.peek()); // prints 3 now.

        queue.add(5);
        System.out.println(queue.peek()); // prints 3 ag
    }
}
