import java.util.*;


// public class simplesubsetcheck {
//   public static void main(String[] args) {
//     int a[]={1, 2, 3, 4, 5};
//     int b[]={1, 3, 6};
// boolean issubset =false;


//     for(int i=0;i<b.length;i++){
//       boolean found = false;
//           for(int j=0;j<a.length;j++){
//             if(b[i]==a[j]){
//               found=true;
//               break;
//             }
//           }
        

//            if(!found){
//            issubset =false;break;
//         }
        
//         }
// if(!issubset){
//   System.out.println("b is not a subset of a");
// }else{
//    System.out.println("b is a subset of a");
// }
       
//         }

     
//       }


public class simplesubsetcheck {
  public static void main(String[] args) {
    int a[]={1, 2, 3, 4, 5};
    int b[]={1, 3, 4};
boolean issubset =true;

HashSet<Integer> h= new HashSet<Integer>();

for(int num: a){
  h.add(num);
}

for(int num : b){
  if(!h.contains(num)){
    issubset=false;
  }
}

if(!issubset){
  System.out.println("b is not a subset of a");
}else{
   System.out.println("b is a subset of a");
}
  }
}