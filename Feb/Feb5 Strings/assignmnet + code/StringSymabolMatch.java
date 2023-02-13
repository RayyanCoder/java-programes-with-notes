import java.util.List;
import java.util.Stack;

public class StringSymabolMatch {

    public static void main(String  args[]){
       String str="{}([]{}";
       Boolean flag= false;
       Stack<Character> stack1 = new Stack<>();
       for(int i=0;i<=str.length()-1;i++){
        char c = str.charAt(i);
       
        
        if(c == '(' || c == '{' || c == '['){
            if(i == str.length()-1){
                    flag=false;
                    break;
            }
            System.out.println(c);
            stack1.push(c);
        }else{
            if(stack1.peek() == '(' && c == ')'){
                System.out.println("2");
                    flag=true;
            }if(stack1.peek() == '{' && c == '}'){
                System.out.println("1");
                   flag=true;
            } if(stack1.peek() == '[' && c == ']'){
                System.out.println("3");
                flag=true;
         }if(stack1.peek() == '[' && c != ']' || stack1.peek() == '{' && c != '}' || stack1.peek() == '(' && c != ')'   ){
            flag=false;
            break;
         }
        }
       
       }
       System.out.println("string is"+flag);
    }
    
}