public class q10 {
  public static void main(String[] args) {
    {
    int n=5; int j=n-1;
    int l=(char)(65+n);
    for(int i =65;i<l;i++){

      for(int k=j;k>=0;k--){
        System.out.print(" ");
      }
      for(int k=65;k<=i;k++){
        System.out.print((char)k);
      }
      for(int k=i-1;k>64;k--){
        System.out.print((char)k);
      }
      for(int k=j;k>=0;k--){
        System.out.print(" ");
      }
      j--;
      System.out.println();
    }
  }
  }
}
