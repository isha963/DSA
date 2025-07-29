
public class Sorting012{
  public static void main(String[] args) {
    int nums[] = {2,2,1,1,1,0,2,1,0,1,0};
    sorting012(nums);
  }

  public static void sorting012(int [] nums){

    int low =0; int mid =0; int high = nums.length-1;
    while(mid<=high){
      if(nums[mid]==0){
        int temp = nums[mid];
        nums[mid]=nums[low];
        nums[low]=temp;
        mid++;
        low++;
      }
      else if(nums[mid]==2){
        int temp = nums[mid];
        nums[mid]=nums[high];
        nums[high]=temp;
        high--;
      }else{
        mid++;
      }
    }
    for(int i=0;i<nums.length;i++){
      System.out.print(nums[i]+ " ");
    }
  }
}
