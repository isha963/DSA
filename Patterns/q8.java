public class q8{
  public static void main(String[] args) {
    int n=5;
    int j=n-1;
    for(int i=1;i<=n;i++){
      for(int k=j;k>=0;k--){
        System.out.print(" ");
      }
      for(int k=1;k<=i;k++){
        System.out.print(k);
      }
      for(int k=i-1;k>0;k--){
        System.out.print(k);
      }
      for(int k=j;k>=0;k--){
        System.out.print(" ");
      }
      j--;
      System.out.println();
    }
  }
}