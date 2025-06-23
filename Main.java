import java.util.*;


 // This code prints all subarrays of the given array along with their sums.
    // It uses three nested loops: the outer two loops define the start and end indices of the subarray,
    // and the innermost loop calculates the sum of the elements in that subarray.


public class Main {
    
    public static void subarr(int num []){
        
        for(int i=0;i<num.length;i++){
            
            
            for(int j=i;j<num.length;j++){
                 int currsum=0;
            for(int k=i;k<=j;k++){
                currsum=currsum+num[k];
                System.out.print(num[k]+ " ");
               
            }
             System.out.print("sum = "+currsum);
              System.out.println();
              
        }
         System.out.println(); 
    }}
    public static void main(String[] args) {
       int num []={1,-2,6,-1,3};
       subarr(num);
    }
}

   