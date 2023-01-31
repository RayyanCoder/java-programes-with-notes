public class Test3 {
    public void m1(String s) {

        System.out.println("String arg method");

    }

    public void m1(Object d) {

        System.out.println("Object arg method");

    }

    public static void main(String[] args) {

        Test3 t = new Test3();

        t.m1("sachin");// String arg method

        t.m1(new Object());// Object arg method

        t.m1(null);// String arg method

    }

}
