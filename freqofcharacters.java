import java.util.*;

public class freqofcharacters {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a string: ");
    String str = sc.nextLine();

    int[] freq = new int[256];
    char s [] = str.toCharArray();
    for(int i=0;i<s.length;i++){
      freq[(int)s[i]]++;
    }


    for(int j=0;j<freq.length;j++){
      if(freq[j]!=0){
        char ch =(char)j;
        System.out.println(ch + " " + freq[j]);
    }
    sc.close();
  }
}}


//
