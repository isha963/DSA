import java.util.*;

public class mostfreqel{
  public static void main(String[] args) {
    int arr [] ={ 1,2,3,4,2,1,1,2,3,3,3,3};
    Map<Integer, Integer> m = new HashMap<>();
    int maxfreq =0; int res=0;
    for(int el : arr){
       int count  = m.getOrDefault(el,0)+1;
      m.put(el,count);
      if(count>maxfreq){
        maxfreq=count;
        res=el;
      }
    }
    System.out.println(res);
  }
  
}