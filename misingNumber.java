public class misingNumber{

 

  public static int missingNumber1(int[] nums) {
        int n= nums.length;
        int sum=(n*(n+1))/2;
        int i=0;
        int s=0;
        while(i<n){
            s+=nums[i];
            i++;
        }

    
        return (sum-s);
    }


     public static void main(String[] args) {
    int nums[]= {3,2,0};
    int mn = missingNumber1(nums);
    System.out.println(mn);
  }
}