public class GCDandLCM {
  public static void main(String[] args) {
    int dividend =280;
    int divisor=16;
    int d=dividend;
    int div=divisor;
    
  while(divisor!=0){
    int r = dividend%divisor;
dividend=divisor;
divisor=r;
  }
 

  System.out.println("GCD is: " + dividend);
  
  int lcm = (d * div) / dividend;
  System.out.println("LCM is: " + lcm);
}


}