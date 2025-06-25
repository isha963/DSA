class zeroestoend{
  public static void main(String[] args) {
    int []arr={1,0,3,2,0,8,1};
      int i=0;
      int j=arr.length -1;

      while(i<j){
        while(i!=0){
          i++;
        }
        while(j==0){
          j--;
        }
        if(i==0&&j!=0){
          int temp =arr[j];
          arr[j]=arr[i];
          arr[i]=temp;
          i++;
        j--;
        }
        
      }
for( i=0;i<arr.length;i++)
{
System.out.print(arr[i] +" ");
}      
    }
  }
