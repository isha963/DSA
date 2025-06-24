public class fibonacci {
  public static void main(String[] args) {
    int n=10;
    int f=0;
    int s=1;
    System.out.print("fibonacci series till " + n + " is : "+ f+" "+ s);
    int res=0;
    while(n-2>0){
    res =f+s;
    f=s;
    s=res;
     System.out.print(" "+ res);
     n--;
    }
  }
}
