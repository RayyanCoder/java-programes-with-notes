class Test {
    public void m1(int i) {
        System.out.println("Integer number is : " + i);
    }

    public void m1(float f) {
        System.out.println("float number is : " + f);

    }
}

public class MethodOverloading {

    public void m1(int i) {
        System.out.println("Integer number is : " + i);
    }

    public void m1(double i) {
        System.out.println("double number is : " + i);

    }

    public void m1(float f) {
        System.out.println("float number is : " + f);

    }

    public static void main(String[] args) {
        MethodOverloading obj = new MethodOverloading();
        Test t = new Test();
        obj.m1(67);
        obj.m1(45.67);
        obj.m1(45.45);

        // t.m1(10.5);
        t.m1('a');
        t.m1(10l);
        
    }
}
