public class Palindrome {
  public static void main(String [] args){
    int n=21;
    int original =n;
    int rev = 0;
    while(n>0){
      int num=n%10;
      rev=rev*10+num;
      n/=10;
    }
  

  if(rev==original){
    System.out.println("The number is a palindrome.");
  } else {
    System.out.println("The number is not a palindrome.");
  }
}}
