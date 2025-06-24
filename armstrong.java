public class armstrong {
  public static void main(String[] args) {
    int num=153;
    int orignal=num;
    int sum =0;
    while(num!=0){
    int n=num%10;
    sum=sum+n*n*n;
    num/=10;
    }

    if(orignal==sum){
      System.out.println("The number is an Armstrong number.");
    } else {
      System.out.println("The number is not an Armstrong number.");
    }
  }
}
