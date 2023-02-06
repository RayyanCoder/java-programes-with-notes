import java.util.HashSet;

public class HashSetP {
    
    public static void main(String args[]){
        HashSet<Integer> set = new HashSet<Integer>();

        // in this random number is display

        set.add(1);
        set.add(2);
        set.add(60);
        set.add(4);
        set.add(5);
        set.add(6);

        System.out.print(set);
        set.remove(1);

        System.out.print(set);

        // set clear ,size isEmpty,contains
    }
    
}
