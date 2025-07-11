


public class q1 {
  public static void main(String[] args) {
    int n=5; int j=4;
    for(int i=1;i<=n;i++){
     
       for(int k=1;k<=i;k++){
        System.out.print("*");
       }
        for(int l=j;l>=0;l--){
        System.out.print(" ");
       }
       j--;
       System.out.println();
      }
    }
}