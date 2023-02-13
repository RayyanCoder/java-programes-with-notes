import java.lang.*;

class MutableOrNotMutable{
    public static void  main(String[] args){
        StringBuffer s1 = new StringBuffer("rayyan shaikh");
        System.out.println(s1.capacity());

        String name="rayyan";  //imutable object it creates new object into heap memory
        name = name +"shaikh";
        System.out.println(name);

        System.out.println(name.equals(s1));
        // System.out.println(name == s1);

        //methods of String Buffer 
        s1.append("Abdul Majid");
        System.out.println(s1.toString());
        System.out.println(s1.charAt(0));
        s1.setCharAt(0, 'R');
        System.out.println(s1);

    }
}