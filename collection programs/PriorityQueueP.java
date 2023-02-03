import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueP {
    public static void main(String args[]){

        Queue<String> queue = new PriorityQueue<String>();
            
        queue.offer("rayyan");
        queue.offer("faizan");
        queue.offer("tabish");

        System.out.println(queue);

        //remove element from top of queue
        queue.poll();  //remove the element from quue which has low priority

        System.out.println(queue);

        //get en top of queue
        System.out.println(queue.peek());  //give the element to the top of the queue

        //for easy understanding we will go through the interger priority queue

        
        Queue<Integer> queue2 = new PriorityQueue<Integer>();
            
        queue2.offer(10);
        queue2.offer(20);
        queue2.offer(3);

        
        System.out.println(queue2);

        //remove element from top of queue
        queue2.poll();  //remove the element from quue which has low priority

        System.out.println(queue2);

        //get en top of queue
        System.out.println(queue2.peek());  //give the element to the top of the queue

        // for reverse order it takes not small number it takes big number

        Queue<Integer> queue3 = new PriorityQueue<Integer>(Comparator.reverseOrder());
            
        queue3.offer(10);
        queue3.offer(20);
        queue3.offer(3);

        
        System.out.println(queue3);

        //remove element from top of queue
        queue3.poll();  //remove the element from quue which has low priority

        System.out.println(queue3);

        //get en top of queue
        System.out.println(queue3.peek());  //give the element to the top of the queue
    }
    
}
