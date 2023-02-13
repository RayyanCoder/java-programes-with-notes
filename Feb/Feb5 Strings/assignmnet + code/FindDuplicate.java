public class FindDuplicate {
    public static void main(String args[]){
        String name="shaikh";
        int count=0;
        int a[]= new int[26];
        char b[]=name.toCharArray();
        char r[]=new char[26];

        for(int i=0;i<b.length;i++){
            count=0;
            for(char c='a';c<='z';c++){
                if(c == b[i]){
                    a[count]=a[count]+1;
                }
                count++;

            }
        }
        // System.out.println(a[0]);

        for(int x:a){
            System.out.println(x);
        }

        count=0;
        for(char c='a';c<='z';c++){
         if(a[count]>=2 || a[count] == 0){
            r[count]=' ';
         }else{
            r[count]=c;
         }
         count++;
        }

        String result = new String(r);
        String result2 = result.replaceAll(" ", "");
        String result3="";

        // for(int i=0;i<result3.length();i++){

        // }

        System.out.println("Given String is "+name);
        System.out.println("Duplicate Character removed from  above String is remeaning characters is "+result2);

        }
   

     }
      
    
    

