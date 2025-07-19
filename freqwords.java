import java.util.*;
import java.lang.*;
public class freqwords{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
   
    System.out.println("Enter the size of the array");
    int size= sc.nextInt();
    String a[] = new String[size];
    System.out.println("Enter the elements of the array");
    for(int i =0 ;i<size;i++){
      a[i]= sc.next();
    }

    HashMap<String, Integer> h = new HashMap<>();

    for(String e : a){
      
        h.put(e, h.getOrDefault(e, 0) + 1);
      
    }

    for(HashMap.Entry<String,Integer> e: h.entrySet()){
      System.out.println(e.getKey() + " " + e.getValue());
    }
    sc.close();
  }
}