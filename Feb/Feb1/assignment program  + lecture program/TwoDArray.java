public class TwoDArray {
    public static void main(String[] args){
        int a[][] = new int[4][4];
        int count=0;

        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                count++;
                a[i][j]=count;
            }
        }

        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
              System.out.print(a[i][j]);  
            }
            System.out.println("\n");
        }

            System.out.print("for each loop for extensve loop \n");
        for(int b[]:a){
            for(int c:b){
                System.out.print(c);
            }
            System.out.println("\n");
        }
    }

 
}
    

