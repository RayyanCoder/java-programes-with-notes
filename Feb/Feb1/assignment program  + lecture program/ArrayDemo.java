class ArrayDemo{
  
    public static void main(String[] args){
        int numbers[]={10,20,30,40};
        int number2[]= new int[10];
        number2[0]=10;
        number2[1]=20;
        number2[2]=40;

        System.out.println(numbers[0]); // this is one way
        for(int x : number2){
            System.out.println(x);
            if(x == 0)break;
        }
    }
}