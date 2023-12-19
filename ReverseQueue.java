import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import javax.management.Query;

/**
 * ReverseQueue
 */
public class ReverseQueue {

    public static void main(String[] args) {
        Queue<Integer> Q = new LinkedList<>();
        Q.add(1);
        Q.add(2);
        Q.add(4);
        Q.add(5);
        Q.add(9);
        System.out.println("Original Queue: " + Q);

        reverseQueue(Q);

        System.out.println("Reversed Queue: " + Q);

    }

    public static void reverseQueue(Queue<Integer> Q){
        Stack<Integer> stact = new Stack<>();
        int size = Q.size();
        // moving elements from queue to stack
        for(int i = 0; i<size; i++){
            int S = Q.poll();
            stact.add(S);
        }
        // add back elements in queue
        while (!stact.isEmpty()) {
            int S = stact.pop();
            Q.add(S);
        }
    }
}