public class dectobin {
  public static void main(String[] args) {
    int n=20;
    String bin="";
    
    while(n>0){
      int num =n%2;
      bin=num+bin;
       n/=2;
  }
 

  System.out.println(bin);
    
    }
  
   
}
