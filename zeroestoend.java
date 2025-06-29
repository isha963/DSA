// class zeroestoend{
//   public static void main(String[] args) {
//     int []arr={0,0,0,2,0,8,1};
//       int i=0;
//       int j=arr.length -1;

//       while(i<j){
//         while(arr[i]!=0){
//           i++;
//         }
//         while(arr[j]==0){
//           j--;
//         }
//         if(arr[i]==0&&arr[j]!=0&& i<j){
//           int temp =arr[j];
//           arr[j]=arr[i];
//           arr[i]=temp;
//           i++;
//         j--;
//         }
        
//       }
// for( i=0;i<arr.length;i++)
// {
// System.out.print(arr[i] +" ");
// }      
//     }
//   }

class zeroestoend{
public static void main(String args[]){
  int arr [] = {0,3,1,0,3,0,4};
   int j=0;

  for(int i = 0;i<arr.length;i++){
    
    if(arr[i]!=0){
      arr[j]=arr[i];
      j++;
    
  }
  }

  while(j<arr.length){
    arr[j]=0;
    j++;
  }
for( int i=0;i<arr.length;i++)
{
System.out.print(arr[i] +" ");

}
}}