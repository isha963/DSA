

public class q6 {
  public static void main(String[] args) {
         int n=5; int i=2*n-1;
    for(int j=0;j<n;j++){

      for(int k=1;k<=j;k++){
        System.out.print(" ");
      }

       for(int k=i;k>=1;k--){
        System.out.print("*");
      }
      for(int k=1;k<=j;k++){ 
        System.out.print(" ");
      }
  
      i-=2;
      System.err.println();
    }
  }
}

