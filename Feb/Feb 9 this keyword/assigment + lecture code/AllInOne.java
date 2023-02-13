class Student{
    int roll;
    String name;
    public int getRoll() {
        return roll;
    }
    public void setRoll(int roll) {
        this.roll = roll;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
}

class AllinOne{
    public static void main(String args){
         Student s1 = new Student();
         Student s2 = new Student();
         s1.setName("rayyan");
         s2.setName("faizan");
         s1.setRoll(25);
         s2.setRoll(30);

         s1.getName();
         s1.getRoll();

         s2.getName();
         s2.getRoll();
    }
}