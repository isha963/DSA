

public class allpalindrome {
  public static void main(String[] args) {
    String str = "abba";
    for(int i=0; i<str.length(); i++){
      for(int j=i+1;j<str.length();j++){
        if(i!=j){
          String s= str.substring(i,j+1);
          f1(s);
        }
      }
  
    }
  }
    static void f1(String str){
    boolean isPalindrome=true;
    int i=0;
    int j=str.length()-1;
    while(i<j){
     
      if(str.charAt(i)!=str.charAt(j)){
        isPalindrome=false;
        break;
      }
      i++;
      j--;
    }
   if(isPalindrome) {
      System.out.println(str );
   } 
     
      
    
    

    }
}

