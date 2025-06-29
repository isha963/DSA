import java.util.*;

public class majorityelementHashmap {
  public static void main(String[] args) {
    int a []={2, 2, 1, 1, 2, 1,3,3,4,4,4,4,1, 2};
    HashMap <Integer,Integer> h= new HashMap<Integer,Integer>();
    int n=a.length;

    for(int num:a){
      h.put(num, h.getOrDefault(num,0)+1);
    }
    for(HashMap.Entry<Integer,Integer> entry: h.entrySet()){
      if(entry.getValue()>n/2){
        System.out.println(entry.getKey());
      }
    }
  }
}
