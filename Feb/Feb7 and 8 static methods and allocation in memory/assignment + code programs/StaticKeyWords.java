class Count{
    static int a;
    int b=20;
    static{
        a=30;
        System.out.println("inside the Count class");
    }
}
public class StaticKeyWords {

    static{
    
        System.out.println("inside the Static keyword class");
    }
    public static void main(String[] args) {
        System.out.println("inside main method class");
        Count c1 = new Count();

    }
    
}
