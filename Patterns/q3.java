

public class q3 {
  public static void main(String [] args){
       int n=5; int j=5;
    for(int i=0;i<n;i++){

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
