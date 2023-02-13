public class ShowDuplicateCharacterInString {

    public static void main(String[] args){

        String name="rayyan";
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
    
        // for(int x:a){
        //     System.out.println(x);
        // }
    
        count=0;
        for(char c='a';c<='z';c++){
         if(a[count]>=2){
            r[count]=c;
         }else{
            r[count]=' ';
         }
         count++;
        }
    
        String result = new String(r);
        String result2 = result.replaceAll(" ", "");
        System.out.println("Duplicate Character from "+name);
        System.out.println("Duplicate Character above String is "+result2);
    }

  

 }
    

