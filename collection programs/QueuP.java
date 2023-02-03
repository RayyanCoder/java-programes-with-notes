import java.util.*;
public class QueuP {

    private static final String Queue = null;

    public static void main(String[] args){
            Queue<String> queue = new LinkedList<String>();
            
            queue.offer("rayyan");
            queue.offer("faizan");
            queue.offer("tabish");

            System.out.println(queue);

            //remove element from top of queue
            queue.poll();

            System.out.println(queue);

            //get en top of queue
            System.out.println(queue.peek());






    }
    
}
