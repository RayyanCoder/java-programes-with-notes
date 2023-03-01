class Demo{
    String name;
    int rollNo;
   public Demo(){
        this("rayyan",25);
    }
  public  Demo(String name,int rollNo){
        this.name = name;
        this.rollNo = rollNo;
        System.out.println("your name is " + this.name);
        System.out.println("your roll is " + this.rollNo);
    }
}
class ConstructorP{
    public static void main(String[] args) {

        Demo demo = new Demo();

    }
}