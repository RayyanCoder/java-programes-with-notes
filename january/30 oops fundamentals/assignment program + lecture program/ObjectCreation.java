class ObjectCreation{
    int roll;  //instance varaibles
    String name;
    public static void main(String args[]){
        ObjectCreation obc = new ObjectCreation();  //local varaibles
        ObjectCreation obc2;                        //refrence varaibles
        System.out.println(obc.name);
        System.out.println(obc.roll);
        obc.name="rayyan";
        obc.roll=25;
        System.out.println(obc.name);
        System.out.println(obc.roll);
    }
}