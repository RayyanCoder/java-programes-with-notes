public class StringWaysToCompare {

    public static void main(String args[]){
        String s1="rayyan";
        String s3="rayyan";
        StringBuilder s2 = new StringBuilder("rayyan");

        String s4 = new String("rayyan");
        // System.out.println(s1==s2); // not able to compare it 
        System.out.println(s1.equals(s2));

        System.out.println(s1==s3); //it return true 

        System.out.println(s1==s4); //it return false

        System.out.println(s1.equals(s4));

    }
    
}
