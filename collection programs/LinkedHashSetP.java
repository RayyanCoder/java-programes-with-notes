import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetP {
    
    public static void main(String args[]){
        Set<Integer> set = new LinkedHashSet<Integer>();

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
