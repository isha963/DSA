public class q7 {

  public static void main(String[] args) {
     int n=5; int j=n-1;
    for(int i=0;i<2*n-1;i+=2){

      for(int k=j;k>0;k--){
        System.out.print("*");
      }

       for(int k=1;k<=i;k++){
        System.out.print(" ");
      }

       for(int k=j;k>0;k--){
        System.out.print("*");
      }

      j--;
      System.err.println();
    }
  }
}