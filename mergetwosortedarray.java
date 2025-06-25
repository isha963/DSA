public class mergetwosortedarray {
  public static void main(String[] args) {
    int a[]={2,4,6,7};
    int b[]={1,3,5,8};
    int c[] = new int[a.length + b.length];
int i=0 ; int j=0; int k=i;
    while(i<a.length && j< b.length){
      if(a[i]<b[j]){
        c[k]=a[i];
        k++;
        i++;
      }else{
        c[k]=b[j];
        k++;
        j++;
      }

    }

    while(i<a.length){
        c[k]=a[i];
        k++; 
        i++;
      }

       while(j<b.length){
        c[k]=b[j];
        k++; 
        j++;
      }

    for(int l=0;l<c.length;l++){
      System.out.print(c[l]+ " ");
    }



  }
}
