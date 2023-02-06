public class PanaGramp {
    public static void main(String[] args){
        String name = "my name is rayyan shaikh";
        int count=0;
        int result = 0;
        name=name.toLowerCase();
        char []name2 = name.toCharArray();
       
        for(int i=0;i<name2.length;i++){
            for(char c='a';c<='z';c++){
                if(name2[i]==c){
                    count++;
                }

            }
        }

        if(count == 26){
            System.out.println("String is Panagram");
        }else{
            System.out.println("String is not  Panagram");

        }
        // System.out.println(count);
   

        String s= "Hello world"; s.trim();

int i = s.indexOf(" "); 

System.out.println(i);


System.out.print("" == "");

System.out.print(" ");

System.out.print("A"=="A"); 

System.out.print("a==A");

      

    }
}
