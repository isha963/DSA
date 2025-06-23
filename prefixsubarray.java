
// Prefix Subarray Sum Calculation
// This program calculates the prefix sum of an array and prints the resulting prefix sum array.


public class prefixsubarray {
  

   public static void prefixsub(int [] nums){
      int pref[]= new int[nums.length];
      pref[0]=nums[0];
      for(int i=1;i<nums.length;i++){
        pref[i]=pref[i-1]+nums[i];
      }
      print(pref);
  }
public static void print(int [] pref){
  for(int i=0;i<pref.length;i++){
    System.out.print(pref[i]+" ");
  }
}
  public static void main(String [] args){
      int nums[]={1,-2,6,-1,3};
      prefixsub(nums);

  }
}
