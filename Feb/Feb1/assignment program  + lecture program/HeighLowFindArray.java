public class HeighLowFindArray {
    public static void main(String[] args){
        int a[]={20,4,3,2,2};
        int low = a[0];
        int heigh = a[0];

        for(int i=1;i<a.length;i++){
            if(low>a[i]){
                low=a[i];
            }
            if(heigh<a[i]){
                heigh=a[i];
            }
        }
        System.out.println("low number is"+low);
        System.out.println("heigh number is"+heigh);

    }
    
}
