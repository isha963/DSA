public class reversenum {
  public static void main(String[] args){
    int n= 123;
 int reversednum =0;
    while (n>0){
      int num=n%10;
     
      reversednum=reversednum*10+num;
      n=n/10;
    }
    System.out.println("Reversed number is: " + reversednum);

  }

}
