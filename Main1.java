// The function f1 counts the number of pairs in the array that sum to the target value.



class Main1 {
  
  public static void main(String[] args) {
    int a[]={1,2,3,4,5,6};
  int target =7;
  int size =a.length;
  int result =f1(a,size,target); 
System.out.println("Count of pairs is: " + result); }

  static int f1(int a[], int size, int target) {
    int i = 0;
    int j = size - 1;
    int count=0;
    while(i<=j){
      if(a[i]+a[j]==target){
        count++;
        i++;
        j--;      }
      else if((a[i]+a[j]<target)){
        j--;
      }
      else{i++;}
    }
    
    return count; 
  }
  
  }
// Output: Count of pairs is: 3
// Explanation: The pairs are (1,6), (2,5), and (3,4) which sum to 7.
// Time Complexity: O(n)
// Space Complexity: O(1)
// Note: The code assumes the input array is sorted in ascending order.



