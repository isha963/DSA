// public class q13 {
//   public static void main(String[] args) {
//     int n=5;
//     int i=96+n;
//     for(int j=0;j<n;j++){

//       for(int k=0;k<j;k++){
//         System.out.print(" ");
//       }
//       for(int k=97;k<i;k++){
//         System.out.print((char)k);
//       }
//        for(int k=i-2;k>96;k--){
//         System.out.print((char)k);
//       }
//        for(int k=0;k<j;k++){
//         System.out.print(" ");
//       }
//       i--;
//       System.out.println();
//     }
//   }
// }


public class q13 {
  public static void main(String[] args) {
    int n=5;
    int i=64+n;
    for(int j=0;j<n;j++){

      for(int k=0;k<j;k++){
        System.out.print(" ");
      }
      for(int k=65;k<i;k++){
        System.out.print((char)k);
      }
       for(int k=i-2;k>64;k--){
        System.out.print((char)k);
      }
       for(int k=0;k<j;k++){
        System.out.print(" ");
      }
      i--;
      System.out.println();
    }
  }
}
