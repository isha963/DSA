import java.util.ArrayList;

public class longestpalindrome {
  public static void main(String[] args) {
    String str ="madam";String s1=""; int length=0;
    for(int i=0;i<str.length();i++){
      for(int j=i+1;j<str.length();j++){
        String s = str.substring(i,j+1);
       
      String pal= f1(s);
        if(length<pal.length()){
          length=pal.length();
        s1=pal;
       }
      }
    }
    
    System.out.println("Longest palindrome is "+ s1);
   
  }

   static String f1(String str){
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
    if(isPalindrome){
      
     return str;
    }
    
  return ""; 
}
}