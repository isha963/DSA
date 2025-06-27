import java.util.*;

public class anagram {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter 1st string: ");
    String str1 = sc.nextLine();
    System.out.println("Enter 2nd string: ");
    String str2 = sc.nextLine();
    char []s1 =str1.toCharArray();
    char []s2 = str2.toCharArray();

    if(str1.length()!=str2.length()){
      System.out.println("The strings are not anagram.");
      return;
    }
boolean isanagram =true;
      int a[] =freq(s1);
      int b[] =freq(s2);
      int i=0;int j=0;
    while(i<a.length&& j< b.length){
      if(a[i]!=0 && b[j]!=0){
        if(a[i]!=b[j]){
          isanagram = false;
          break;
        }
      }
      i++;
      j++;
    }

    if(!isanagram){
     System.out.println("The strings are not anagram.");
    }
    else{
      System.out.println("The strings are anagram.");
    }

    sc.close();
    
  }


  static int [] freq(char a[]){
    int freq[]=new int[256];

    for(int i=0;i<a.length;i++){
      freq[(int)a[i]]++;
    }

    return freq;
  }
}
