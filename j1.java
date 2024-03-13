public class j1{
    public static void pattern(int n){
        int i,j;
        for(i=1;i<=n;i++){
            for(j=4;j>=n;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void main(String a[]){
        int n=3;
        pattern(n);

    }
}