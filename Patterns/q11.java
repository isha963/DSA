public class q11 {
  public static void main(String[] args) {
    int n=5;
    int i=n-1;
    for(int j=0;j<n;j++){
      for(int k=0;k<j;k++){
        System.out.print(" ");
      }
      for(int k=0;k<i;k++){
        System.out.print(k+1);
      }
    
    for(int k=i-1;k>0;k--){
      System.out.print(k);
    }
    for(int k=0;k<j;k++){
        System.out.print(" ");
      }

      i--;
      System.out.println();
  }
}}
