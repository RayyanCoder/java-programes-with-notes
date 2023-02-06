public class StringPelindrome {

    public static void main(String[] args){
        String name="rayyan";
        String temp="";
        String Check = name;

        for(int i=name.length()-1;i>=0;i--){
            temp = temp + name.charAt(i);
        }

        if(Check.equals(temp)){
            System.out.println("Strign is Pelindrome "+temp);
        }else{
            System.out.println("Strign is not  Pelindrome "+temp);
        }

    }
    
}
