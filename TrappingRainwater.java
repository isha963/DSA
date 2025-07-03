import java.util.*;


public class TrappingRainwater{
    public static void main(String[] args) {

     
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the array elements: ");
  String [] s = sc.nextLine().split(" ");
 int[] a = new int[s.length];
 for(int i = 0; i < s.length; i++) {
  a[i] = Integer.parseInt(s[i]);
 }

  int ha[]= new int[a.length];

  int hb[]= new int[a.length];
  ha[0]=a[0];
 for(int i=1;i<a.length;i++){
      if(a[i]>ha[i-1]){
        ha[i]=a[i];
      }else{
        ha[i]=ha[i-1];
      }

  }
hb[a.length-1]=a[a.length-1];
  for(int i=a.length-2;i>=0;i--){
      if(a[i]>hb[i+1]){
        hb[i]=a[i];
      }else{
        hb[i]=hb[i+1];
      }}
  
int maxarea= area(a,ha,hb);
System.out.println(maxarea);
 }


 static int area(int []a, int []ha, int hb[]){

  if(a.length==1 || a.length==2){
    return 0;
  }
  int maxar=0;  int ar=0;
 for(int i=0;i<a.length;i++){
  if(ha[i]<hb[i]){
   ar= ha[i]-a[i]*1;
    maxar+=ar;
  }else{
    ar = hb[i]-a[i]*1;
    maxar+=ar;
  }
 
 }



  return maxar;
}
}
