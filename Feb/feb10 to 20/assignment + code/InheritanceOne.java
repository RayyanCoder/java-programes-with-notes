class Human{

    Human(){
        System.out.println("Constructor in Human class");
    }
   private int age;
   int roll;
    void sleep(){
        age=18;
        System.out.println("Human need good sleep");
        System.out.println(age);
    }
}

class Student extends Human{

    //constructor and private member not involed in inheritance

    void display(){
        roll= 20;
        System.out.println("your roll number is"+roll);
    }

}

class InheritanceOne{
    public static void main(String[] args){
            Student s1 = new Student();
            s1.sleep();
            s1.display();
    }
}