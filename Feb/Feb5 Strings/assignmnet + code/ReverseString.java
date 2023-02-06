class ReverseString{
    public static void main(String[] args){
        String name="rayyan shaikh";
        String temp="";

        for(int i=name.length()-1;i>=0;i--){
            temp = temp + name.charAt(i);
        }

        System.out.println("reverse String is : " +temp);
    }
}