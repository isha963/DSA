import java.util.*;

public class firstRepeatingElement {
  public static void main(String[] args) {
    int a[]={1,2,2,1};
    boolean firstrepeat = false;
    HashSet<Integer> h = new HashSet<Integer>();

    for(int i=0;i<a.length;i++){
      if(!h.contains(a[i])){
          h.add(a[i]);
      }else 
      {System.out.println(a[i]) ;
        firstrepeat = true;
      break;}
    }

    if(!firstrepeat){
      System.out.println("None");
    }

    
    

  

    }
  }
 
