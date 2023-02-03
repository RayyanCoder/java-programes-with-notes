import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class ArrayListP{
    public static void main(String args[]){
        List<String> list = new ArrayList<String>();
        ArrayList<String> list2 = new ArrayList<String>();
      

        list.add("rayyan");
        list.add("faizan");
        list.add("abdul rehman");
        list.add("tabish");
        list.add("yasa");

        System.out.println(list);

        list2.add("rayyan");
        list2.add("faizan");
        list2.add("abdul rehman");
        list2.add("tabish");
        list2.add("yasa");

        System.out.println(list2);

        list2.remove(list2.size()-1);
        list2.remove("rayyan");
        System.out.println(list2);

        //copy one list from another list

        list2.addAll(list);

        System.out.println(list2);

        // complexity of list of 0(n)

        //clear list
        // list2.clear();  to clear list

        // to update list

        list2.set(0, "faizan shaikh");
        System.out.println(list2);

        //for find an element in the list

       boolean b =  list2.contains("rayyan");
       System.out.println(b);


       //looping loops 

       for(String s : list2){
            System.out.println(s);
       }

        //for using size () method and for loop
       // using iterators

       Iterator<String> it = list2.iterator();
       while(it.hasNext()){
        System.out.println(it.next());
       }
      
    }
}