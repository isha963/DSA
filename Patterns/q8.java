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
    static void anotherMethod() {
       int n=5;
    int i=0;
    for(int j=n;j>0;j--){
      for(int k=j;k>0;k--){
        System.out.print(" ");
      }
      for(int k=0;k<i;k++){
        System.out.print(k+1);
      }
      for(int k=i-1;k>0;k--){
        System.out.print(k);
      }
      for(int k=j;k>0;k--){
        System.out.print(" ");
      }
      i++;
      System.out.println();
    }
    
  }
}