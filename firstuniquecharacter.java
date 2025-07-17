import java.util.*;
public class firstuniquecharacter{
  public static void main(String... args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the string: ");
    String s = sc.nextLine();
    
    LinkedHashMap<Character, Integer> h = new LinkedHashMap<>();

    for(int i=0;i<s.length();i++){
      int count = h.getOrDefault(s.charAt(i), 0)+1;
      h.put(s.charAt(i), count);

    }
    for(Map.Entry<Character, Integer> e : h.entrySet()){
      if(e.getValue()==1){
        System.out.println(e.getKey());
        break;
      }
    }

  }
}