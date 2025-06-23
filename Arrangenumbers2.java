
//Optimized version with O(n) time complexity and O(1) space complexity:


public class Arrangenumbers2 {
  


  public static void main (String [] args){
    int a[]={-1,1,5,-4,3,2};
    int n=a.length;

    func(a,n);
    print(a);
    
  }


   static void func(int a[], int n){
    int k=0;
    

  int b[]=new int[n];


for(int j=0;j<n;j++){
  if(a[j]<0){
    b[k]=a[j];
    k++;}
   
  }

for(int j=0;j<n;j++){
  if(a[j]>=0){
    b[k]=a[j];
    k++;
  }}
   


  for(int i=0;i<n;i++){
    a[i]=b[i];
  }
  }


  


  static void print(int a[]){
    for(int i=0;i<a.length;i++){
      System.out.print(a[i]+" ");
    }
  }
 
  

}
