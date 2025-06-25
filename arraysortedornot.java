public class arraysortedornot {
  public static void main(String[] args) {
    int arr []= {3,4,5,6,7,8};
boolean issorted =true;
    for(int i=0;i<arr.length-1;i++){
      if(arr[i]>arr[i+1]){
        issorted=false;
        break;
      }
    }
    if(!issorted){
     System.out.println("the arr is not sorted");
    }
    else{
      System.out.println("the arr is sorted");
    }
    }

  }
  

