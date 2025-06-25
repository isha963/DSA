public class findvalinrotatedarr {
  public static void main(String[] args) {
    int arr []= {3,4,5,1,2};
    int target =1;
    int i=0; int j=arr.length;
   
   int a =search(i,j,target,arr);
   if(a==-1){
System.out.println("The target does not exist ");
   }else
    System.out.println("The target found at " + a);
   }
    
  

  static int search(int i, int j, int target,  int arr[]){
while(i<=j){
   int mid = (i+j)/2;
      if(arr[mid]==target){
        return mid;
      }

      if(arr[i]<=arr[mid]){
        if(target>=arr[i]&&target<arr[mid]){
          j=mid-1;

        }
        else{
          i=mid+1;
        }
      }
      else{
        if(target>arr[mid]&& target<=arr[j]){
          i=mid+1;
        }
        else{
          j=mid-1;
        }
      }
    }
    return -1;
  }
}
