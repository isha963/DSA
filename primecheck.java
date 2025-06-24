class primecheck{
  public static void main(String[] args) {
    int num=-4;
    boolean isPrime = true;
    if(num==2){
      System.out.println("The no. is prime");
    } else if(num<2){
      System.out.println("The no. is not prime");
    } else {
      if(num%2==0){
        System.out.println("The no. is not prime");
        return;
    }
      for(int i=3;i<=Math.sqrt(num);i+=2){
        if(num%i==0){
          isPrime=false;
          
          break;
        }

      }
     if(isPrime){
        System.out.println("The no. is prime");
      } else {
        System.out.println("The no. is not prime");
      }
    }
  }
}

