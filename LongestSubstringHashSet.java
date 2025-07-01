import java.util.HashSet;

public class LongestSubstringHashSet {
  public static void main(String[] args) {
    int l=0; int r=0; int max_len=0;
String str= "tmmzuxt";
    HashSet <Character> h = new HashSet <Character>();

    
    while(r<str.length()){
      if(!h.contains(str.charAt(r))){
        h.add(str.charAt(r));
        r++;
         max_len=Math.max(r-l,max_len);
      }else{
        h.remove(str.charAt(l));
        l++;
        
      }
     
    }
    System.out.println("Longest subtring without repeating character is of length: " + max_len);
  }
}
