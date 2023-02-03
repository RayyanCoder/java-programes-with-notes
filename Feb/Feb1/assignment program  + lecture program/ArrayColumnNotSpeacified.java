class ArrayColumnNotSpeacified{
    public static void main(String[] args){

        //called jagged array when column is not speacified

            int a[][] = new int [2][];
             a[0] = new int [3];
             a[1]= new int[3];
             int count = 0;

             for(int i=0;i<2;i++){
                for(int j=0;j<3;j++){
                    count++;
                    a[i][j]=count;
                }
             }

             for(int i=0;i<2;i++){
                for(int j=0;j<3;j++){
                    System.out.print(a[i][j]);
                }
                System.out.println("\n");
             }

    }
}
