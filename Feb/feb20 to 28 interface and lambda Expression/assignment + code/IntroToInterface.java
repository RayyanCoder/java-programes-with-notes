interface Car{
    int a=10;
    void show();
}

class IntroToInterface implements Car{

   public void show(){
        System.out.println("rayyan shaikh abdul majid");
    }
    public static void main(String[] args){

        IntroToInterface inf = new IntroToInterface();
        inf.show();

        System.out.println(a);

    }
}