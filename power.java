public class power {
  public static void main(String[] args) {
    int n=10;
    int pow = 3;
    int p=pow;
    int result=1;
    while(pow>=1){
      result=result*n;
      pow--;
    }
    System.out.println(n+" raised to the power of "+ p + " is " + result);
  }
}
