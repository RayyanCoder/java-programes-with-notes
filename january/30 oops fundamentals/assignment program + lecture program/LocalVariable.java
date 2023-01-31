public class LocalVariable {

    static int  i=10;  //very important static varaible only access by static methods
    int b=20;
    public static void main(String[] args){

        LocalVariable obj = new LocalVariable();

        System.out.println(i);
        // System.out.println(b); //not working not accessable to the static method without object

        System.out.println(obj.b); // so using object we can access it

        obj.getData();

    }

    public void getData(){
        System.out.println(b);  //here you can access it  but you need to create a object
    }
    
}
