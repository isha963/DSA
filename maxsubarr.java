import java.util.*;


public class maxsubarr{
  public static void main(String... args){
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter the size of array: ");
    int size = sc.nextInt();
    int arr[]= new int[size];
    System.out.println("Enter elements one by one:");   

    for(int i=0;i<size;i++){
        arr[i]= sc.nextInt();
     }

    System.out.println("Enter subarr size :");
    int s = sc.nextInt();
     if(s>size || s<=0 ){
      System.out.println("subarr size > arr size");
      return;
     }
    int l = 0; 
    int r=s;
    int sum=0;
    for(int j=0;j<s;j++){
        sum=sum+arr[j];
    }
    int msum =sum; int start =0;
    while(r<size){
      sum=sum-arr[l]+arr[r];
      if(sum>msum){
        msum=sum;
       start= l+1;
      }
      l++; r++;
      
    }
   System.out.print("{");
    for(int i=start;i<r;i++){
      System.out.print(" " + arr[i] + " ");
    }
    System.out.print("}");
     System.out.println(); 
      System.out.println("Sum is " + msum);
    }
  }
