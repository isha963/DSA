public class q12{
  public static void main(String[] args) {
    int n=5;
    int j=-1;
    for (int i=n;i>0;i--){
      for(int k=1;k<i;k++){
        System.out.print(k);
      }
      for(int k=0;k<j;k++){
        System.out.print(" ");
      }

      for(int k= i-1;k>0;k--){
        if(k==4){
          continue;
        }
        System.out.print(k);
      }
      j+=2;
      System.out.println();
    }
  }
}