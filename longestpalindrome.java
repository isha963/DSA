import java.util.ArrayList;

public class longestpalindrome {
  public static void main(String[] args) {
    String str ="madam";
    for(int i=0;i<str.length();i++){
      for(int j=i+1;j<str.length();j++){
        String s = str.substring(i,j+1);
        f1(s);
      }
    }
    
   
  }

   static void f1(String str){
     int i=0;
    int j=str.length()-1; boolean isPalindrome = true;
    while(i<j){
      if(str.charAt(i)!=str.charAt(j)){
        isPalindrome=false;
        break;
      }
      i++;
      j--;
    }
   
}
