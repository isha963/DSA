public class q9 {
  public static void main(String[] args) {
    int n=5; int j=n-1;
    int l=(char)(97+n);
    for(int i =97;i<=l;i++){

      for(int k=j;k>=0;k--){
        System.out.print(" ");
      }
      for(int k=97;k<=i;k++){
        System.out.print((char)k);
      }
      for(int k=i-1;k>96;k--){
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
