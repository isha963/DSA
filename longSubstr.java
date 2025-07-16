import java.util.HashSet;

public class longSubstr {
  public static void main(String[] args) {
    String s = "abcccdeba";
    HashSet<Character> h = new HashSet<>();
    int l=0; int max=0;
    char c[] = s.toCharArray();
    for(int r=0;r<c.length;r++){
      while(h.contains(c[r])){
        h.remove(c[l++]);
      }
      h.add(c[r]);
    }


  }
}
