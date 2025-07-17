import java.util.*;

public class minsizesubarr {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    int a[] = new int[size];
    int x= 20;
    for(int i =0;i<size;i++){
      a[i]= sc.nextInt();
    }
    int r=0, l=0, minl=Integer.MAX_VALUE;
    int sum=0;
    while(r< size){
      sum= sum + a[r];
      if(sum>x){
        minl=Math.min(minl, r-l+1) ;
        
        sum-=a[l++];
        
      }
      r++;
    }
    System.out.println(minl==Integer.MAX_VALUE? 0: minl);
  }
}
