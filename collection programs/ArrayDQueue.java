import java.util.ArrayDeque;

public class ArrayDQueue {

    public static void main(String[] args) {

        ArrayDeque<String> queue = new ArrayDeque<String>();
        System.out.println(queue);

        queue.offer("rayyan");
        queue.offer("faizan");
        queue.offer("tabish");
        queue.offer("abdul rehman");
        queue.offer("abrar");

        System.out.println(queue);
        //remove element from top of queue
        queue.pollFirst(); //remove the element from quue of top

        queue.pollLast(); //remove the element from quue 

        queue.offerFirst("rayyan");// adding the first element to the top of the queue

        queue.offerLast("shaikh"); // adding last element to the queue of last

        //to get peek value from the last and first 


        System.out.println(queue);

        //get en top of queue
        System.out.println(queue.peek());  //give the element to the top of the queue
    }
    
}
