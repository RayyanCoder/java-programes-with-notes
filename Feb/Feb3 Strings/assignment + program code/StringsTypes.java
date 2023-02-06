class StringsTypes{
     public static void main(String[] args){

        //it is immutable string
        String name= "rayyan";
        name="faizan";
        System.out.println(name);
        name.concat("shaikh ");
        System.out.println(name);


        //mutable string
        StringBuilder sb = new StringBuilder("rayyan");
        sb.append(" shaikh ");

        System.out.println(sb);

     }
}