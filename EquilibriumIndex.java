public class EquilibriumIndex {
  public static void main(String[] args) {
    int a[] = {3,5,7,4,2,2,6,5};
    int sum=0;
    int leftIndex=0;
boolean isequilibrium =false;
    for(int i=0;i<a.length;i++){
      sum+=a[i];
    }

     for(int i=0;i<a.length;i++){
      sum-=a[i];
      if(leftIndex==sum){
        isequilibrium =true;
        System.out.println("sum is " + sum + " before and after index " + i);
        break;
      }else{
        leftIndex+=a[i];
      }
  }

  if(!isequilibrium){
    
      System.out.println("no equilibrium exist");
    }
  }
}
