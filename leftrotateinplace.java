public class leftrotateinplace {
  public static void main(String[] args) {
    int a [] = { 3,2,2,5,4,1,2};
    int k=3;int j=2;
    int i=0;
      while(i<j){
      int temp = a[j];
      a[j]=a[i];
      a[i]=temp;
      j--;
      i++;
    
  }

int l =a.length-1;
  while (k<l) {
    int temp = a[l];
      a[l]=a[k];
      a[k]=temp;
      l--;
      k++;
  }


   int m=0;
   int n=a.length-1;
  while(m<n){
    int temp = a[n];
      a[n]=a[m];
      a[m]=temp;
      n--;
      m++;
  }


  for(int p=0;p<a.length;p++){
    System.out.print(a[p]+" ");
  }
  }

 
}
