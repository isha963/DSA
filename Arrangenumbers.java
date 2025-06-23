

// This code rearranges an array such that all negative numbers appear before all positive numbers while maintaining the relative order of the negative and positive numbers. 
// It has O(n**2)  time complexity and o(1) space complexity.

public class Arrangenumbers {
  


  public static void main (String [] args){
    int a[]={-1,1,5,-4,3,2};
    int n=a.length;

    func(a,n);
    print(a);
    
  }


   static void func(int a[], int n){
    int i=0;
    int j=0;


   while(j<n){
    
    if(a[j]<0){
      int temp=a[j];
        while(j>i){
          a[j]=a[j-1];
          j--;
        }
      a[i]=temp;
      i++;
        }
    j++;

  }


  }


  static void print(int a[]){
    for(int i=0;i<a.length;i++){
      System.out.print(a[i]+" ");
    }
  }
 
  

}

